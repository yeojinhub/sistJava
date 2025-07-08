package day0228;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * 1. 소켓을 열어서 서버에 접속 시도 (PORT)
 * 2. 메세지를 읽어들이는 일(Socket)이 무한루프 동작
 * 3. J.T.F 에서 이벤트가 발생하면 메세지를 보내는 일(Socket)
*/
@SuppressWarnings("serial")
public class ThreadChatServer extends JFrame implements ActionListener, Runnable {

	private JTextArea jtaTalkDisplay;
	private JScrollPane jspJtaTalkDisplay;
	private JTextField jtfTalk;
	
	private ServerSocket server;			//포트를 열고, 접속자 소켕르 받는다
	private Socket client;					//접속자 소켓을 받아서 관리하기 위해
	private DataInputStream disReadStream;	//접속자가 보내오는 메세지를 읽어들이기 위한 Stream
	private DataOutputStream dosWriteStream;//접속자에게 메세지를 보내기 위한 스트림
	
	private String nick;//대화명 실행전 입력받기
	
	public ThreadChatServer() {
		super("::::::::::채팅 서버:::::::::::::::");
		
		jtaTalkDisplay=new JTextArea();
		jspJtaTalkDisplay=new  JScrollPane(jtaTalkDisplay);
		jtfTalk=new JTextField();
		jspJtaTalkDisplay.setBorder(new TitledBorder("대화내용"));
		jtaTalkDisplay.setEditable(false);
		jtaTalkDisplay.setBackground(Color.WHITE);
		
		jtfTalk.setBorder(new TitledBorder("대화"));

		add("Center",jspJtaTalkDisplay);
		add("South",jtfTalk);
		
		setBounds(100, 100, 400, 600);
		setVisible(true);
		
		try {
			openServer();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		jtfTalk.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}//windowClosing
			
			@Override
			public void windowClosed(WindowEvent we) {
				try {
					closeServer();
				} catch (IOException ie) {
	
					ie.printStackTrace();
				} //end try catch
			}//windowClosed
		});
		
		jtfTalk.requestFocus();
	}//SmpleChatServer
	
	
	private void closeServer() throws IOException {// 닫기
		if(disReadStream !=null ) {disReadStream.close();}
		if(dosWriteStream !=null ) {dosWriteStream.close();}
		if(client !=null ) {client.close();}
		if(server !=null) {server.close();}
	}// close
	
	/**
	 * 소켓통신.
	 * 서버 소켓을 열고 > 접속자 소켓을 받고 > 대화를 읽거나 보내기위한 스트림을 연결
	 * @throws IOException 
	 */
	public void openServer() throws IOException {
		server=new ServerSocket(55000);// 서버소켓 생성-> 예외날림// 포트열림
		jtaTalkDisplay.setText("서버 가동 중...\n접속자 대기중...\n");
		
		//닉네임 받기(accept전)
		nick =JOptionPane.showInputDialog("대화명을 입력해주세요");
		
		client=server.accept(); //접속자 소켓이 생성되면 회선 확립 (3-way-handshaking)
		//스트림 연결
		jtaTalkDisplay.append("대화상대가 접속하였습니다."); 
		jtaTalkDisplay.append(client.getInetAddress().toString());//누군지 알수 있는건 ip주소
		jtaTalkDisplay.append("\n즐거운 채팅 하세요?\n");
		
		//데이터를 보내고 읽기위한 (소켓)스트림 연결
		disReadStream=new DataInputStream(client.getInputStream());
		dosWriteStream=new DataOutputStream(client.getOutputStream());
		
		//열결되고 - 메시지 읽어야하니깐 무한으로
		Thread t=new Thread(this);
		t.start();

	}//openServer

	/**
	 * 접속자가 보내오는 메세지를 무한루프로 읽어들이기
	 * @throws IOException
	 */
//	private void readMsg() throws IOException {
	@Override
	public void run() {
		String revMsg="";
		try {
			while(true) {
				revMsg=disReadStream.readUTF();
				jtaTalkDisplay.append(revMsg);
				jtaTalkDisplay.append("\n");
				scrollMove();
			} //end while
		} catch(IOException ie) {
			jtaTalkDisplay.append("대화 상대가 연결을 끊었습니다.");
			 scrollMove();
			ie.printStackTrace();
		} //end tryCatch
	} //run
	
	/**
	 * ScrollBar 를 가장 아랫줄 이동
	 */
	public void scrollMove() {
//		vertical scroll 의 값을 변경
		jspJtaTalkDisplay.getVerticalScrollBar().setValue(
				jspJtaTalkDisplay.getVerticalScrollBar().getMaximum());
	} //scrollMove
	
	private void sendMsg() throws IOException {
		String sendMsg=jtfTalk.getText();//텍스트필드에서 대화를 가져와서
		StringBuilder sendData=new StringBuilder();
		sendData.append("[").append(nick).append("]").append(sendMsg);
		//작성한 대화를 내 대화창에 올리고 (내가 보낸거 내가 보이게)
		jtaTalkDisplay.append(sendData.toString());
		jtaTalkDisplay.append("\n");
		scrollMove();
		
		//대화상대에게 대화를 보낸다
		dosWriteStream.writeUTF(sendData.toString());//스트림에 기록하고
		dosWriteStream.flush();//스트림에 내용을 목적지(소켓)로 분출
		jtfTalk.setText("");//대화 입력이 편하도록 JTF초기화
	}//sendMsg
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 발생했을 때 메시지를 보내기
		try {
			sendMsg();
		} catch (IOException e1) {
			e1.printStackTrace();
		} //end try catch
	}//actionPerformed

	public static void main(String[] args) {
		new ThreadChatServer();
	}//main

}//class

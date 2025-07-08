package day0227;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
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
public class SmpleChatServer extends JFrame implements ActionListener {

	private JTextArea jtaTalkDisplay;
	private JScrollPane jspJtaTalkDisplay;
	private JTextField jtfTalk;
	
	
	public SmpleChatServer() {
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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}//windowClosing
		});
		
		jtfTalk.requestFocus();
	}//SmpleChatServer
	
	
	/**
	 * Server Socket 을 열고 > 접속사 소켓을 받고 > 대화를 읽거나 보내기위한 Stream 연결
	 */
	public void openServer() {
		
	} //openServer
	
	/**
	 * 접속자가 보내오는 메세지를 무한루프로 읽어들이기
	 */
	public void readMsg() {
		
	} //readMsg
	
	@Override
	public void actionPerformed(ActionEvent e) {

	}//actionPerformed

	public static void main(String[] args) {
		new SmpleChatServer();
	}//main

}//class

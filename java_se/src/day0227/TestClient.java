package day0227;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class TestClient {

	public TestClient() throws UnknownHostException, IOException {
//		2. 서버의 ip address 와 서버의 PORT Socket 생성
//		자신 컴퓨터의 임의의 포트를 열고 서버에 접속을 시도
		Socket client=null;
//		접속자에게 보내줄 메세지를 기록할 출력 Stream
		DataInputStream dis=null;
//		접속자가 보내오는 메세지를 읽어들일 입력 Stream
		DataOutputStream dos=null;
		try {
//			친구의 IP
			String connectIP=
					JOptionPane.showInputDialog("접속할 서버 ip\n68~98번까지 가능", "192.168.10");
			client=new Socket(connectIP, 65000);
			System.out.println("서버에 접속 : "+client);
//			Server 가 제공하는 메세지 받기 (입력 InputStream 필요)
			dis=new DataInputStream(client.getInputStream());
//			Socket 에 연결된 Stream 에서 데이터 읽기
			String revMsg=dis.readUTF();
			
			String sendMsg=JOptionPane.showInputDialog(revMsg);
//			메세지를 서버로 전송하기 위한 출력스트림을 소켓으로부터 얻기
			dos=new DataOutputStream(client.getOutputStream());
//			메세지를 Stream 에 기록
			dos.writeUTF(sendMsg);
//			메세지의 내용을 목적지로 분출
			dos.flush();
			

		} finally {
			if(client!=null) {
				client.close();
			} //end if
		} //end try finally
		
	} //TestClient

	public static void main(String[] args) {

		try {
			new TestClient();
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		} catch(IOException ie){
			ie.printStackTrace();
		}//end try catch
	} //main

} //class

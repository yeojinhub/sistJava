package day0227;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public TestServer() throws IOException{
		ServerSocket server=null;
//		접속자에게 보내줄 메세지를 기록할 출력 Stream
		DataOutputStream dos=null;
//		접속자에게 보내줄 메세지를 기록할 입력 Stream
		DataInputStream dis=null;
		Socket client=null;
		try {
//			1. ServerSocket 생성 : PORT 가 열림
			server=new ServerSocket(65000);	//2. Port 선점
			System.out.println("서버 실행중");
//			3. 접속자 소켓을 허가하여 받는다.
//			접속자에게 보낼 메세지
			String sendMsg="85번의 서버로 접속완료. ㅎㅇ?";
//			사용자가 원할 때 서버를 벗어날 수 있음
			while(true) {
				client=server.accept();	//blocking method
				System.out.println("접속자 있음 : "+client);
//				접속자 Socket 으로부터 출력 Stream 얻기
				dos=new DataOutputStream(client.getOutputStream());
//				Socket 에 메세지 기록
				dos.writeUTF(sendMsg);
//				Stream 의 데이터값을 목적지 Socket 으로 분출
				dos.flush();
				
//				접속자가 보내오는 메세지를 소켓으로부터 읽어들인 입력 Stream
				dis=new DataInputStream(client.getInputStream());
				System.out.println("접속자의 메세지 : "+dis.readUTF());
			} //end while
		} finally {
			if(dos!=null) {
				dos.close();
			} //end if
			if(client!=null) {
				client.close();
			} //end if
			if(server!=null) {
				server.close();
			} //end if
		} //end try finally
	} //TestSerever
	
	public static void main(String[] args) {
	
		try {
			new TestServer();
		} catch (IOException e) {
			e.printStackTrace();
		} //end try catch
	} //main

} //class

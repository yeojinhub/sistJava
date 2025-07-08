package day0228;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 1. Runnable 구현, Sleep 구현
 */
@SuppressWarnings("serial")
public class UseSleep extends JFrame implements Runnable{

	private JLabel jlbl;
	private SimpleDateFormat sdf;
	
	public UseSleep() {
		super("지금 시간은?");
		
		sdf=new SimpleDateFormat("yyyy-MM-dd EEE hh:mm:ss");
		jlbl=new JLabel(sdf.format(new Date()), JLabel.CENTER);
		jlbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		add("Center", jlbl);
		
		setBounds(10, 10, 500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //UseSleep
	
	/**
	 * 2. run() method Override
	 */
	@Override
	public void run(){
//		3. 동시에 실행되어야할 코드 정의
		try {
			while(true) {
				System.out.println();
				jlbl.setText(sdf.format(new Date()));
//				1000 : 1초 뒤에 실행
				Thread.sleep(1000);	//running <-> block
			} //end while
//			for(int i=0; i<10; i++) {
//				System.out.println(i);
////				1000*60*60 : 1시간 뒤에 실행, 1000*60*60*24 : 하루 뒤에 실행
//				Thread.sleep(1000);	//running <-> block
//			} //end for
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		} //end try catch
	} //run
	
	public static void main(String[] args) {
//		4. Thread 로 돌려야하는 class 객체화
		UseSleep us=new UseSleep();
//		5. Thread class 와 has a 설정
		Thread t=new Thread(us);
//		6. Thread 객체에 start()
		t.start();
		
	} //main

} //class

package day0228;

import java.util.Random;

/**
 * 
 */
public class UseSleep2 implements Runnable {

	/**
	 * 2. Override
	 */
	@Override
	public void run() {
		System.out.print("Loading");
//		3. Thread 로 동작해야할 코드(동시에 실행)
		Random r=new Random();
		try {
			for(int i=0; i<15; i++) {
				System.out.print(" . ");
				Thread.sleep(100*r.nextInt(10));	//running <-> block
			} //end for
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		} //end try catch
		System.out.print("finish");
	} //run
	
	public static void main(String[] args) {
//		4. Runnable 을 구현한 class 를 객체화
		UseSleep2 ur=new UseSleep2();
//		5. Thread class 를 Runnable 구현한 class 와 has a 관계로 객체화
		Thread t=new Thread(ur);
//		6. Thread 객체의 start() 호출
		t.start();
		
	} //main

} //class

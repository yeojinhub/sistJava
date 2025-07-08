package day0228;

/**
 * Runnable 구현 class
 */
public class UseRunnable implements Runnable {

	/**
	 * 2. Override
	 * 3. Thread 로 동작해야할 코드(동시에 실행)
	 */
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println("run method i===="+i);
		} //end for
	} //run
	
	public void method() {
		for(int i=0; i<500; i++) {
			System.out.println("method i----"+i);
		} //end for
	} //method
	
	public static void main(String[] args) {
//		4. Runnable 을 구현한 class 를 객체화
		UseRunnable ur=new UseRunnable();
//		5. Thread class 를 Runnable 구현한 class 와 has a 관계로 객체화
		Thread t=new Thread();
//		6. Thread 객체의 start() 호출
		t.start();
		ur.method();
	} //main

} //class

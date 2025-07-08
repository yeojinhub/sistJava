package day0207;

import day0205.Clark;
import day0205.Fly;

/**
 * Fly interface 를 사용하는 예제
 */
public class Anony {
	
	public void useFly(Fly fly) {
		System.out.println("앙력 : " +fly.lift());
		System.out.println("추진력 : "+fly.thrust());
	} //useFly

	public static void main(String[] args) {
//		useFly method 호출
		Anony an=new Anony();
//		인터페이스는 객체화될 수 없지만 구현클래스의 객체주소는 저장가능
//		Clark = Fly
		Clark supermen=new Clark();
		an.useFly(supermen);
		FlyImplement fi=new FlyImplement();
		an.useFly(fi);
		
		System.out.println("==================================");
//		구현 클래스를 별도로 생성하지 않고, 이름이 없는 클래스를 생성하여 arguments 로 입력가능
		an.useFly(new Fly() {

			@Override
			public String lift() {
				return "";
			}

			@Override
			public String thrust() {
				return "";
			}
			
		});

	} //main

} //class

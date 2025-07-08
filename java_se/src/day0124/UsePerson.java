package day0124;

public class UsePerson {

	public static void main(String[] args) {
//		객체 생성 -> 클래스의 instance 변수가 초기화
		Person hd = new Person();
		
//		hd.setEye(2);
//		hd.setNose(1);
//		hd.setMouth(1);
		hd.setName("양희동");
		System.out.printf("%s의 눈 %d개, 코 %d개, 입 %d개\n",hd.getName(), hd.getEye(), hd.getNose(), hd.getMouth());
//		기능을 사용
		System.out.println(hd.eat());
		System.out.println(hd.eat("돈까스", 10000));
		
//		미니언을 객체로 생성
		Person mini=new Person(2,0,1);
		
//		mini.setEye(1);
//		mini.setNose(0);
//		mini.setMouth(1);
		mini.setName("미니언");

		System.out.printf("%s의 눈 %d개, 코 %d개, 입 %d개\n",mini.getName(), mini.getEye(), mini.getNose(), mini.getMouth());
		
		System.out.println(mini.eat());
		System.out.println(mini.eat("김밥", 5000));
		
//		자신의 객체를 생성하고, 기능을 사용하는 코드 작성
		Person yj=new Person();
		yj.setEye(2);
		yj.setNose(1);
		yj.setMouth(1);
		yj.setName("이여진");
		
		System.out.println(yj.eat());
		System.out.println(yj.eat("커피", 1200));
	} //main

} //class

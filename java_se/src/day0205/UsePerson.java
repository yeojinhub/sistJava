package day0205;

/**
 * 사람의 공통특징은 부모클래스로부터 사용,
 * 자신만의 특별한 기능을 구현한 자식클래스를 사용하는 클래스
 * (코드의 재사용성)
 */
public class UsePerson {

	public static void main(String[] args) {
//		자식클래스를 생성하면 자식클래스의 객체명으로 부모클래스의 변수나 method 를 사용가능
		HongGilDong hd=new HongGilDong();
		Clark supermen=new Clark();
		
		hd.setName("홍길동");				//부모클래스가 가진 method
		supermen.setName("클락 켄트"); 	//부모클래스가 가진 method
		
		System.out.printf("%s의 눈 %d, 코 %d, 입 %d\n",
				hd.getName(), hd.getEye(), hd.getNose(), hd.getMouth());
		System.out.printf("%s의 눈 %d, 코 %d, 입 %d\n",
				supermen.getName(), supermen.getEye(),
				supermen.getNose(), supermen.getMouth());
		
//		부모가 제공하는 일
		System.out.println(hd.eat());
		System.out.println(supermen.eat());
		System.out.println(hd.eat("막걸리", 10));			//10전 가격이 안맞음
		System.out.println(supermen.eat("스테이크", 10)); 	//10$ 가격이 안맞음
		
//		자식만이 할 수 있는 기능
		System.out.println(hd.fight(5));	//6->7
		System.out.println(hd.fight(6));	//7->8
		System.out.println(hd.fight(8));	//8
		System.out.println(hd.fight(9));	//8->7
		System.out.println(hd.fight(7));	//7
		System.out.println(hd.getLevel());	//7
		
		System.out.println(supermen.power("짱돌"));
		System.out.println(supermen.power("다이아몬드"));
		System.out.println(supermen.power("크립토나이트"));
		System.out.println(supermen.power);
		
//		객체다형성 : 같은 이름의 객체를 다르게 사용하는 것
		Person p=hd.getPerson();
		Person p2=supermen.getPerson();
		System.out.println("객체다형성");
		System.out.println(p.eat("국밥",5));
		System.out.println(p2.eat("바게트",5));
		
		System.out.println("===========인터페이스에서 구현한 method 호출===========");
		System.out.printf("%s은 날기 위해서 추진력을 %s\n",
				supermen.getName(), supermen.thrust());
		System.out.printf("%s은 날기 위해서 양력을 %s\n",
				supermen.getName(), supermen.lift());
		
	} //main
	
} //class

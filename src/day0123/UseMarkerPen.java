package day0123;

/**
 * MakerPen class 객체 생성하여 객체가 제공하는 기능을 사용하는 클래스
 */
public class UseMarkerPen {

	public static void main(String[] args) {
		System.out.println(args);
//		4. 객체 생성
		MarkerPen black = new MarkerPen();
		
//		생성된 MakerPen 객체에 검은색을 설정
//		mp.cap=20; //변수의 접근 지정자가 private 형으로 접근 불가
//		-> setter method 사용하여 접근가능
		
		black.setCap(1);
		black.setBody(1);
		black.setColor("노랑");
		
		System.out.println("Markerpen 객체가 가진 값 ");
		System.out.println("뚜껑 "+black.getCap()+", 몸체 "+black.getBody()+", 색깔 "+black.getColor());
//		MarkerPen 객체가 가진 값을 printf 출력
		System.out.printf("뚜껑 %d, 몸체 %d, 색깔 %s\n", black.getCap(),black.getBody(), black.getColor());
		
//		5. 객체 사용
		String result = black.write("안녕하세요");
		System.out.println(result);
		
		System.out.println("-----------------------------");
		
//		파랑색 마카펜을 생성하고, 칠판에 "오늘도 수고 많으셨습니다"를 출력
		MarkerPen blue=new MarkerPen(2,2,"파랑");

//		blue.setCap(1);
//		blue.setBody(1);
//		blue.setColor("파랑");
		
		result=blue.write("오늘도 수고 많으셨습니다}");
		System.out.println(result);
		
		System.out.println(black);
		System.out.println(blue);
	} //main

} //class

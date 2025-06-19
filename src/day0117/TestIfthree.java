package day0117;

/**
 * 문자열 비교
 */
public class TestIfthree {

	public static void main(String[] args) {

//		if(args[0].equals("Java") || args[0].equals("java")) {
//			System.out.println("WORA, OOP언어, 메모리 관리 편의성");
//			
//		}
		if("Java".equals(args[0]) || "java".equals(args[0])) {
			System.out.println("WORA, OOP언어, 메모리 관리 편의성");
		}
		
//		main method의 두번째 arguments 에 (args[1]) 입력받은 값을 정수로 저장하여
//		0~100사이인 경우에만 "xx점은 유효한 정수입니다." 출력
		
		int score=Integer.parseInt(args[1]);
		if(score>=0 && score<=100) {
			System.out.println(score+"점은 유효한 정수입니다.");			
		}
		
	} //main

} //class

package day0207;

/**
 * 긴 문자열을 다루기.
 * StringBuffer, StringBuilder: 문자열을 heap에 생성하고, method를 호출하면 
 * head 생성된 문자열에 직접 작업을 한다.긴 문자열을 작업(+) 할 때 속도가 String보다 빠르다. 
 */
public class UseStringBuilder {
	
	public void useStringBuiler() {
		//1.생성
		StringBuilder sb=new StringBuilder();
		
		//2.method호출)
		//값을 추가 : 기존의 값 뒤에 붙기 때문에 원본 문자열이 계속 변경된다.
		sb.append("안녕 하세요?");
		sb.append(25).append("년");
		
//		값 삽입 : insert(시작인덱스, 추가할 값)
		sb.insert(7, "올해는 ");
		
//		값 삭제 : delete(시작인덱스, 끝인덱스+1)
		sb.delete(2, 6);
		
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
	}//UseStringBuilder
	
	public void useStringBuffer() {
		
		//1.생성
				StringBuilder sb=new StringBuilder();
				
				//2.method호출)
				//값을 추가 : 기존의 값 뒤에 붙기 때문에 원본 문자열이 계속 변경된다.
				sb.append("안녕 하세요?");
				sb.append(25).append("년");
				
//				값 삽입 : insert(시작인덱스, 추가할 값)
				sb.insert(7, "올해는 ");
				
//				값 삭제 : delete(시작인덱스, 끝인덱스+1)
				sb.delete(2, 6);
				
				System.out.println(sb);
				sb.reverse();
				System.out.println(sb);
				
	} //useSTringBuffer
	
	

	public static void main(String[] args) {
		UseStringBuilder usb= new UseStringBuilder();
		System.out.println("-----------StringBuilder 사용--------------");
		usb.useStringBuiler();
		
		System.out.println("-----------StringBuffer 사용--------------");
		usb.useStringBuffer();
		
	}//main

}//class

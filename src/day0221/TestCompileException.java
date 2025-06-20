package day0221;

/**
 * 개발자가 코드 작성시 반드시 예외처리 문법을 기술해야하는 예외처리 예제
 */
public class TestCompileException {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {
			Class c=Class.forName("day0221.TestRunTimeException");
			System.out.println("로딩된 클래스 "+c);
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	} //main

} //class

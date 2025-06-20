package day0221;

/**
 * main method 에서 입력된 arguments 두개를 입력받아
 * 두 수를 나누는 일을 하는 클래스
 * 입력받고 연산하는 과정에서 예외처리
 */
public class TestRunTimeException {

	public static void main(String[] args) {
		
		try {
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			
			int result=num1/num2;
			
			System.out.println(num1+"/"+num2+"="+result);
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			System.err.println("오류 메세지 : "+aioobe.getMessage());
			System.err.println("예외처리 메세지와 간단한 메세지  : "+aioobe.toString());
			System.out.println("죄송합니다.");
			System.out.println("실행법 ) java TestRunTimeException 값 값");
		}catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			System.out.println("죄송합니다.");
			System.out.println("값은 숫자 형태로만 입력해주세요");
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println("값은 양수 형태로만 입력해주세요");
		}catch(Exception e) {
			System.out.println("개발자가 인식하지 못한 예외가 발생했습니다");
		}finally {
			System.out.println("프로그램을 사용해주셔서 감사합니다");
		} //end try catch
		
	} //main

} //class

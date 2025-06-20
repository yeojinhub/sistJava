package day0207;

/**
 * 안쪽 클래스를 지역변수처럼 사용할 때.
 */
public class Local {
	
	int outI;
	
	public Local() {
		System.out.println("바깥 클래스의 생성자");
	}//Local
	
	public void methodA(int paramA, int paramB) {
		int localA=0;
		int localB=0;
		
//		paramA=16;
//		localA=11;
		
		/////////////지역클래스 시작////////////
		class Inner{
			int i;
			public Inner() {
				System.out.println("Local 클래스 생성자");
			}
			public void method() {
				System.out.println("method호출"+i);
				//외부클래스의 (instance 변수, method)는 사용가능
				System.out.println(outI);
				//JDK1.8에서는 Local class에서 사용하는 parmeter나 local variable에는
				//final 접근지정자가 설정되어있다고 간주한다. 
				//값 사용은 가능하나 값할당은 할 수 없다.
//				paramA=11;
//				localA=16;
				
				System.out.println("param A:"+ paramA+ ", paramB:"+ paramB);
				System.out.println("지역변수 localA:"+ localA+ ", localB:"+ localB);
			}
		}
		/////////////지역클래스 끝//////////////
		//생성
		Inner in =new Inner();
		in.i=20;
		in.method();
		
	}//methodA

	public static void main(String[] args) {
		//바깥 클래스를 객체화
		Local lo=new Local();
		lo.methodA(2, 7);
		
	}//main
	

}//class

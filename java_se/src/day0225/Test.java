package day0225;

/**
 * 
 */
public class Test {

	public Test() {
		int sum=0;
		for(int i=1; i<101; i++) {
			sum+=i;
		} //end for
		System.out.println(sum);
	} //Test
	
	public static void main(String[] args) {
		new Test();
	} //main

} //class

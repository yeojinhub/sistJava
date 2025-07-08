package day0220;

public class Test {
	
	public Test() {
		super();
	} //Test

	public static void main(String[] args) {
		new Test();
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[5]=50;
		
		try {
			Class.forName("java.lnag.String");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} //end try catch
	} //main

} //class

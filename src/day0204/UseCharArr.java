package day0204;

/**
 * char 형으로 배열을 만들고, 출력하면 주소가 아닌 배열의 값이 그대로 출력되는 예제
 */
public class UseCharArr {

	public static void main(String[] args) {
		double[] dArr=new double[4];
		boolean[] bArr= {true, false};
		String[] sArr= {"안녕", "오늘은 화요일", "입니다."};
		
		System.out.println(dArr);
		System.out.println(bArr);
		System.out.println(sArr);
		
		char[] cArr= {'이','것','이','자','바','다','!'};
		for(int i=0; i<cArr.length; i++) {
			System.out.print(cArr[i]);
		} //end for
		System.out.println(cArr);
	} //main

} //class

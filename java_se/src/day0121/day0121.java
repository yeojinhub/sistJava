package day0121;

/**
 * 아래와 같은 형태로 출력
 * 0
 *  1
 *   2
 *    3
 *     4
 *      5
 */
public class day0121 {

	public static void main(String[] args) {

		for(int i=0; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");				
			}
			System.out.println(i);
		} //end for
		
	} //main

} //class

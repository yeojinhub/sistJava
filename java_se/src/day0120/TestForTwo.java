package day0120;

/**
 * 다중 for : 바깥 for가 한번 반복, 안쪽 for는 몇번 반복하는지 출력
 * 
 * for(초기값; 조건식; 증,감소식) {
 *  단일 for 영역
 *  for(초기값; 조건식; 증,감소식) {
 *   다중 for 영역
 *  }
 *  단일 for 영역
 * }
 */
public class TestForTwo {

	public static void main(String[] args) {

		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("i : "+i+", j : "+j);
			} //end for
			System.out.println("-----------------");
		} //end for

		for(int dan=2; dan<10; dan++) { //단
			System.out.println(dan+"단 시작");
			for(int num=1; num<10; num++) { //곱하는 수
				System.out.println(dan+"x"+num+"="+dan*num);
			} //end for
		} //end for

	} //main

} //class

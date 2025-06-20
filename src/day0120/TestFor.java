package day0120;

/**
 * for : 시작과 끝을 알 때 사용하는 반복문
 * for (초기값 ; 조건식; 증,감소식){
 *  처리 문장
 * }
 */
public class TestFor {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println("안녕하세요?"+i);
		} //end for
		
		System.out.println("-----------1부터 100까지 출력------------");
//		1에서부터 100까지 1씩 증가하는 값을 옆으로 출력
		for(int i=1; i<101; i++) {
		 System.out.print(i+ " ");
		}

		int cnt = 0;

		System.out.println("\n----------짝수 출력------------");
//		1에서부터 100까지 짝수만 출력
		for(int even=1; even<101; even++) {
			if(even%2==0) {
				System.out.print(even+ " ");				
				cnt++;
			} 
		} //end for
		System.out.println("\n"+cnt+"번 수행");

		System.out.println("----------홀수 출력------------");
//		1에서부터 100까지 홀수만 출력
		for(int odd=1; odd<101; odd++) {
			if(odd%2==1) {
				System.out.print(odd+ " ");				
			} 
		} //end for
		
		System.out.println("\n----------대문자 출력------------");
//		알파벳 대문자 출력
		for(char upper='A'; upper<91; upper++) {
			System.out.print(upper+ " ");
		} //end for
		System.out.println("\n----------소문자 출력------------");
//		알파벳 소문자 출력
		for(char lower='a'; lower<123; lower++) {
			System.out.print(lower+ " ");
//			System.out.print((char)(lower+32));
		} //end for

		System.out.println("\n----------1-100까지의 합계 출력------------");
//		1부터 100까지의 합계 출력
		int sum=0;
		for(int i=0; i<101; i++) {
			sum+=i;
		} //end for
		System.out.println(sum);

		System.out.println("----------2의 구구단 출력------------");
//		구구단 2단 출력
		for(int i=2; i<10; i++) {
			System.out.println("2x"+i+"="+2*i);
		} //end for

		System.out.println("----------대문자 정순, 소문자 역순 출력------------");
//		알파벳 대소문자 출력
		char upper=65, lower=122;
		for(int num=0; num<26; num++) {
				System.out.print(upper++ +"("+lower-- +") ");
		} //end for

		int multiplicationTable=Integer.parseInt(args[0]);
		if(multiplicationTable>1 && multiplicationTable<10) {
			for (int i=1; i<10; i++){
				System.out.println(multiplicationTable+"x"+i+"="+multiplicationTable*i);
			}
		}
		
	} //main

} //class

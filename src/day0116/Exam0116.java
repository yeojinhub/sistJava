package day0116;

public class Exam0116 {

	public static void main(String[] args) {

//		두개의 정수 중 큰 값을 찾아내기
		int i=9, j=10;
		System.out.println(i+"와 "+j+" 중 큰 값은 "+(i>j? i:j)+"입니다.");

//		세개의 정수 중 가장 작은 값 찾아내기
		int k=12;
		System.out.println(i+"와 "+j+"와 "+k+" 중 가장 작은 값은 "+(i>j?(j>k? k: j): i )+"입니다.");
		
//      결과값 관련하여 이유 작성하기
		int temp=10, temp2=20;
		System.out.println(++temp + temp2--); //temp2는 후위 연산자 이기 때문에 출력 당시 temp2=20
		System.out.println("temp : "+temp+", temp2 :"+temp2); //따라서 출력 전 temp2=19가 됨
		
//		Integer.MAX_VALUE Constant를 사용하여 하위 2byte값이 출력되도록 비트 논리 연산자 활용 (결과:65535)
		System.out.println(Integer.MAX_VALUE & 0xFFFF);
//		0111 1111 1111 1111 1111 1111 1111 1111
//		0000 0000 0000 0000 1111 1111 1111 1111
	}

}

package day0203;

/**
 * 일차원 배열 : 열로만 구성된 배열
 */
public class UseArray1 {

	public UseArray1() {
//		1. 선언 : 데이터형[] 배열명=null;
		int[] arr=null;
//		int arr2[]=null; //배열 기호는 데이터형 뒤에 작성하는 것을 권장
		
//		2. 생성 : 배열명=new 데이터형[방의 수]; //heap 생성, 모든방 초기화, 크기 변경 X
		arr=new int[5];
		System.out.println("arr 배열의 주소 : "+arr+", 방의 개수 : "+arr.length);
		
//		3. 값 할당 : 배열명[방의 번호]=값;
		arr[0]=2024;
		arr[1]=11;
		arr[2]=26;
		arr[3]=2;
		arr[4]=1;
		
//		4. 값 사용 : 배열명[방의 번호]
		System.out.printf("arr[0]=%d,arr[1]=%d,arr[2]=%d,arr[3]=%d,arr[4]=%d",
				arr[0],arr[1],arr[2],arr[3],arr[4]);
		
//		일괄처리 : 모든 방의 값을 한번에 처리
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
			sum+=arr[i];
		} //end for
		System.out.println("arr 배열 값의 합계 : "+sum);
		
//		배열의 모든 방의 값을 더한 후 평균 출력
		double ave=sum/(arr.length);
		System.out.printf("arr 배열 값의 평균 : %.2f\n",ave);
		
	} //UseaArray1
	
	public void usePrimitiveType() {
		System.out.println("--------------------");
//		배열에 할당될 값을 알고 있을 때 사용하는 문법
//		학생의 점수를 저장하는 배열을 선언
//		자바점수=75, 오라클점수=89, jdbc 점수=93, HTML 점수=99 할당

//		1. 선언 및 값 할당 : 데이터형[] 배열명 = {값,,,,};
//		int[] scoreArr= new int[]{75,89,93,99};
		int[] scoreArr= {75,89,93,99};
		System.out.println("배열 방의 수 : "+scoreArr.length);
		
//		2. 일괄처리
		int sum=0;
		System.out.println("자바\t오라클\tjdbc\tHTML\t총점\t평균");
		for(int i=0; i<scoreArr.length; i++) {
			System.out.printf("%d\t",scoreArr[i]);
			sum=sum+scoreArr[i];
		} //end for
		System.out.printf("%d\t%d\n",sum,sum/scoreArr.length);
		
//		scoreArr 배열 방의 값을 마지막 방부터 처음 방까지 출력
		System.out.println("HTML\tjdbc\t오라클\t자바");
		for(int index=scoreArr.length-1; index>-1; index--) {
			System.out.printf("%d\t",scoreArr[index]);
		} //end for
		System.out.println();

		System.out.println("-------향상된 for-------");		
		System.out.println("자바\t오라클\tjdbc\tHTML\t총점\t평균");
		sum=0;
		for(int score : scoreArr) {
			System.out.printf("%d\t",score);
			sum+=score;
		} //end for
		System.out.printf("%d\t%d\n",sum,sum/scoreArr.length);
		
//		점수 중 : 최고 점수를 클릭
		int maxScore=scoreArr[0];
		for(int i=0; i<scoreArr.length; i++) {
			if(maxScore<scoreArr[i]) {
				maxScore=scoreArr[i];
			} //end if
		} //end for
		System.out.println("최고 점수 : "+maxScore);
		System.out.println("-------------------");
		
//		75,62,99,83 -> 99,83,75,62
//		앞 방과 다음 방을 비교해서 앞방의 값이 작다면 앞방의 값과 다음 방의 값을 변경한다.
//		앞 방과 그 다음 방을 비교해서 앞방의 값이 작다면 앞방의 값과 그 다음 방의 값을 변경
//		이와 같이 앞방부터 모든 방의 값을 비교해서 끝 방까지 비교가 완료
//		다음 방도 이전 비교와 동일하게 끝 방까지 비교
//		모든 방을 비교하지만 가장 마지막 방은 비교하지 않음
		int temp=0;
		for(int i=0; i<scoreArr.length; i++) {
			for(int j=i+1; j<scoreArr.length; j++) {
				if(scoreArr[i]<scoreArr[j]) {
					temp=scoreArr[i];
					scoreArr[i]=scoreArr[j];
					scoreArr[j]=temp;
				} //end if
			} //end for
		} //end for
		
		for(int tempScore : scoreArr) {
			System.out.print(tempScore+"\t");
		} //end for
		
	} //usePrimitiveType
	
	public static void main(String[] args) {
//		UseArray1 ua=new UseArray1();
//		ua.usePrimitiveType();
		
//		객체 생성 후 method 를 하나만 호출하는 경우
//		new 생성자().method 이름();
		new UseArray1().usePrimitiveType();
	} //main

} //class

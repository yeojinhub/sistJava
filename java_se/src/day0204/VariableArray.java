package day0204;

/**
 * 가변 배열 예제
 */
public class VariableArray {
	
	public VariableArray() {
//		1. 선언 : 데이터형[][] 배열명=null;
		int[][] arr=null;
		
//		2. 생성 : 배열명=new 데이터형[행의수][];	//열의 수를 설정하지 않음
		arr=new int[5][];
		
//		3. 행마다 열의 생성 : 배열명[행의번호]=new 데이터형[열의 수];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[] {1,2,3,4,5};
		arr[3]=new int[] {1};
		arr[4]=new int[] {10,20,30,40};
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]행 열의 수 : %d개\n",i, arr[i].length);
		} //end for
		
//		4. 값 할당 : 배열명[행의번호][열의번호]=값;
		arr[0][0]=10;
		arr[1][1]=10;
		arr[2][3]=50;
		
//		5. 값 사용 : 배열명[행의번호][열의번호]
		for(int[] oneArr:arr) {			//2차원 배열의 한 행은 1차원 배열로 이루어짐
			for(int value : oneArr) {	//1차원 배열의 방은 단일 형으로 이루어짐
				System.out.printf("%d\t", value);
			} //end 2nd for
			System.out.println();
		} //end 1st for
		
	} //VariableArray

	public static void main(String[] args) {
		new VariableArray();
	} //main

} //class

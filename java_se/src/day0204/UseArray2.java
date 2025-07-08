package day0204;

/**
 *  행과 열로 구성된 2차원 배열
 */
public class UseArray2 {

	public UseArray2() {
//		1. 선언 		: 데이터형[][] 배열명=null;
//		int[][] arr=null;
		
//		2. 생성 		: 배열명=new 데이터형[행의수][열의수];
//		arr=new int[3][4];			//모든 방의 값은 초기화된다.
		
//		선언과 생성을 동시에
		int[][] arr2=new int[3][4]; //모든 방의 값은 초기화된다.
		
		System.out.printf("arr2 배열의 행의 수 : %d, 열의 수 : %d\n",
				arr2.length, arr2[0].length);
		
//		3. 값 할당	: 배열명[행의번호][열의번호]=값;
		arr2[0][0]=2024;
		arr2[0][1]=11;
		arr2[0][2]=26;
		arr2[0][3]=15;
		
//		4. 값 사용	: 배열명[행의번호][열의번호];
		System.out.println("arr[0][0] = "+arr2[0][0]);
		System.out.println("arr[0][1] = "+arr2[0][1]);
		System.out.println("arr[0][2] = "+arr2[0][2]);
		System.out.println("arr[0][3] = "+arr2[0][3]);
		System.out.println("arr[2][0] = "+arr2[2][0]);
		System.out.println("arr[2][1] = "+arr2[2][1]);
		System.out.println("arr[2][2] = "+arr2[2][2]);
		System.out.println("arr[2][3] = "+arr2[2][3]);
		
//		일괄 처리 : 인덱스가 2개(행,열) 필요
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("arr2[%d]행 시작\n",i);
			for(int j=0; j<arr2[i].length; j++) {
				System.out.printf("arr2[%d][%d]=%-5d",i,j,arr2[i][j]);
			} //end for
			System.out.printf("\narr2[%d]행 끝\n",i);
		} //end for
		
//		2차원 배열의 한 행은 1차원 배열로 이루어져 있음
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
//		2차원 배열의 한 행을 1차원 배열에 할당할 수 있음
		int[] tempArr=arr2[0];
		
//		1차원 배열의 값을 2차원 배열의 행에 할당 가능
		arr2[2]=tempArr;
		for(int value : arr2[2]) {
			System.out.println(value);
		} //end for
		
		System.out.println("-------향상된 for-------");
		
		for(int[] arr1 : arr2) {	//행 : 2차원 배열의 한 행은 1차원 배열로 이루어짐
			for(int value : arr1) {	//열 : 1차원 배열의 한 열은 단일형으로 이루어짐
				System.out.printf("%d\t", value);
			} //end for
			System.out.println();
		} //end for
		
	} //UseArray2
	
	public static void main(String[] args) {
		new UseArray2();
	} //main

} //class

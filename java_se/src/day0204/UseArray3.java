package day0204;

/**
 * 3차원 배열
 */
public class UseArray3 {
	
	public UseArray3() {
//		1. 선언 : 데이터형[][] 배열명=null;
//		int [][][] arr3=null;
		
//		2. 생성 : 배열명=new 데이터형[면의수][행의수][열의수];
//		arr=new int[3][5][6];
		int [][][] arr3=new int[3][5][6];		
		
//		3. 값 할당 : 배열명[면의번호][행의번호][열의번호]=값;
		System.out.printf("면 %d 행 %d 열 %d\n",
				arr3.length, arr3[0].length, arr3[0][0].length);
		
//		4. 값 사용 : 배열명[면의번호][행의번호][열의번호];
		for(int i=0; i<arr3.length; i++) { 					//면
//			System.out.printf("arr3[%d]면 시작\n", i);
			
			for(int j=0; j<arr3[i].length; j++) { 			//행
//			System.out.printf("arr3[%d][%d]행 시작\n", i,j));
				
				for(int k=0; k<arr3[i][j].length; k++) { 	//열
					if(j==0 || j==arr3[i].length-1 || k==0 || k==arr3[i][j].length-1) {
						arr3[i][j][k]=1;
					} //end if
//				System.out.printf("arr3[%d][%d][%d]=%-5d", i,j,k,arr3[i][j][k]));
					System.out.printf("%d\t", arr3[i][j][k]);
				} //end for
				System.out.println();
//			System.out.printf("\narr[%d][%d]행 끝\n", i,j);
			} //end for
			
			System.out.println();
//			System.out.println("arr3[%d]면 끝\n",i);
		} //end for
		
//		삼차원 배열의 기본형 형식의 사용
//		면 구분 괄호와, 행 구분 괄호를 사용
		int [][][] arr= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		
		System.out.printf("%d면 %d행 %d열\n",arr.length, arr[0].length, arr[0][0].length);

//		향상된 for
		for(int[][] twoArr : arr) {			//3차원 배열의 한 면은 2차원 배열로 이루어져 있음
			for(int [] oneArr : twoArr) {	//2차원 배열의 한 행은 1차원 배열로 이루어져 있음
				for(int temp : oneArr) {	//1차원 배열은 단일 형으로 이루어져 있음
					System.out.printf("%d\t", temp);
				} //end 3rd for
				System.out.println();
			} //end 2nd for
			System.out.println();
		} //end 1st for
		
	} //UseArray3
	
	public static void main(String[] args) {
		new UseArray3();
	} //main

} //class

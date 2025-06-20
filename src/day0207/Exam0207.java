package day0207;

/**
 * 로또번호
 * 1-45 사이의 숫자 6개를 난수로 만들어서
 * int[] 배열에 젖아하고 반환하는 method 작성
 * (중복 값을 배제)
 * int[] 을 입력받아 출력하는 일
 */
public class Exam0207 {

	/**
	 * 1-45 사이의 숫자 6개를 난수로 만들어서 배열에 저장하는 method
	 * @return numArr 6개 난수값이 저장된 int 형 배열 반환
	 */
	public int[] setNumber() {
		int[] numArr=new int[6];
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=(int)(Math.random()*45);
			
			for(int j=0; j<i; j++) {
				if(numArr[i]==numArr[j]) {
					i--;
					break;
				} //end if
			} //end 2nd for
		} //end 1st for			
			return numArr;
	} //setNumber
	
	/**
	 * int[] 배열을 입력받아 출력하는 method
	 * @param tempInt 입력받은 int 형 배열
	 */
	public void printMsg(int[] tempInt) {
		for(int i=0; i<tempInt.length; i++) {
			System.out.printf("%d ",tempInt[i]);
		} //end for
		System.out.println();
	} //printMsg
	
	/**
	 * 배열의 값을 오름차순으로 정렬하는 method
	 * @param ascArr 입력받은 int 형 배열
	 * @return 
	 */
	public int[] ascArray(int[] ascArr) {
		for(int i=0; i<ascArr.length; i++) {
			for(int j=i+1; j<ascArr.length; j++) {
				if(ascArr[i]>ascArr[j]) {
					int temp=ascArr[i];
					ascArr[i]=ascArr[j];
					ascArr[j]=temp;
				} //end if
			} //end 2nd for
		} //end 1st for
		return ascArr;
	} //ascArray

	public static void main(String[] args) {
		System.out.println("이번주 로또번호 6자리");
		
		Exam0207 ex=new Exam0207();
		int[] numArr=ex.setNumber();
		numArr=ex.ascArray(numArr);
		ex.printMsg(numArr);
	} //main

} //class

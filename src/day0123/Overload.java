package day0123;

/**
 * Polymorphism 다형성
 *  클래스 안에서는 같은 이름의 method 를 하나만 정의가능
 */
public class Overload {

	/**
	 * 별 하나를 출력
	 */
	public void printStar() {
		System.out.println("*");
	} //printStar
	
	/**
	 * 별을 입력한 개수로 출력
	 * @param starCnt 출력할 별의 개수
	 */
	public void printStar(int starCnt) {
		for(int i=0; i<starCnt; i++) {
			System.out.print("*");
		} //end for
	} //printStar
	
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.printStar();
		ol.printStar(2);
		
	} //main

} //class

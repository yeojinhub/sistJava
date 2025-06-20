package day0124;

/**
 * 주소전달 : heap 의 주소(유일)를 저장하고 있는 객체를 매개변수로 선언하면 유일한 주소가 전달
 */
public class Reference {
	int i;
	int j;
	
	public void swap(Reference r) {
		int temp=0;
		temp=r.i;
		r.i=r.j;
		r.j=temp;
		System.out.printf("swap method 내부 i=%d, j=%d\n", i, j);
	} //swap

	public static void main(String[] args) {
		Reference r = new Reference();
		r.i=2025;
		r.j=1;
		System.out.printf("swap method 전 i=%d, j=%d\n", r.i, r.j);
		r.swap(r);
		System.out.printf("swap method 후 i=%d, j=%d\n", r.i, r.j);

	} //main

} //class

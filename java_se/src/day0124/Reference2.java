package day0124;

/**
 * 주소전달 : heap 의 주소(유일)를 저장하고 있는 객체를 매개변수로 선언하면 유일한 주소가 전달
 */
public class Reference2 {
	int i;
	int j;
	/*
	public void setI(int i) {
		i=i;
	} //setI
	*/
	public void setI(int i, Reference2 r) {
		System.out.println("setI에서 받은 객체 : "+r);
		r.i=i; //stack 에 있는 i 변수를 heap 에 있는 i 에 할당
		this.i=i; // stack 에 있는 i 변수의 값을 stack 에 있는 i 에 할당
	} //setI
	
	public void setJ(int j) {
		this.j=j;
	} //setJ
	
	public int getI() {
		return i;
	} //getI

	public static void main(String[] args) {
		Reference2 r = new Reference2();
//		r.i=2025;
//		r.setI(r.i);
		r.setI(2025, r);
		System.out.println(r.getI());

	} //main

} //class

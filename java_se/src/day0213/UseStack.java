package day0213;

import java.util.Stack;

/**
 * java.util.Stack
 * Stack : LIFO 를 구현한 자료구조
 */
public class UseStack {
	
	/**
	 * 객체 생성
	 */
	public UseStack() {
//		1. stack 객체 생성
		Stack<String> stack=new Stack<String>();
		Stack<String> stack2=new Stack<String>();

//		2. stack 값 할당
		stack.push("입니다.");	//1
		stack.push("목요일");		//2
		stack.push("피곤한");		//3
		stack.push("오늘은");		//4
		
		System.out.println("stack 비워진 여부 : "+stack.empty());
		
//		3. 값 얻기 - item 이 사라진다
//		System.out.println(stack.pop());	//4
//		System.out.println(stack.pop());	//3
//		System.out.println(stack.pop());	//2
//		System.out.println(stack.pop());	//1
//		System.out.println(stack.pop());	//stack 에 저장된 값이 없어 error 발생
		
		String item="";
		while(!stack.empty()) {
			item=stack.pop();
			stack2.push(item);
			System.out.println(item);
		} //end while
		
//		item=stack.pop();	//stack 에 저장된 값이 없어 error 발생
		
//		System.out.println(stack+" 크기 : "+stack.size());
//		부모에서 제공하는 method 는 사용하면 안된다
		System.out.println(stack);
		System.out.println(stack2);
	} //UseStack

	public static void main(String[] args) {
		new UseStack();
	} //main

} //class

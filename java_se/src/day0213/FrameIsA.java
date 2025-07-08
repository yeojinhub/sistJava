package day0213;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * is a 관계로 window Component 사용
 * 1. window component 상속
 */
@SuppressWarnings("serial")
public class FrameIsA extends JFrame{
	
	public FrameIsA() {
		super("is a 관계로 window Component 사용");
//		2. 일반 component 생성
		JButton jbtn=new JButton("나는 버튼");
//		3. component 를 window component 에 배치
		add(jbtn);	//코드의 재사용성
//		4. window 의 크기 설정
		setSize(300,500);
//		5. 사용자에게 출력
		setVisible(true);
//		6. window 종료 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //FrameIsA

	public static void main(String[] args) {
		new FrameIsA();
	} //main

} //class

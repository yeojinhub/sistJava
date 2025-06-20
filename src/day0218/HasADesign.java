package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * is a 관계로 window Component 사용
 * 이벤트를 처리 사용
 * 1. window component 상속
 */
//1. 발생된 Event 를 처리할 수 있는 XXXListener 꾸현
@SuppressWarnings("serial")
public class HasADesign extends JFrame implements ActionListener{
	
	public HasADesign() {
		super("is a 관계로 Event 처리");
//		2. 일반 component 생성
		JButton jbtn=new JButton("출력해보세요");
//		디자인 클래스와 이벤트 처리 클래스의 관계를 설정
		HasAEvent hae=new HasAEvent(this);
		
//		3. component 에서 이벤트를 발생할 수 있도록 이벤트에 등록,
//		이벤트가 발생했을 때 처리할 곳을 기술한다
//		jbtn.addActionListener(this);
		jbtn.addActionListener(hae);
		
//		3. 컴포넌트를 window 컴포넌트에 배치
		add(jbtn);	//코드의 재사용성
//		4. window 의 크기 설정
		setSize(300,500);
//		5. 사용자에게 출력
		setVisible(true);
//		6. window 종료 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //IsAEvent
	
	public void actionPerformed(ActionEvent ae) {
		System.out.println("is a 관계로 이벤트를 처리");
	}  //actionPerformed

	public static void main(String[] args) {
		new HasADesign();
	} //main

} //class

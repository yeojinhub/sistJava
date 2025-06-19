package day0214;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * java.awt.BorderLayout
 * BorderLayout(테두리 레이아웃) 매니저와 Component 의 모양 합치기 예제
 */
@SuppressWarnings("serial")
//1. window Component 상속
public class UseBorderLayout extends JFrame{

	public UseBorderLayout() {
		super("BorderLayout 연습");	//Frame 의 생성자 호출 : title bar 들어갈 메세지
		
//		2. Component 생성 JLabel 2개, JButton 2개, JTextArea 1개
		JLabel jlblNorth=new JLabel("북쪽");
		JLabel jlblSouth=new JLabel("남쪽");
		
		JButton jbtnWest=new JButton("서쪽");
		JButton jbtnEast=new JButton("동쪽");
		
		JTextArea jtaCenter=new JTextArea("중앙");
		
//		3. Component 배치
//		배치관리자 설정 (window 분할)
//		BorderLayout bl=new BorderLayout();	//잘 사용하지 않는 선언코드
//		setLeayout(bl);
		
		setLayout(new BorderLayout());		//기본 레이아웃이므로 생략 가능
//		Constant 사용
		add(jlblNorth, BorderLayout.NORTH);
		add(jbtnWest, BorderLayout.WEST);
		add(jtaCenter, BorderLayout.CENTER);
		
//		문자열 상수 사용
		add(jbtnEast, "East");
		add(jlblSouth, "South");
		
//		4. window 크기 설정(사용자에게 보여주기 위한 크기)
		setSize(400,400);
//		5. window 보여주기위한 설정
		setVisible(true);
//		6. window 종료 처리(x 버튼을 눌렀을 때 instance 소멸)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //UseBorderLayout
	
	public static void main(String[] args) {
		new UseBorderLayout();
	} //main

} //class

package day0214;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * BorderLayout, FlowLayout, GridLayout 복합사용예제
 */
@SuppressWarnings("serial")
public class UseMultiLayout extends JFrame {
	
	public UseMultiLayout() {
		super("여러개의 레이아웃 사용");
		
//		Component 생성
		JTextArea jtaNameDisplay=new JTextArea();
//		JTextArea 는 scrollbar 가 없음 -> JScrollPane 인 Container Component 를 사용
		JScrollPane jspNameDisplay = new JScrollPane(jtaNameDisplay);
		
//		여러개의 Component 를 BorderLayout 에 올리기 위해
//		Container Component(JPanel) 사용
		JPanelNorth jpNorth=new JPanelNorth();	//부분의 디자인 구현
		
//		Frame 의 기본 레이아웃은 BorderLayout
//		Component 배치
//		add(jpNorth, BorderLayout.NORTH);
		add(jpNorth, "North");
		add(jspNameDisplay, "Center");
		
//		window 크기 설정
		setSize(500,500);
//		사용자에게 출력
		setVisible(true);
//		window 종료 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	} //UseMultiLayout

	public static void main(String[] args) {
		new UseMultiLayout();
	} //main

} //class

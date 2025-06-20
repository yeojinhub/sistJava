package day0214;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GridLayout 사용예제
 */
@SuppressWarnings("serial")
public class UseGridLayout extends JFrame{

	public UseGridLayout(){
		super("GridLayout 연습");
		
//		Component 생성
		JButton jbtn1=new JButton("버튼 1");
		JButton jbtn2=new JButton("버튼 2");
		JButton jbtn3=new JButton("버튼 3");
		JButton jbtn4=new JButton("버튼 4");
		JButton jbtn5=new JButton("버튼 5");
		JButton jbtn6=new JButton("버튼 6");
//		배치관리자 설정하여 Component 배치
		setLayout(new GridLayout(2,3));		//BorderLayout -> GridLayout 변경
		
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtn4);
		add(jbtn5);
		add(jbtn6);
//		window 크기 설정
		setSize(400,200);
//		사용자에게 출력
		setVisible(true);
//		window 종료 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //UseGrideLayout
	
	public static void main(String[] args) {
		new UseGridLayout();
	} //main

} //class

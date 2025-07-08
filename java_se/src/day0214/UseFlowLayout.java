package day0214;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * 흐름 Layout 과 Component 사용
 */
@SuppressWarnings("serial")
public class UseFlowLayout extends JFrame{
//	1. window Component 상속
	public UseFlowLayout() {
		super("FlowLayout 연습");
//		2. Component 생성
		JLabel jlblName=new JLabel("이름");
		JTextField jtfName=new JTextField(10);
		
		JRadioButton jrbMale=new JRadioButton("남자",true);	//true : checked 된 상태
		JRadioButton jrbFemale=new JRadioButton("여자");
		
		JButton jbtnAdd=new JButton("입력");
//		버튼이 버튼 그룹으로 묶여져야 둘 중에 하나만 선택가능, 현재는 복수선택가능
//		2-1. 버튼 그룹을 생성
		ButtonGroup bg=new ButtonGroup();
//		2-2. 버튼 그룹에 버튼 할당
		bg.add(jrbMale);
		bg.add(jrbFemale);
		
//		3. 배치관리자를 설정, Component 배치
		setLayout(new FlowLayout()); //BorderLayout 에서 FlowLayout 변경
		add(jlblName);
		add(jtfName);
		add(jrbMale);
		add(jrbFemale);
		add(jbtnAdd);
		
//		4. window 크기 설정
		setSize(500,500);
//		5. 사용자에게 보여주기
		setVisible(true);
//		6. window 종료 이벤트 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //UseFlowLayout
	
	public static void main(String[] args) {
		new UseFlowLayout();
	} //main

} //class

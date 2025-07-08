package day0218;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Exam0218 extends JFrame{

	private JTextArea jta;
	private JRadioButton jbtnMale;
	private JRadioButton jbtnFemale;
	public Exam0218() {
		super("라디오 버튼");
		
//		1. 컴포넌트 생성
		JPanel jp=new JPanel();
		
		jta=new JTextArea(5,20);
		JScrollPane jsp=new JScrollPane(jta);
		JButton jbt=new JButton("입력");
		
		jbtnMale=new JRadioButton("남자");
		jbtnFemale=new JRadioButton("여자");
		
//		버튼 그룹 생성
		ButtonGroup bg=new ButtonGroup();
		bg.add(jbtnMale);
		bg.add(jbtnFemale);

//		텍스트 영역 수정 불가
		jta.setEditable(false);
		
//		배치관리자 설정, 컴포넌트 배치
		setLayout(new FlowLayout());
		jp.add(jbtnMale);
		jp.add(jbtnFemale);
		jp.add(jbt);
		
		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new FlowLayout(FlowLayout.CENTER));
		jpCenter.add(jsp);
		
		add(jp);
		add(jpCenter);
		
//		컴포넌트를 이벤트에 등록
//		이벤트 처리 클래스와 has a 관계를 설정한다
		UseAleExam0218 uae=new UseAleExam0218(this);
//		컴포넌트를 이벤트에 등록하고, 이벤트 발생시 처리할 객체를 할당
		jbt.addActionListener(uae);
		
		setBounds(100,100,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //Exam0218
	
	public JTextArea getJta() {
		return jta;
	} //getJta

	public JRadioButton getJbtnMale() {
		return jbtnMale;
	} //getJrbtnMale

	public JRadioButton getJbtnFemale() {
		return jbtnFemale;
	} //getJrbtnFemale

	public static void main(String[] args) {
		new Exam0218();
	} //main

} //class

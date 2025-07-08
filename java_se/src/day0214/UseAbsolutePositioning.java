package day0214;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 * 개발자가 컴포넌트의 크기와 배치 위치를 직접 설정하는 배치 관리자
 * 수동배치 예제
 */
@SuppressWarnings("serial")
public class UseAbsolutePositioning extends JFrame{
	public UseAbsolutePositioning() {
		super("수동배치");
		
//		Component 생성
		JButton jbtn=new JButton("버튼");
		JComboBox<String> jcb=new JComboBox<String>();
		
		jcb.addItem("Java SE");
		jcb.addItem("Oracle DBMS");
		jcb.addItem("JDBC");
		jcb.addItem("HTML");
		jcb.addItem("CSS");
		jcb.addItem("JavaScript");
//		비밀번호를 입력하기 위해 만들어진 Component
		JPasswordField jpf=new JPasswordField();
		
//		배치관리자를 해제
		setLayout(null);
		
//		Component 의 크기 설정
		jbtn.setSize(200,80);
//		Component 위치 설정
		jbtn.setLocation(100, 50);
		
		jcb.setBounds(300, 200, 250, 60);
		jpf.setBounds(470, 350, 180, 50);
		
//		Component 배치
		add(jbtn);
		add(jcb);
		add(jpf);
//		window 크기 설정
		setLocation(100,50);
		setSize(800,500);
//		가시화(사용자에게 출력)
		setVisible(true);
//		window 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //UseAbsolutePositioning
	
	public static void main(String[] args) {
		new UseAbsolutePositioning();
	} //main
} //class

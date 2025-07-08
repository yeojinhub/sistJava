package day0217;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Font 글꼴 변경 예제
 */
@SuppressWarnings("serial")
public class UseFont extends JFrame {

	public UseFont() {
		super("Font 사용");
		
//		Non-Visual Component
		Font font=new Font("궁서체", Font.BOLD, 20);
		Color color=new Color(0x4E8571);
		Color color2=new Color(0x7F0055);
		
//		Component 생성
		JLabel jlbl=new JLabel("라벨");
		JTextField jtf=new JTextField(10);
		JButton jbtn=new JButton("버튼");
		
//		Font 적용
		jlbl.setFont(font);
		jtf.setFont(font);
		jbtn.setFont(font);
		
//		전경색(글자색)
//		Constant 사용
		jlbl.setForeground(Color.blue);
		jtf.setForeground(Color.magenta);
		jbtn.setForeground(Color.cyan);
		
		JTextArea jta=new JTextArea(5,30);
		jta.setFont(new Font("휴먼편지체", Font.BOLD | Font.ITALIC, 25));
		JScrollPane jsp=new JScrollPane(jta);
		
//		객체 사용
		jta.setForeground(color);	//배경이 투명하여 바닥이 보이지 않음
		jta.setBackground(color2);
		jlbl.setOpaque(true);		//불투명도를 true
		jtf.setBackground(Color.GREEN);
		jbtn.setBackground(Color.GREEN);	//바닥색이 보이는 이유는 불투명도가 설정되었기 때문
		jbtn.setContentAreaFilled(false);	//배경이 투명(배경색이 설정되지 않음)
		
//		배치관리자 설정
		setLayout(new FlowLayout());
//		Component 배치
		add(jlbl);
		add(jtf);
		add(jbtn);
		add(jsp);
//		window 설정
		
//		window 크기 설정
		setBounds(100,100,600,300);
//		사용자에게 출력
		setVisible(true);
		setResizable(false);
//		window 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //UseFont
	
	public static void main(String[] args) {
		new UseFont();
	} //main

} //class

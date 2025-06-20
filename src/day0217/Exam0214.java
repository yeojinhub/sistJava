package day0217;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 문제
 * Calendar 혹은 LocalDate 를 사용하여
 * 2월의 달력을 출력하세요.
 * 날짜는 JButton을 사용한다.
 * 이전 달의 일자나 다음 달의 일자는 출력하지 않는다.
 */
@SuppressWarnings("serial")
public class Exam0214 extends JFrame {

	public Exam0214() {
		super("Java 25년 2월 달력");
		
		Calendar cal=Calendar.getInstance();
		StringBuilder calTitle=new StringBuilder();
		calTitle.append(cal.get(Calendar.YEAR)).append("-")
		.append(cal.get(Calendar.MONTH)+1).append("-")
		.append(cal.get(Calendar.DAY_OF_MONTH));
		
//		Component 생성
		JLabel jlblCalendar=new JLabel(calTitle.toString(), JLabel.CENTER);
		PanelCalendar pc=new PanelCalendar();
		jlblCalendar.setFont(new Font("맑은 고딕", Font.BOLD, 20));
	
//		배치관리자 설정
		
//		배치
		add(jlblCalendar , BorderLayout.NORTH);
		add(pc, BorderLayout.CENTER);
		
//		window 크기 설정
		setBounds(100,50,550,500);
		
//		가시화
		setVisible(true);
		setResizable(false);
		
//		window 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //Exam0214
	
	public static void main(String[] args) {
		new Exam0214();
	} //main

} //class

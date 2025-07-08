package day0214;

import java.awt.GridLayout;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 문제
 * Calendar 혹은 LocalDate 를 사용하여
 * 2월의 달력을 출력하세요.
 * 날짜는 JButton을 사용한다.
 * 이전 달의 일자나 다음 달의 일자는 출력하지 않는다.
 */
@SuppressWarnings("serial")
public class Exam0214 extends JFrame{

	public Exam0214() {
		String[] btnLabel=new String[35]; 
		LocalDate ld=LocalDate.of(2025,2,1);
		
		int startDay=ld.getDayOfWeek().getValue();
//		공백 넣기
		for(int blank=0; blank<startDay; blank++){
			btnLabel[blank]=" ";
		} //end for
//		날짜 넣기
		int lastDate = ld.lengthOfMonth();
		for(int date=1; date<=lastDate; date++) {
			btnLabel[startDay+date-1]=Integer.toString(date);
		} //end for
		
		JButton[] btnArr=new JButton[btnLabel.length];
		
		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new GridLayout(5,7));	//FlowLayout -> GridLayout 변경
		
		for(int i=0; i<btnArr.length; i++) {
//			String 방의 값으로 배열을 생성
			btnArr[i]=new JButton(btnLabel[i]);
//			생성된 JButton을 JPanel 배치
			jpCenter.add(btnArr[i]);
		} //end for
		
		add("Center", jpCenter);
		
		setSize(600,700);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //Exam0214
	
	public static void main(String[] args) {
		new Exam0214();
	} //main

} //class

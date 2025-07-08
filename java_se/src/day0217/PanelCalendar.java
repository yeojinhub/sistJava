package day0217;

import java.awt.Color;
//import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * JPanel 자식
 */
@SuppressWarnings("serial")
public class PanelCalendar extends JPanel {
	
	public static final int NUMBER_OF_DAYS=7;

	public PanelCalendar() {
		
//		Font font=new Font("맑은 고딕", Font.BOLD, 20);
		Color btnForeground=new Color(0x2A5895);
		Color btnBackground=new Color(0xCBD7E9);
		
//		마지막날의 행의 수 얻기
		Calendar cal=Calendar.getInstance();
		
//		오늘 날짜 얻기
		int nowDay=cal.get(DAY_OF_MONTH);
		
//		마지막 날 얻기
		int lastDay=cal.getActualMaximum(DAY_OF_MONTH);
//		System.out.println(lastDay);
		
//		오늘의 정보를 가진 달력객체에 마지막 날을 설정
		cal.set(DAY_OF_MONTH, lastDay);
//		System.out.println(cal);
		
//		마지막 날의 주의 번호
		int lastWeek=cal.get(Calendar.WEEK_OF_MONTH);
//		System.out.println(lastWeek);
		
//		패널에 배치할 컴포넌트 선언
		JButton[][] jbtnDays=new JButton[lastWeek][NUMBER_OF_DAYS];
		
//		배치관리자 변경
		setLayout(new GridLayout(lastWeek,NUMBER_OF_DAYS));
		
//		배치
//		1일에 시작하는 요일 수 설정
		cal.set(DAY_OF_MONTH,1);
		int weekStartDayNum=cal.get(DAY_OF_WEEK);
//		System.out.println(weekStartDayNum);
		
//		첫번째 주 1일 전에 공백을 생성
		Color colorBlank=new Color(0xE8F2F6);
		for(int jbtnBlank=1; jbtnBlank<weekStartDayNum; jbtnBlank++) {
			jbtnDays[0][jbtnBlank-1]=new JButton("");
			jbtnDays[0][jbtnBlank-1].setBackground(colorBlank);
		} //end for
		
//		1일부터 마지막날까지 반복
//		설정된 날짜의 1주일 수(7)를 얻으면 행수와 일치 cal.get(Calendar.WEEK_OF_MONTH)
		int rowCnt=0;
		
		int columnCnt=0;
		
		JButton jbtnTemp=null;
		
		for(int tempDay=1; ; tempDay++) {
//			Calendar 에 1일씩 증가하는 임시일자 설정
			cal.set(DAY_OF_MONTH, tempDay);	//1 1, 2 2
			//tempDay 가 2월인 경우 28일이 들어가면 28이 나오는데 29일이 되면 다음달 1일 반환
//			System.out.println("임시날짜 : "+tempDay
//					+" 설정되어 반환되는 날짜 : "+cal.get(DAY_OF_MONTH));
//			설정된 일자와 임시일자가 다르면
			if(cal.get(DAY_OF_MONTH)!=tempDay) {
//				cal 객체는 다음 달 1일로 설정
//				빠져나가기전에 공백을 만든다
				for(int jbtnBlank=cal.get(Calendar.DAY_OF_WEEK);
						jbtnBlank<8; jbtnBlank++) {
					jbtnTemp=new JButton("");
					jbtnTemp.setBackground(colorBlank);
					jbtnDays[rowCnt][jbtnBlank-1]=jbtnTemp;
				} //end for
				break;	//반복문 종료
			} //end if
			
//			증가하는 임시번호 일자를 설정, 바닥색, 글자색 설정
			columnCnt=cal.get(Calendar.DAY_OF_WEEK);
			jbtnTemp=new JButton(String.valueOf(tempDay));
			jbtnTemp.setBackground(btnBackground);
			jbtnTemp.setForeground(btnForeground);
			
//			날짜가 오늘 날짜이면 색깔을 칠해 강조
			if(tempDay==nowDay) {
				jbtnTemp.setBackground(new Color(0x587AAA));
				jbtnTemp.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "오늘이다");
					} //actionPerformed
				}); //ActionListener
			} //end if
			
			jbtnDays[rowCnt][columnCnt-1]=jbtnTemp;

			switch(columnCnt) {
			case Calendar.SATURDAY:
				rowCnt++;
			} //end switch
			
		} //end for
		
//		버튼 배열의 생성이 완료, Panel 배치
		for(JButton[] jbtnArr : jbtnDays) {
			for(JButton jbtn : jbtnArr) {
				add(jbtn);
			} //end 2nd for
		} //end 1st for
		
	} //PacnelCalendar
	
} //class

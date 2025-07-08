package day0213;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * 아래 제시된 InputDialog 에 입력 값을 넣어 업무를 처리하는 프로그램을 작성하세요
 * 
 * 1. 입력 데이터가 CSV 형태라면 ScoreVO 객체를 생성하여 입력값을 할당하고
 * ScoreVO 객체를 java.util.List 에 추가하는 작업을 수행
 * 그 후 사용자에게 다시 InputDialog 를 제공한다.
 * 
 * 2. CSV 형태가 아니고 "출력"이 입력되면
 * java.util.List 에 추가된 모든 ScoreVO 객체의 값을 Console 에 아래와 같이 출력한다.
 * 출력형식 )
 * 번호 이름 자바 오라클점수 총점 평균
 * 1	강태일 95 97		xxx xx.xx
 * 2	김영하 00 00		000	00.00
 * 
 * 3. CSV 형태가 아니고 "종료"가 입력되면 프로그램을 종료한다.
 */
public class Exam0213 {
	
	List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
	ScoreVO sv=new ScoreVO();
	
	public Exam0213() {
		
	} //Exam0213
	
	public void inputMenu() {
		StringBuilder inputMsg=new StringBuilder();
		inputMsg.append("\"이름, 자바점수,오라클점수\"입력해주세요.\n")
		.append("\"출력\"을 입력하면 현재까지 입력된 값이 console에 출력됩니다.\n")
		.append("\"종료\"를 입력하면 프로그램이 종료됩니다.");
		String data=JOptionPane.showInputDialog(inputMsg);
		
		while(data.equals("종료")) {
			String[] dataArr=data.split(",");
			addScoreData(dataArr);
		} //end while
		exitProg(data);

	} //inputMenu
	
	public void addScoreData(String[] scoreArr) {
		
		for(int i=0; i<scoreArr.length; i++) {
			String name=scoreArr[0];
			int javaScore=Integer.parseInt(scoreArr[1]);
			int oracleScore=Integer.parseInt(scoreArr[2]);
			int sum=javaScore+oracleScore;
			double ave=sum/2;
			System.out.printf("%d %.2f",sum,ave);
		} //end for
		
	} //addScoreData
	
	public void printData() {
		
		// 3) 출력
//		String message = "이름 : " + name +
//				", 나이 : " + age +
//				", 키 : " + height +
//				", 성별 : " + gender;
//		
//		JOptionPane.showMessageDialog(null, message
		
	} //printData
	
	public void exitProg(String data) {
		
		if(data.equals("종료")) {
			System.out.println("프로그램 종료");
			System.exit(0);
		} //end if
		
	} //exitProg
	
} //class

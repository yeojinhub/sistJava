package day0205;

/**
 * 배열 생성 및 선언하는 예제
 */
public class UseVOArray {

	public static void main(String[] args) {
		
//		사용자정의 데이터형으로 배열 생성
		StudentScoreVO[] ssArr=new StudentScoreVO[5];
		
//		초기화된 배열의 초기값은 null 확인
//		for(int i=0; i<ssArr.length; i++) {
//			System.out.print(ssArr[i]);
//		} //end for
		
		ssArr[0]=new StudentScoreVO(1,"루피", 57,58,42,90);
		ssArr[1]=new StudentScoreVO(2,"샹디", 75,77,79,89);
		ssArr[2]=new StudentScoreVO(3,"쵸파", 97,100,98,100);
		ssArr[3]=new StudentScoreVO(4,"조로", 87,88,88,84);
		ssArr[4]=new StudentScoreVO(5,"나미", 95,91,99,93);
		
		String[] titleArr=new String[]{"번호","이름","JavaSE","Oracle","JDBC","HTML","총점","평균"};

		System.out.println("----------------------------------------");
		System.out.println("\t\t시험결과");
		System.out.println("----------------------------------------");
		System.out.printf("응시인원[%d]명\n", ssArr.length);
		
//		타이틀 출력
		for(String subject: titleArr) {
			System.out.printf("%s\t", subject);
		} //end for

		System.out.println("\n======================================");
		
		int javaScore=0, oracleScore=0, jdbcScore=0, htmlScore=0, total=0, javaTotal=0;
		double subjectCnt=4.0;
		StudentScoreVO topSs=null;
		int topStu=0;
		
		for(StudentScoreVO ssVO: ssArr) {
			javaScore=ssVO.getJava();
			oracleScore=ssVO.getOracle();
			jdbcScore=ssVO.getJdbc();
			htmlScore=ssVO.getHtml();
			
			total=javaScore+oracleScore+jdbcScore+htmlScore;
//			점수가 가장 높은 학생의 정보
			if(topStu < total) {
				topStu=total;
				topSs=ssVO;
			} //end if
			
			javaTotal+=javaScore;
			
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
					ssVO.getNum(), ssVO.getName(),
					javaScore, oracleScore, jdbcScore, htmlScore, total, total/subjectCnt);
		} //end for
		
		System.out.println("======================================");
		
		System.out.println("JavSE 점수 총점 : "+javaTotal);
		System.out.printf("1등 학생의 번호 : %d, 이름 : %s\n",topSs.getNum(),topSs.getName());
	} //main

} //class

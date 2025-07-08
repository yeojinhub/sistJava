package day0204;

/**
 * 
 */
public class ScoreProcess {

	private String[] nameArr;	//학생명
	private String[] subjectArr;//과목명
	private int[][] scoreArr;	//학생들의 점수
	private int[] aveArr = new int[5];		//학생들의 점수 평균
	
	public ScoreProcess() {
		nameArr=new String[]{"루피","샹디","쵸파","조로","나미"};
		subjectArr=new String[] {"번호","이름","JavaSE","Oracle","JDBC","HTML","총점","평균"};
		scoreArr=new int[][] {
			{57,58,42,90}, {75,77,79,89},{97,100,98,100},
			{87,88,88,84}, {95,91,99,93}
			};
	} //ScoreProcess
	
	public String[] getNameArr() {
		return nameArr;
	} //getNameArr
	
	public String[] getSubjectArr() {
		return subjectArr;
	} //getSubjectArr
	
	public int[][] getScoreArr(){
		return scoreArr;
	} //getScoreArr
	
	public void printScore() {
		System.out.println("----------------------------------------");
		System.out.println("\t\t시험결과");
		System.out.println("----------------------------------------");
		System.out.printf("응시인원[%d]명\n", nameArr.length);
		
		for(String subject: subjectArr) {
			System.out.printf("%s\t", subject);
		} //end for
		
		System.out.println("\n======================================");
//		학생의 번호, 이름과 과목을 출력
		int sum=0;
		int ave=0;
		for(int i=0; i<scoreArr.length; i++) {
			System.out.printf("%d\t%s\t", i+1, nameArr[i]);
			
			sum=0;
			for(int j=0; j<scoreArr[i].length; j++) {
				System.out.printf("%d\t",scoreArr[i][j]);
				sum+=scoreArr[i][j];
			} //end 2nd for
			ave=sum/4;
			aveArr[i]=ave;
			System.out.printf("%d\t%d\n", sum,ave);
		} //end 1st for

		System.out.println("======================================");

		System.out.print("과목총점\t\t");
		for(int i=0; i<scoreArr.length; i++) {
			sum=0;
			for(int j=2; j<scoreArr[i].length; j++) {
				sum+=scoreArr[i][j];
			} //end 2nd for
			System.out.printf("%d\t",sum);
		} //end 1st for
		System.out.println("과목평균");
		System.out.println("1등 학생의 이름[] 번호[]");
		int topIndex=0;
		for(int i=0; i<aveArr.length; i++) {
			for(int j=i+1; j<aveArr.length; j++) {
				if(aveArr[i]>aveArr[j]) {
					topIndex=i;
				} //end if
			} //end 2nd for
		} //end 1st for
		System.out.printf("%d\n",topIndex);
		
		System.out.println("1등 학생의 점수의 오름차순으로 출력");
		
	} //printScore
	
	public static void main(String[] args) {
		ScoreProcess sp=new ScoreProcess();
		sp.printScore();
	} //main

} //class

package day0213;

public class ScoreVO {
	
	String name;
	int javaScore;
	int oracleScore;
	
	public ScoreVO() {
		
	} //ScoreVO
	
	public ScoreVO(String name, int javaScore, int oracleScore) {
		
	} //매개변수 있는 ScoreVO

	
	public void setName(String name) {
		this.name = name;
	} //setName
	
	public String getName() {
		return name;
	} //getName

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	} //setJavaScore

	public int getJavaScore() {
		return javaScore;
	} //getJavaScore

	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	} //setOracleScore
	
	public int getOracleScore() {
		return oracleScore;
	} //getOracleScore
	
} //class

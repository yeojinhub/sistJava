package day0131;


public class Exam0131 {
	private String residentNum;
	private int year;
	private String month;
	private int date;
	private int age;
	
	/**
	 * 1. 주민번호를 입력받아 instance variable 에 저장하는 생성자를 생성하세요.
	 * @param residentNum 입력받은 주민번호
	 */
	public void setResidentNum(String residentNum) {
		this.residentNum=residentNum;
	} //setResidentNum
	
	public String getResidentNum() {
		return residentNum;
	} //getResidentNum
	
	/**
	 * 2. 인스턴스 변수에 저장된 주민번호의 글자수가 14자리인지를 체크하여
	 * boolean 형으로 반환하는 method 작성 (14자리인 경우 true)
	 * @return 14자리인 경우=true, 14자리가 아닌경우=false 반환
	 */
	public boolean lengthResidentNum() {
		if(residentNum.length()==14) {
			return true;
		} else {
			return false;
		} //end else
	} //lengthResidentNum
	
	/**
	 * 3. 인스턴스 변수에 저장된 주민번호에 6번째 인덱스에 '-'가 있는지 체크하여
	 * boolean 형으로 반환하는 method 작성 (해당 자리에 '-'가 있다면 true)
	 * @return 6번째 index 가 '-'일때=true, '-'가 아닐때=false 반환
	 */
	public boolean sixIndexCheck() {
		char sixIndex = residentNum.charAt(6);
		if(sixIndex == '-') {
			return true;
		} else {
			return false;
		} //end else
	} //sixIndexCheck
	
	/**
	 * 4. 인스턴스 변수에 저장된 주민번호에서 생년월일을 연산하여 문자열로 반환하는 method 작성
	 * 반환 예시)
	 *  입력된 주민번호가 950131-123456 이라면 "1995년 01월 31일"로 반환되어야한다.
	 *  기준 ) '-'뒤의 문자가 0,9 - 1800년대생, 1,2,5,6이라면 1900년대생, 3,4,7,8 2000년대생 
	 */
	public String printBirth() {
		int index=residentNum.indexOf("-")+1;
		switch (residentNum.charAt(index)) {
		case '0':
		case '9': year=Integer.parseInt(residentNum.substring(0,2)); year+=1800; break;
		case '1':
		case '2':
		case '5':
		case '6': year=Integer.parseInt(residentNum.substring(0,2)); year+=1900; break;
		case '3':
		case '4':
		case '7':
		case '8': year=Integer.parseInt(residentNum.substring(0,2)); year+=2000; break;
		}
//		month = residentNum.substring(2, 4);
		String str=String.format("%d년 %d월 %d일", year, month, date);
		
		return str;
	} //printBirth
	
	/**
	 * 5. 인스턴스 변수에 저장된 주민번호에서 나이를 구하여 정수로 반환하는 method 작성
	 * @return age 나이
	 */
	public int calAge() {
		printBirth();
		age=2025-year+1;
		return age;
	} //claAge
	
	/**
	 * 6. 인스턴스 변수에 저장된 주민번호에서 성별을 구해 문자열로 반환하는 method 작성
	 * 기준 ) '-' 뒤의 문자가 1,3,5,7,9 = 남자, 0,2,4,6,8 = 여자
	 * @return gender 성별
	 */
	public String genderPrint() {
		int index=residentNum.indexOf("-")+1;
		String gender = null;
		switch (residentNum.charAt(index)) {
		case '1':
		case '3':
		case '5':
		case '7':
		case '9': gender="남자"; break;
		case '0':
		case '2':
		case '4':
		case '6':
		case '8': gender="여자"; break;
		} //end switch
		return gender;
	} //genderPrint
	
	/**
	 * 7. 인스턴스 변수에 저장된 주민번호에서 내국인지, 외국인인지를 문자열로 반환하는 method 작성
	 * 기준 ) '-' 뒤의 문자가 0,1,2,3,4,9=내국인, 5,6,7,8=외국인
	 * @return local 내국인 혹은 외국인
	 */
	public String localOrForeigner() {
		String local=null;
		int index=residentNum.indexOf("-")+1;
		switch (residentNum.charAt(index)) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '9': local="내국인"; break;
		case '5':
		case '6':
		case '7':
		case '8': local="외국인"; break;
		} //end switch
		return local;
	} //localOrForeigner
	
	/**
	 * 8. 인스턴스 변수의 저장된 주민번호에서 띠를 구하여 문자열로 반환하는 method 작성
	 * @return zodiac 띠
	 */
	public String zodiacFlag() {
		int zodiacFlag = year % 12; // 0~11
		String zodiac=null;
		switch (zodiacFlag) {
		case 0:
			zodiac="원숭이";
			break;
		case 1:
			zodiac="닭";
			break;
		case 2:
			zodiac="개";
			break;
		case 3:
			zodiac="돼지";
			break;
		case 4:
			zodiac="쥐";
			break;
		case 5:
			zodiac="소";
			break;
		case 6:
			zodiac="호랑이";
			break;
		case 7:
			zodiac="토끼";
			break;
		case 8:
			zodiac="용";
			break;
		case 9:
			zodiac="뱀";
			break;
		case 10:
			zodiac="말";
			break;
		case 11:
			zodiac="양";
			break;
		} //end switch
		return zodiac;
	} //zodiacFlag

} //class

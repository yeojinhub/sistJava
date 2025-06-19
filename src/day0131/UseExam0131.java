package day0131;

/**
 * 아래의 작업을 instance method 로 만들어서 사용하는 class 를 작성하고,
 * 작업을 사용하는 class 를 만든 후 객체를 생성하고 method 호출하여 사용해보세요.
 * (getter method, setter method 도 작성하세요.)
 * class diagram 도 작성하세요.
 */
public class UseExam0131 {
	
	public void checkNum(String residentNum) {
		
	} //checkNum

	/**
	 * 1. 주민번호를 입력받아 instance variable 에 저장하는 생성자를 생성하세요.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("주민번호의 형식은 950131-1234567 입니다. 주민번호를 입력해주세요.");
		String residentNum=args[0];
		
		Exam0131 ex=new Exam0131();
		ex.setResidentNum(residentNum);
		residentNum=ex.getResidentNum();
		System.out.println("입력된 주민번호 : "+residentNum);
		
		if(ex.lengthResidentNum()) {
			if(ex.sixIndexCheck()) {
				System.out.println("생년월일 : "+ex.printBirth());
				System.out.println("나이 : "+ex.calAge());
				System.out.println("내국인 : "+ex.localOrForeigner());
				System.out.println("성별 : "+ex.genderPrint());
				System.out.println("띠 : "+ex.zodiacFlag());
			}
			else {
				System.out.println("'-'가 올바른 위치에 존재하지 않습니다.");
			} //end else
		} else{
			System.out.println("주민번호의 길이가 맞지 않습니다.");
		} //end else

	} //main

} //class

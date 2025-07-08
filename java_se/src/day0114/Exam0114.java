package day0114;

class Exam0114 {
	public static void main(String[] args) {
		char fstInitial='L';
		char midInitial='Y';
		char lastInitial='J';
		System.out.println("내 이름은 이여진 이고 이니셜은 "+fstInitial+midInitial+lastInitial+"입니다.");
		
		int birthYear=1997;
		System.out.println("태어난 해는 "+birthYear+"년이고,");
		
		int age=2025-1997+1;
		System.out.println("나이는 "+age+"살입니다.");

		double leftEye=1.5;
		double rightEye=1.2;
		double aveEye=((leftEye+rightEye)/2);
		System.out.println("왼눈 시력 "+leftEye+" 오른 눈 시력 "+rightEye+"이고, 양안시력은 "+aveEye+"입니다.");

		int halfTransFee=2400;
		int dayTransFee=halfTransFee*2;
		int monthTransFee=halfTransFee*20;
		System.out.println("편도차비 "+halfTransFee+"원 왕복차비 "+dayTransFee+"원, 한달 20일 출근하면 월 교통비는 "+monthTransFee+"원 입니다.");

		char upperCase='A';
		int tmp=(int)upperCase+32;
		char lowerCase=(char)tmp;
		System.out.println("대문자 '"+upperCase+"'의 Unicode값은 65입니다. '"+upperCase+"'에 32를 더하면 소문자 '"+lowerCase+"'를 만들 수 있다.");

	}
}

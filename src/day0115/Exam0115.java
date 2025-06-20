package day0115;
class Exam0115 { 
	public static void main(String[] args) {
		long dayCost=ExamConstant.COST/ExamConstant.COUNT_DAY;
		System.out.println("한달용돈 "+ExamConstant.COST+"원 하루 용돈은 "+ExamConstant.COUNT_DAY+"일 기준 "+dayCost+"원 입니다.");
		
		int halfTransFee=2400;
		int dayTransFee=halfTransFee*2;
		int lunchCost=10000;
		System.out.println("하루 지출은 편도 교통비 "+halfTransFee+"원, 왕복 교통비 "+dayTransFee+"원 점심식대 "+lunchCost+"원으로");
		System.out.println("총 "+(dayTransFee+lunchCost)+"원이 지출됩니다.");
		
		System.out.println("한달이 지났을 때의 잔액은 "+(ExamConstant.COST-((dayTransFee+lunchCost)*ExamConstant.COUNT_DAY))+"원 입니다.");
		
		System.out.println("byte의 최소값 "+ Byte.MIN_VALUE +" ~ 최대값 "+Byte.MAX_VALUE);
		System.out.println("short의 최소값 "+ Short.MIN_VALUE +" ~ 최대값 "+Short.MAX_VALUE);
		System.out.println("int의 최소값 "+ Integer.MIN_VALUE +" ~ 최대값 "+Integer.MAX_VALUE);
		System.out.println("long의 최소값 "+ Long.MIN_VALUE +" ~ 최대값 "+Long.MAX_VALUE);
		System.out.println("float의 최소값 "+ Float.MIN_VALUE +" ~ 최대값 "+Float.MAX_VALUE);
		System.out.println("double의 최소값 "+ Double.MIN_VALUE +" ~ 최대값 "+Double.MAX_VALUE);
		System.out.println("boolean의 최소값 "+ Boolean.FALSE +" ~ 최대값 "+Boolean.TRUE);
		
		int i=15;
		System.out.println("~"+i+"="+~(i-1));

	} //main
} //class
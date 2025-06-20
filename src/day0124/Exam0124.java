package day0124;

/**
 * 아래의 대상을 추상화하여 클래스를 생성하고,
 * 객체화 후 객체가 제공하는 기능을 사용
 * 라면 : 신라면, 너구리, 안성탕면
 */
public class Exam0124 {
	public int numRamen;
	
	public int nameRamen(String nameRamen) {
		switch (nameRamen) {
		case "신라면": { numRamen=1;	break;}
		case "너구리": { numRamen=2;	break;}
		case "안성탕면": { numRamen=3; break;}
		default:{ System.out.printf("%s 는 라면 이름이 아닙니다.", nameRamen);}
		} //end switch
		System.out.printf("라면의 이름은 %s 입니다.\n", nameRamen);
		return numRamen;
	} //nameRamen
	
	public void setPrice(int numRamen) {
		int price=0;
		switch(numRamen) {
		case 1: { price=980;	break;}
		case 2: { price=975;	break;}
		case 3: { price=920;}
		} //end switch
		System.out.printf("가격은 %d원입니다.\n",price);
	}
	
	public void setKcal(int numRamen) {
		int kcal=0;
		switch(numRamen) {
		case 1: { kcal=500;	break;}
		case 2: { kcal=490;	break;}
		case 3: { kcal=525;}
		} //end switch
		System.out.printf("열량은 %d칼로리입니다.\n",kcal);
	}
	
	public static void main(String[] args) {
		Exam0124 ex = new Exam0124();
		String sin ="신라면";
		String neoguri ="너구리";
		String anseong="안성탕면";
		
		int numRamen=ex.nameRamen(sin);
		ex.setPrice(numRamen);
		ex.setKcal(numRamen);
		System.out.println("-------------------------");
		
		numRamen=ex.nameRamen(neoguri);
		ex.setPrice(numRamen);
		ex.setKcal(numRamen);
		System.out.println("-------------------------");
		
		numRamen=ex.nameRamen(anseong);
		ex.setPrice(numRamen);
		ex.setKcal(numRamen);		
	
	}

}

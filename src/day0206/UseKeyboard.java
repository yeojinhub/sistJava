package day0206;

public class UseKeyboard extends Keyboard{

	public static int price=0;
	public static String name=null;
	public static String type=null;
	
	@Override
	public String getName(String name) {
		return name;
	} //getName

	@Override
	public int getPrice(String name) {
		switch (name) {
		case "로지택": { price=159000; break; }
		case "한성": { price=185000; break; }
		case "앱코": { price=145000; break; }
		default : {
			price=0;
			System.out.println("입력된 브랜드가 다릅니다.");
			break;
			}
		} //end switch
		return price;
	} //getPrice
	
	@Override
	public String getType(String type) {
		UseKeyboard.type=type;
		switch (type) {
		case "무접점": { type="무접점"; break; }
		case "기계식": { type="기계식"; break; }
		default : {
			System.out.println("입력된 키보드 방식이 다릅니다.");
			break;
			}
		} //end switch
		return type;
	} //getType

	@Override
	public void printMsg() {
		System.out.printf("입력된 키보드의 브랜드는 %s, 가격은 %d 원, 키보드 타입은 %s 입니다.\n", name, price, type);
	} //printMsg

	public static void main(String[] args) {
		UseKeyboard uk=new UseKeyboard();
		name=uk.getName("한성");
		uk.getPrice(name);
		uk.getType("무접점");
		uk.printMsg();
	} //main

} //class

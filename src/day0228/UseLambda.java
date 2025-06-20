package day0228;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UseLambda {

	public static void main(String[] args) {
//		Lambda 식 사용
//		반환형 없고 매개변수 없는 method : LambdaTypeA
//		선언 : () -> {}, 호출 : interface명.method명();
		LambdaTypeA lta=()-> {
			System.out.println("------반환형 없고, 매개변수 없는 형------");
			System.out.println("오늘은 금요일");
			System.out.println("내일은 토욜");
		}; //LambdaTypeA
		
//		호출
		lta.test();
		
		System.out.println("------반환형 없고, 매개변수 있는 형------");
		LambdaTypeB ltb=(int i, String name)-> {
			System.out.println(i);
			System.out.println(i*5);
			System.out.println(name);
		}; //LambdaTypeB
		
		ltb.test(1, "3월 1일은 삼일절 공휴일");
		System.out.println("------반환형 있고, 매개변수 없는 형------");
		LambdaTypeC ltc=()-> {
			String msg="Java는 완벽한 OOP 언어입니다.";
			return msg;
		}; //LambdaTypeC
//		호출
		String msg=ltc.test();
		System.out.println(msg);
		
		System.out.println("------반환형 있고, 매개변수 있는 형------");
		LambdaTypeD ltd=(Date date)-> {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			return sdf.format(date);
		}; //LambdaTypeD
//		호출
		String msgD=ltd.test(new Date());
		System.out.println(msgD);
		
		System.out.println("Thread로 구구단 2단을 출력하는 코드를 람다식을 사용하여 출력해보기");
		
		Thread t=new Thread(()-> {
			for(int num=1; num<10; num++) {
				System.out.println(2+"x"+num+"="+(2*num));
			}
		}); //LambdaTypeGugudan
		
		t.start();
//		호출
		
		
	} //main

} //class

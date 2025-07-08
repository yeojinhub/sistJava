package day0116;

/**
 * 논리 연산자<br>
 * 일반 논리 : <br>
 *  여러개의 관계연산자를 붙여서 비교해야할 때
 *   && (AND) : 전항과 후항이 모두 true일 때만 true
 *   || (OR) : 전항과 후항이 모두 false일 때만 false
 * 
 * 비트 논리 : <br>
 *  비트를 연산할 때 사용 <br>
 *  & (AND) : 상위비트와 하위비트 모두 1일때 1 <br>
 *  | (OR) : 상위비트와 하위비트 모두 0일때 0 <br>
 *  ^ (XOR) : 상위비트와 하위비트 둘중 하나만 1일때 1 <br>
 *  
 */
public class Operator5 {

	public static void main(String[] args) {

//		int i=1, j=16, k=1, l=16;
//		System.out.println(i+"<"+j+"&&"+k+"<"+l+" = "+(i<j && k<l));

		boolean flag=true, flag2=false, flag3=true, flag4=false;
		
		System.out.println("일반 논리곱 연산자");
		System.out.println(flag+"&&"+flag3+" = "+(flag&&flag3)); //true
		System.out.println(flag+"&&"+flag2+" = "+(flag&&flag2)); //false
		System.out.println(flag2+"&&"+flag+" = "+(flag2&&flag)); //false
		System.out.println(flag2+"&&"+flag4+" = "+(flag2&&flag4)); //false

		System.out.println("일반 논리합 연산자");
		System.out.println(flag+"||"+flag3+" = "+(flag||flag3)); //true
		System.out.println(flag+"||"+flag2+" = "+(flag||flag2)); //false
		System.out.println(flag2+"||"+flag+" = "+(flag2||flag)); //false
		System.out.println(flag2+"||"+flag4+" = "+(flag2||flag4)); //false
		
		flag=false;
		flag2=false;
		flag3=false;
		
		//후항을 연산하지 않는 예제 코드
		
		flag3= (flag=3<4) && (flag2=5<6);
		
		System.out.println(flag+"&&"+flag2+" = "+flag3);
		
		System.out.println("-----------비트 논리 연산자 -----------");
		
		int i=25, j=15;
		
		System.out.println(i+"&"+j+" = "+ (i&j));
		
		i=33; j=17;
		
		System.out.println(i+"|"+j+" = "+(i|j));
		
		i=7; j=17;
		
		System.out.println(i+"^"+j+" = "+(i^j));
	} //main

} //class

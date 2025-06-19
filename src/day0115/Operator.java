package day0115;
/** 
단항 연산자(unary operator) <br>
연산에 필요한 항이 하나인 연산자<br>
~, !, +, -, ++, --

*/
class Operator {
	public static void main(String[] args) {
		int i=15;
		int j=-14;
		
		System.out.println("~"+i+"="+~i); //부호변경 1증가
		System.out.println("~"+j+"="+~j); //부호변경 1감소
		
		i=3;
		j=4;
		
		System.out.println("!("+ i+">"+j+")=" +!(i>j));
		
		boolean flag=true;
		//boolean  변수 앞에 사용
		System.out.println("!"+flag+"="+!flag);
		
		//+형식적인 제공
		i=15;
		j=-15;
		System.out.println("+"+i+"="+ +i);
		System.out.println("+"+j+"="+ +j);
			
		//-2의 보수연산 (부호 변경연산)
		System.out.println("-" + i + "=" + -i); //-15
		System.out.println("-" + j + "=" + -j); //15
		
		//++ : 대상체의 값을 1씩 증가, -- : 대상체의 값을 1씩 감소
		//전위 연산: 연산자 대상체
		++i; //15 -> 16
		//후위 연산: 대상체 연산자
		i++; //16 -> 17
		
		System.out.println(i);
		
		--i; //17 -> 16
		i--; //16 -> 15
		
		System.out.println(i);
		
		i=15;
		int result=0;

		//전위
		result= ++i;
		System.out.println("result : "+result+", i : "+i); //같은 값
		
		//후위 : 남의 것 먼저(대입 연산 후 증가, 감소연산 수행)
		i=15;
		result=0;
		
		result= i++;
		System.out.println("후위 연산 후 result :"+result+", i : "+i); //다른 값
		
		//method 매개변수로 전달할 때
		i=15;
		test("전위 ", ++i );
		i=15;
		test("후위 ", i++ );
		
		i=10;
		j=15;
		
		System.out.println("i는 "+ ++i + ", j는 "+ j++);
		
	} //main
	
	public static void test(String type, int param){
		System.out.println(type + "test method 안에 전달된 parameter 값 : "+ param);
	}
	
} //class

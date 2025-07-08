package day0203;

/**
 * java.lang.String 클래스의 사용
 * 
 */
public class UseString {
		
	public UseString() {
		String str="";		//empty 초기화
		String str2=null;	//null 초기화
		
//		null 비교 (== 연산자 사용)
		System.out.println("str의 null 값인지 비교 : "+(str==null)); //false
		System.out.println("str2의 null 값인지 비교 : "+(str2==null)); //true

//		null 값을 가진 문자열 객체는 method 를 호출했을 때 error 발생
//		if(str2 != null) {
//			str2.isEmpty();
//		} //end if
		
//		empty : error 발생하지 않고, 아무값도 출력되지 않음
		System.out.println("값 출력 : "+str);
//		empty 비교
//		JDK1.5까지는 length() 사용
		System.out.println("str empty 비교 :"+(str.length()==0)); //true
//		JDK1.6부터는 isEmpty() 사용 : 가독성 유리
		System.out.println("str empty 비교 :"+str.isEmpty()); //true
		
//		객체가 생성되어 있고 empty 아닐 때 실행
		if(str!=null && !str.isEmpty()) {
//			실행
		} //end if
		
		str="  A BC   ";
//		문자열의 앞뒤 공백제거
		str2=str.trim();	//"A BC"할당
		System.out.printf("[%s]의 앞뒤 공백제거[%s]\n", str,str2);
		
		str="집에 가고 싶다";
//		문자열의 비교
//		문자열의 모든 값을 알아야 비교 : equals()
		System.out.println(str.equals("집에 가고 싶다"));	//true
		System.out.println(str.equals("집애 가고 싶다"));	//false
		System.out.println(str.equals("집에가고싶다"));	//false
		
//		문자열의 일부분의 값만 알아도 비교
//		해당 문자열로 시작했는지? : startsWith("시작 문자열")
		String name="이여진";
		String name2="유연수";
		String name3="주현석";
		
//		특정 문자열로 시작했는지?
		System.out.println(name+"은 '이'씨 인지 비교"+name.startsWith("이")); //true
		System.out.println(name+"은 '이'씨 인지 비교"+(name.indexOf("이")==0)); //true
		System.out.println(name2+"은 '이'씨 인지 비교"+name2.startsWith("이")); //false
		System.out.println(name3+"은 '이'씨 인지 비교"+name3.startsWith("이")); //false
		
//		특정 문자열로 끝났는지?
		System.out.println(name+"은 이름이 '여진'인지 비교"+name.endsWith("여진")); //true
		System.out.println(name2+"은 이름이 '여진'인지 비교"+name2.endsWith("여진")); //true
		System.out.println(name3+"은 이름이 '여진'인지 비교"+name3.endsWith("여진")); //true

//		특정 문자열을 포함했는지?
		System.out.println(name+"은 '여'글자를 포함 "+name.contains("여")); //true
		System.out.println(name2+"은 '여'글자를 포함 "+name2.contains("여")); //true
		System.out.println(name3+"은 '여'글자를 포함 "+name3.contains("여")); //true
		
//		문자열 치환
		str="Java Oracle";
		str2=str.replace("a", "A");
		System.out.println("원래 문자열 : "+str);
		System.out.println("바뀐 문자열 : "+str2);
		
		str2=str.replaceAll("a", "AA");
		System.out.println("바뀐 문자열 : "+str2);
		
		String msg="나 지금 피씨방인데, 넌 어디니 씨 방새야?";
//		String filter=msg.replaceAll("씨방", "**");
		String filter=msg.replaceAll("씨", "*");
		filter=filter.replace("방", "*");
		filter=filter.replace("ㅆ", "*");
		
		System.out.println("원본 메세지 : "+msg);
		System.out.println("바뀐 메세지 : "+filter);
		
//		원하는 형식의 문자열 생성
		int year=2025;
		double height=165.0;
		
		String formatStr=String.format("올해는 %d년 내 키는 %f", year, height);
		System.out.println(formatStr);
		
//		정규식(RegEx)
		msg="hello! 010-7771-1396 내 나이는 33살이고 우리집번지 19-1번지";
		
//		숫자 패턴 \\d
//		문자열에서 모든 숫자를 *로 처리
		str=msg.replaceAll("\\d", "*");
		System.out.println("원본 문자열 : "+msg);
		System.out.println("치환된 문자열 : "+str);
		
//		문자열 안에서 전화번호 형식을 변경
		str=msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "***-****-****");
		System.out.println("번호만 치환된 문자열 : "+str);
		
//		그룹의 값을 보여줄 떄
		str=msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "$1-****-$3");
		System.out.println("그룹의 값 노출 : "+str);
		
//		010-x345-6789
		str=msg.replaceAll("(\\d{3})-(\\d{1})(\\d{3}-\\d{4})", "$1-x$3");
		System.out.println("그룹의 값 노출 : "+str);
		
//		나이만 **살
		str=msg.replaceAll("(\\d{2})+살", "**");
		System.out.println("그룹의 값 노출 : "+str);

//		긍정형 전방탐색 ((?=값))
		str=msg.replaceAll("(\\d{2})(?=살)", "**");
		System.out.println("긍정형 전방탐색 : "+str);
		
//		긍정형 전,후방탐색 ((?<=값))
		str=msg.replaceAll("(?<=나이는 )(\\d{2})(?=살)", "**");
		System.out.println("긍정형 전후방탐색 : "+str);
		
//		문자열
		msg="가나다 Test ~0abc test 자바 z Z1o9";
//		'T', 'e', 's', 't' 를 각각 찾는다. : 범위가 아님
		System.out.println(msg.replaceAll("[Test]", ""));
		System.out.println(msg.replaceAll("[A-Z]", "")); //대문자만 치환
		System.out.println(msg.replaceAll("[a-z]", "")); //소문자만 치환
		System.out.println(msg.replaceAll("[0-9]", "")); //숫자만 치환
		System.out.println(msg.replaceAll("[~!@#$%^&*()]", "")); //특수문자만 치환
		System.out.println(msg.replaceAll("[ㄱ-힣]", "")); //특수문자만 치환
		
		String id="Test1234~+";
		if(!"".equals(id.replaceAll("[A-Za-z0-9~+]", ""))) {
			System.out.println("아이디에 허용되지 않는 문자가 포함되었습니다.");
			return;
		} //end if
		
		msg="hello! 내 이메일은 test@test.com입니다.";
		str=msg.replaceAll("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b", "****@****.***");
		System.out.println("원본 이메일 : "+msg);
		System.out.println("치환 이메일 : "+str);
		
		int i=3;
//		str=i; //error
		str=String.valueOf(i);
		System.out.printf("str=%s, i=%d\n", str,i);
		
		boolean b=false;
//		str=b; //error
		str=String.valueOf(b);
		System.out.printf("str=%s, b=%b\n", str,b);
		
	} //UseString

	public static void main(String[] args) {
//		UseString us=new UseString(); //us 객체명으로 변수나 method 를 호출하지 않음
//		변수(객체)를 사용하지 않음, 경고 발생
		new UseString();
	} //main

} //class

package day0131;

/**
 * String (문자열)을 저장할 수 있는 데이터형 java.lang.String
 *  기본형 형식으로 사용 : new 를 사용하지 않고 java.lang.String을 사용
 *  String str="abc";
 *  참조형 형식으로 사용 : new 를 사용 java.lang.String을 사용
 *  String str=new String("abc");
 */
public class UseString {

	public static void main(String[] args) {
//		기본형 형식의 사용
		String str="Abc";
		
//		참조형 형식의 사용
		String str2=new String("Abc");
		System.out.printf("기본형 형식 : %s\n", str);
		System.out.printf("참조형 형식 : %s\n", str2);
		
//		==은 참조형 데이터형에 사용하면 주소가 같은지 비교
		System.out.printf("주소 비교 : 기본형 %s==Abc = %b\n", str, str=="Abc");
		System.out.printf("주소 비교 : 참조형 %s==Abc = %b\n", str2, str2=="Abc");
		System.out.printf("주소 비교 : 기본형 %s== 참조형 %s = %b\n", str, str2,str==str2);

//		equals method 는 기본형 형식이든 참조형 형식이든 동일한 비교를 수행
		System.out.printf("문자 비교 : 기본형 %s equals Abc = %b\n", str, str.equals("Abc"));
		System.out.printf("문자 비교 : 참조형 %s equals Abc = %b\n", str2, str2.equals("Abc"));
		
		str="AbcdEf";
		String email="lee@test.com";
		
		System.out.println(str+"의 글자수 : "+str.length());
		int emailLength=email.length();
		System.out.println(email+"의 글자수 : "+emailLength);
		
//		문자열을 대문자로 변환
		String upperCase=str.toUpperCase();
		System.out.printf("%s를 모두 대문자로 변환 : %s\n", str, upperCase);
		System.out.printf("%s를 모두 대문자로 변환 : %s\n", email, email.toUpperCase());
		
//		문자열을 소문자로 변환
		System.out.printf("%s를 모두 소문자로 변환 : %s\n", str, str.toLowerCase());
		
//		특정 index 의 문자 얻기
		System.out.printf("%s의 3번째 index에 해당하는 문자열 추출 : %c\n", str, str.charAt(3));
		int index=5;
		char tempChar=str.charAt(index);
		System.out.printf("%s의 %d번째 index에 해당하는 문자열 추출 : %c\n", str,index, tempChar);
		
//		email의 처음부터 끝까지의 문자를 잘라서 한자씩 줄변경하여 출력
		for(index=0; index<emailLength; index++) {
			tempChar=email.charAt(index);
			System.out.println(tempChar);
		} //end for
		
//		str="AbcdEf";
//		012345 : String index

//		문자의 시작 index
		System.out.printf("%s에서 %s 문자열의 시작 인덱스 %d\n",
				str, "c", str.indexOf("c"));
//		문자열의 시작 index
		System.out.printf("%s에서 %s 문자열의 시작 인덱스 %d\n",
				str, "dEf", str.indexOf("dEf"));		
		
//		존재하지 않는 문자열의 시작 index 는 -1
		System.out.printf("%s에서 %s 문자열의 시작 인덱스 %d\n",
				str, "a", str.indexOf("a"));
		System.out.printf("%s에서 %s 문자열의 시작 인덱스 %d\n",
				str, "ghi", str.indexOf("ghi"));		
		
		str="이행복은행복한말티즈";
		System.out.printf("[%s]에서 처음 나오는 %s 문자열의 시작 인덱스 %d\n",
				str, "행복", str.indexOf("행복")+1);
		
//		문자열의 뒤에서부터 특정 문자열의 index
		System.out.printf("[%s]에서 마지막에 나오는 %s 문자열의 시작 인덱스 %d\n",
				str, "행복", str.lastIndexOf("행복"));
		
//		문자열에서 자식 문자열을 얻기
		str="AbcdEfg";
//		     01234567 : String index
		System.out.printf("%s에서 2~4번째 index에 해당하는 하위 문자열 %s\n",
				str,str.substring(2,5)); //cdE
		System.out.printf("%s에서 3번째 index에 해당하는 하위 문자열 %s\n",
				str,str.substring(3, str.length())); //dEfg
		System.out.printf("%s에서 3번째 index에 해당하는 하위 문자열 %s\n",
				str,str.substring(3)); //dEfg
		
//		email=lee@test.com
//		email 변수에서 메일주소, 도메인주소를 분리해서 출력
		System.out.printf("%s에서 메일주소에 해당하는 하위 문자열 %s\n",
				email,email.substring(4,8)); // test
		System.out.printf("%s에서 도메인 주소에 해당하는 하위 문자열 %s\n",
				email,email.substring(9)); // com
		
		
	} //main

} //class

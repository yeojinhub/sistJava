package day0115;
/**
진수 사용
*/

class Radix {
	public static void main(String[] args) { 
		int binary=0b1010; //2진수 사용 : 0b숫자
		int octal=012; //8진수 : 0숫자
		int decimal=10; //10진수 : 숫자
		int hex=0xa; //16진수 : 0x숫자
		
		//개발자가 어떤 진수를 사용하든 JVM에서 2진수로 저장되고 2진수가 연산
		//결과는 10진수로 나옴
		System.out.println("2진수 : "+binary);
		System.out.println("8진수 : "+octal);
		System.out.println("10진수 : "+decimal);
		System.out.println("16진수 : "+hex);
		
		System.out.println(binary+octal+decimal+hex); //출력은 10진수
		
		int i=36;
		System.out.println(i+"를 2진수로 변환하면 "+Integer.toBinaryString(i));
		
		i=25;
		System.out.println(i+"를 2진수로 변환하면 "+Integer.toBinaryString(i));
		
		i=0300;
		System.out.println(i+"를 8진수로 변환하면 "+Integer.toOctalString(i));
	} //main
} //class
/**
(0000 0010 0100)2 (36)10
(0000 0001 1001)2 (25)10
(0000 0101 1001)2 (89)10
(0001 0010 1100)2 (300)10

030 -> (011 000)8 (0001 1000)2 (24)10
0201 -> (010 000 001)8 (0000 0000 1000 0001)2 (129)10
0300 -> (011 000 000)8 (0000 0000 1100 0000)2 (192)10

0x25 -> (0010 0101)2 (37)10
0x1D -> (0001 1101)2 (29)10
0xFF -> (1111 1111)2 (255)10
*/
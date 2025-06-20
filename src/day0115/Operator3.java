package day0115;
/**
shift 연산자(비트 밀기 연산)
<< (left shift) : 비트를 왼쪽으로 밀고, 생긴 빈칸을 0으로 채움
>> (right shift) : 비트를 오른쪽으로 밀고, 생긴 빈칸은 최상위 부호 비트에 따라
양수면 0, 음수면 1을 채움
>>> (unsigned right shift) : 비트를 오른쪽으로 밀고, 빈칸은 0으로 채움
*/
class Operator3 { 
	public static void main(String[] args) {
		int i=25; //(0001 1001)2
		
		System.out.println(i+" << 2 = "+(i<<2)); //(0110 0100)2 << 2 00 0110 0100
		
		i=27;
		System.out.println(i+" >> 3 = " +(i>>3)); //0001 1011 >>3 0000 0011
		
		i=31;
		System.out.println(i+" >>>4 = "+(i>>>4)); //0001 1111 >>>4 0000 0001
		
		i=1; //4byte(32)개
		System.out.println(i+" <<31 = "+(i<<31));
		//i=Integer.MAX+VALUE;
		i= -1;
		System.out.println(i+" >>100 = "+(i>>100));
		System.out.println(i+" >>>1 = "+(i>>>1));
	} //main
} //class

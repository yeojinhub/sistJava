package day0226;

import java.io.NotSerializableException;
import java.io.Serializable;

public class UseInstanceOf {

	public void useInstanceOf(TestInstance ti) throws NotSerializableException {
//		직렬화 인스턴스가 생성되었는지 확인
		if( ti instanceof Serializable ) {
			System.out.println("직렬화 가능");
		} else {
			System.out.println("직렬화 불가능");
			throw new NotSerializableException("생명연장의 꿈");
		} //end if
	} //useInstanceOf
	
	public static void main(String[] args) {
		TestInstance ti=new TestInstance();
		UseInstanceOf uio=new UseInstanceOf();
		try {
			uio.useInstanceOf(ti);
		} catch (NotSerializableException nse) {
			nse.printStackTrace();
		} //end try catch
	} //main

} //class

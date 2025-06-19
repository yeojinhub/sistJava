package day0225;

import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 문자열을 파일에 기록
 */
public class UseBufferedWritier {

	/**
	 * 8bit + 16bit Stream 결합하는 method
	 */
	public void useFileOutputStream() {
		String msg = "오늘은 25일 화요일입니다.";
		File file = new File("c:/dev/temp/test.txt");

//		try~with~resources 사용
//		2. Stream 연결
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
//			3. 데이터를 Stream 에 기록
			bw.write(msg); 
//			4. Stream 의 내용을 목적지로 분출
			bw.flush();
			System.out.println(bw);
		} catch (IOException ie) {
			ie.printStackTrace();
		} // end try catch
	} // useFIleOutpuStream

	/**
	 * 16bit Stream 만 사용
	 */
	public void useBufferedWritier() throws IOException {
		String data = "내일은 수요일 입니다.";

		File file = new File("c:/dev/temp/test.txt");

		BufferedWriter bw = null;
		try {
//			Stream 연결
			bw = new BufferedWriter(new FileWriter(file));
//			Stream 에 데이터를 기록
			bw.write(data);
//			Stream 의 데이터를 목적지로 분출
			System.out.println("Stream에 데이터를 기록");
			bw.flush();
			System.out.println("Stream에 기록된 데이터를 목적지 파일로 분출");
		} finally {
			if (bw != null) {
				bw.close();
			} // end if
		} // end try finally
	} // useBufferedWritier

	public static void main(String[] args) {
		UseBufferedWritier ubw = new UseBufferedWritier();
//		ubw.useFileOutputStream();
		try {
			ubw.useBufferedWritier();
		} catch (IOException ie) {
			ie.printStackTrace();
		} // end try catch
	} // main

} // class

package day0213;

//import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * has a 관계로 window Component 사용
 */
public class FrameHasA {
	/**
	 * 2. 생성자에서 외부에서 생성된 window Component 객체를 받는다
	 * @param jframe
	 */
	public FrameHasA(JFrame jframe) {
//		3. 일반 Component 생성
		JButton jbtn=new JButton("나는 버튼이야");
//		4. 일반 Component 를 window Component 에 배치(add)
		jframe.add(jbtn);
//		5. frame 크기 설정
		jframe.setSize(400,250);
//		6. 사용자에게 출력
		jframe.setVisible(true);
//		7. window 종료 처리
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} //FrameHasA

	public static void main(String[] args) {
//		1. 외부에서 window Component 생성
		JFrame jf =new JFrame("has a 관계로 window Component 사용");
		new FrameHasA(jf);
	} //main

} //class

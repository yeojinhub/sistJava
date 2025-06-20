package day0213;

import java.awt.Frame;
import java.awt.Window;

/**
 * 사용자에게 보여주기 위한 OS 에 제공하는 판
 */
@SuppressWarnings("serial")
public class UseFrame extends Window {
	
	public UseFrame(Frame frame) {
		super(frame);			//window 와 frame 은 has a 관계
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
//		window 위에 올라가는 사용자에게 기본 메뉴를 제공하는 컴포넌트 : frame
		Frame frame=new Frame("타이틀 연습");
		new UseFrame(frame);
	} //main

} //class

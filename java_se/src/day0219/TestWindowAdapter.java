package day0219;

import javax.swing.JFrame;

/**
 * window event 처리
 */
@SuppressWarnings("serial")
//1.window Event 처리하기 위해 WindowListener 구현
public class TestWindowAdapter extends JFrame {

	public TestWindowAdapter() {
		super("윈도우 이벤트 처리");
		
//		발생된 Window Event 등록
		addWindowListener(new TestWindowAdapterEvt(this));
		setBounds(100,100,400,300);
		setVisible(true);
	} //TestWindowEvent
	
	public static void main(String[] args) {
		new TestWindowAdapter();
	} //main

} //class

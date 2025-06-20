package day0219;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * XXXAdater 상속
 */
//WindowAdapter 클래스는 abstract method 가 없음 -> 필요한 method override
public class TestWindowAdapterEvt extends WindowAdapter {
	private TestWindowAdapter twa;

	public TestWindowAdapterEvt(TestWindowAdapter twa) {
		this.twa=twa;
	} //TestwindowAdapterEvt
	@Override
	public void windowClosing(WindowEvent e) {
//		TestWindowAdapterEvt 클래스의 상속관계에서는 window 가 존재하지 않음
		twa.dispose();
	} //windowClosing

} //class

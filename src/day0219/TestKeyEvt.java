package day0219;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyEvt extends KeyAdapter {
	
	private TestKeyDesign tkd;
	
	public TestKeyEvt(TestKeyDesign tkd) {
		this.tkd=tkd;
	} //TestKeyEvent

//	@Override
//	public void keyTyped(KeyEvent e) {
//		키코드가 얻어지지 않는다
//		System.out.println("2. keyTyped");
//		System.out.println("눌린 키 코드 : "+e.getKeyCode()+
//				",눌린키의 문자 : "+e.getKeyChar());
//	} //keyTyped

//	@Override
//	public void keyPressed(KeyEvent e) {
////		키보드의 키가 눌릴때 작업
//		System.out.println("1. keyPressed");
//		System.out.println("눌린 키 코드 : "+e.getKeyCode()+
//				",눌린키의 문자 : "+e.getKeyChar());
//	} //keyPressed

	@Override
	public void keyReleased(KeyEvent e) {
//		키보드의 키가 올라올 때 작업
		System.out.println("3. keyReleased");
		System.out.println("눌린 키 코드 : "+e.getKeyCode()+
				",눌린키의 문자 : "+e.getKeyChar());
		switch(e.getKeyCode()) {
		case KeyEvent.VK_ESCAPE :	//esc(27)키를 누르면 종료, enter(10)
			tkd.dispose(); break;
		case KeyEvent.VK_COMMA :
			System.out.println(tkd.getJtf().getText()+" "); break;
		} //end switch
	} //keyReleased
	
} //class

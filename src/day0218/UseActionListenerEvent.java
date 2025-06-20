package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

/**
 * UseActionListenerDesign 이벤트를 처리하기 위한 클래스
 * 1. XXXListener 를 구현
 */
public class UseActionListenerEvent implements ActionListener {
	private UseActionListenerDesign uald;
	/**
	 * 2. Design class 와 Has A 관계를 설정
	 * @param uald
	 */
	public UseActionListenerEvent(UseActionListenerDesign uald) {
		this.uald=uald;
	} //UseActionListenerEvent
	/**
	 * 3. 이벤트가 발생했을 때 처리할 method 를 Override
	 * JTextField 에 입력된 값을 받아와서 값이 있다면
	 * JTextArea 에 추가하고, JTextField 의 값을 초기화
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		JTextField jtf=uald.getJtf();
		String message=jtf.getText();
//		message 값이 있다면
		if(!message.isEmpty()) {
			uald.getJta().append(message+"\n");
			jtf.setText("");
		} //end if
	} //actionPerformed

} //UseActionListenerEvent

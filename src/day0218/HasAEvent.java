package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HasAEvent implements ActionListener {

	public HasAEvent(HasADesign hasAdesign) {
		
	} //HasAEvent

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Has a 관계로 이벤트를 처리");
	} //actionPerformed
	
	
} //class

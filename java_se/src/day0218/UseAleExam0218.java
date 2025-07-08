package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

public class UseAleExam0218 implements ActionListener{

	private Exam0218 exam0218;
	
	public UseAleExam0218(Exam0218 exam0218) {
		this.exam0218=exam0218;
	} //UseAleExam0218
	@Override
	public void actionPerformed(ActionEvent ae) {
//		"남자" 또는 "여자" 라디오버튼 선택 후 입력 버튼을 눌렀을때 TextArea 에 값을 출력
		JRadioButton jbtnMale=exam0218.getJbtnMale();
		JRadioButton jbtnFemale=exam0218.getJbtnFemale();
		
		String msgMale=jbtnMale.getText();
		String msgFemale=jbtnFemale.getText();
		
		if(jbtnMale.isSelected()) {
			exam0218.getJta().append(msgMale+"\n");
		} else if(jbtnFemale.isSelected()) {
			exam0218.getJta().append(msgFemale+"\n");
		} //end if
		
//		String message=jta.getText();
		//값이 있다면
//		if (!message.isEmpty()) {
//		//JTextArea 에 추가
//			exam0218.getJta().append(message+"\n");
//		}//end if
		
	} //actionPerformed

} //UseAleExam0218

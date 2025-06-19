package day0219;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFormEvt extends WindowAdapter implements ActionListener {

	private LoginForm lf;
	private Map<String, String> mapLoginData;
	
	private JTextField jtfID;
	private JPasswordField jpfPass;
	private JLabel jlblOutput;
	
	
	public LoginFormEvt(LoginForm lf) {
		this.lf=lf;
//		필요한 컴포넌트를 인스턴스 변수(사용할 컴포넌트)에 할당
		jtfID=lf.getJtfID();
		jpfPass=lf.getJpfPass();
		jlblOutput=lf.getJlblOutput();
		
//		로그인에 사용되는 데이터 셋
		mapLoginData=new HashMap<String, String>();
		mapLoginData.put("kim", "1234");
		mapLoginData.put("park", "Par2025");
		mapLoginData.put("lee", "4321");
		mapLoginData.put("hong", "h_1234");
	} //LoginFormEvt
	
	@Override
	public void windowClosing(WindowEvent e) {
		lf.dispose();
	} //windowClosing
	
	private boolean idChecked() {
		boolean flag=false;
//		앞뒤 공백을 제거하여 아이디를 저장
		String id=jtfID.getText().trim();
		
//		ID가 비었는지 확인하고 비었으면 라벨에 출력
		flag=!id.isEmpty();
		if(flag) {
//			ID가 입력되지 않아 마우스 커서를 ID 입력 컴포넌트로 이동
			jpfPass.requestFocus();
		} else {
			jlblOutput.setText("ID는 필수 입력입니다.");
//			ID 입력 후 엔터를 치면 마우스 커서를 비밀번호 컴포넌트로 이동
			jtfID.requestFocus();
		} //end if
		return flag;
	} //idChecked
	
	private void passChecked() {
//		ID가 있는 경우에만 비밀번호 체크
		if(!idChecked()) {
//			호출한 곳으로 돌아가기
			return;
		} //end if
//		char[] 을 하나의 문자열로 만들어서 저장 -> String 에서 제공하는 모든 기능 사용
//		jpfPass.getText()
		String pass=new String(jpfPass.getPassword());
		
//		비밀번호가 입력되었는지 확인
		if(pass.isEmpty()) {
			jlblOutput.setText("비밀번호는 필수 입력");
			jpfPass.requestFocus();
			return;
		} //end if
		 
//		비밀번호가 있으면 로그인 수행
		String id=jtfID.getText();
		String msg="아이디나 비밀번호 확인";
		
		if(mapLoginData.containsKey(id) && mapLoginData.containsValue(pass)) {
			msg=("로그인 성공");
		} //end if
		jlblOutput.setText(msg);
		
	} //passChecked

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==jtfID) {
			idChecked();
		} //end if
		
		if(ae.getSource()==jpfPass) {
			passChecked();
		} //end if
	} //actionPerformed

} //class

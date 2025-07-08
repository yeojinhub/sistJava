package day0220;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * "추가","변경","삭제" 버튼을 누르면 실행하는 이벤트 클래스
 */
public class Exam0220Evt implements ActionListener {
	
	private Exam0220 ex;
	
	private JTextField jtfName;
	private JTextField jtfAge;
	private JTextField jtfNum;
	
	private JRadioButton jbtnMale;
	private JRadioButton jbtnFemale;
	
	private DefaultListModel<String> dlm;
	private JList<String> jl;
	
	private JButton jbtnAdd;
	private JButton jbtnChg;
	private JButton jbtnDel;
	
	public Exam0220Evt(Exam0220 ex) {
		this.ex=ex;
		this.jtfName=ex.getJtfName();
		this.jtfAge=ex.getJtfAge();
		this.jtfNum=ex.getJtfNum();
		this.dlm = ex.getListModel();
		this.jl = ex.getList();
		this.jbtnAdd=ex.getJbtnAdd();
		this.jbtnChg=ex.getJbtnChg();
		this.jbtnDel=ex.getJbtnDel();
	} //Exam0220Evt
	
	/**
	 * "변경" 버튼이 선택되었을때 호출
	 */
	public void btnChg() {
		int index = jl.getSelectedIndex();
		dlm.remove(index);
		
		String name=jtfName.getText();
		String age=jtfAge.getText();
		String num=jtfNum.getText();
		
		jbtnMale = ex.getJbtnMale();
		jbtnFemale = ex.getJbtnFemale();
		
		String male = null;
		if(jbtnMale.isSelected()) {
			male=jbtnMale.getText();
		} else if(jbtnFemale.isSelected()) {
			male=jbtnFemale.getText();
		} //end else if
		String data = name + ", " + age + ", " + male + ", " + num;
		dlm.addElement(data);
		
	} //btnChg
	
	/**
	 * "삭제" 버튼이 선택되었을때 호출
	 */
	public void btnDel() {
//		jl.setModel(dlm);
		int index = jl.getSelectedIndex();
		
		if(index == -1) {
			JOptionPane.showMessageDialog(ex, "삭제할 항목을 선택하세요.",
					"알림", JOptionPane.WARNING_MESSAGE);
		} else {
			dlm.remove(index);
		} //end if else
		
	} //btnDel
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String name=jtfName.getText();
		String age=jtfAge.getText();
		String num=jtfNum.getText();
		
		jbtnMale = ex.getJbtnMale();
		jbtnFemale = ex.getJbtnFemale();
		
		String male = null;
		if(jbtnMale.isSelected()) {
			male=jbtnMale.getText();
		} else if(jbtnFemale.isSelected()) {
			male=jbtnFemale.getText();
		} //end else if
		String data = name + ", " + age + ", " + male + ", " + num;
		
//		"추가" 버튼이 선택되었을때 호출
		if(ae.getSource()==jbtnAdd) {
			dlm.addElement(data);
		} //end if

//		"변경" 버튼이 선택되었을때 호출
		if(ae.getSource()==jbtnChg) {
			btnChg();
		} //end if
		
//		"삭제" 버튼이 선택되었을때 호출
		if(ae.getSource()==jbtnDel) {
			btnDel();
		} //end if

		
	} //actionPerformed

} //class

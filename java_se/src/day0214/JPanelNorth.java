package day0214;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JPanelNorth extends JPanel{
	
	public JPanelNorth() {
		
//		Component 생성
		JLabel jlblName=new JLabel("이름");
		JTextField jtfName=new JTextField(21);
		JButton jbtnAdd=new JButton("입력");
		
		add(jlblName);
		add(jtfName);
		add(jbtnAdd);
		
	} //JPanelNorth
	
} //class

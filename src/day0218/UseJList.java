package day0218;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 * JList 사용예제
 */
@SuppressWarnings("serial")
public class UseJList extends JFrame {

	public UseJList() {
		super("JList 사용");
		
//		1. 모델 생성
		DefaultListModel<String> dlm=new DefaultListModel<String>();
//		2. 모델과 has a 관계로 view 생성
		JList<String> jl=new JList<String>(dlm);
		
//		JList ScrollBar 가 없어 추가
		JScrollPane jsp=new JScrollPane(jl);
		
//		데이터 추가 : 모델
		dlm.addElement("Java SE");
		dlm.addElement("Oracle DBMS");
		dlm.addElement("JDBC");
		dlm.addElement("HTML5");
		dlm.addElement("CSS6");
		dlm.addElement("JavaScript(ECMAScript)");
		dlm.addElement("Java EE");
		
		add("North", new JLabel("학습 과목"));
		add("Center", jsp);
		
		setBounds(100,100,300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	} //UseJList
	
	public static void main(String[] args) {
		new UseJList();
	} //main

} //class

package day0214;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculator extends JFrame{
	
	public Calculator() {
		super("계산기");
		
		JTextField jtfNumber = new JTextField();
		
		String[] btnLabel="7,8,9,4,5,6,1,2,3,+/-,0,.".split(",");
		JButton[] btnArr=new JButton[btnLabel.length];
		
		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new GridLayout(4,3,10,10));	//FlowLayout -> GridLayout 변경
		
		for(int i=0; i<btnArr.length; i++) {
//			String 방의 값으로 배열을 생성
			btnArr[i]=new JButton(btnLabel[i]);
//			생성된 JButton을 JPanel 배치
			jpCenter.add(btnArr[i]);
		} //end for
		
//		setLayout(null);		//기존에 설정된 배치관리자를 해제
		add("North", jtfNumber);
		add("Center", jpCenter);
		
		
		setSize(250,300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} //Calculator

	public static void main(String[] args) {
		new Calculator();
	} //main

} //class

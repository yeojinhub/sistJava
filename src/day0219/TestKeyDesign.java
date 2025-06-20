package day0219;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * window event 처리와 키보드 이벤트 처리
 */
@SuppressWarnings("serial")
//1.window Event 처리하기 위해 WindowListener 구현
public class TestKeyDesign extends JFrame {
	
	private JTextField jtf;

	public TestKeyDesign() {
		super("윈도우 이벤트 처리");
		
		jtf=new JTextField();
		jtf.setBorder(new TitledBorder("입력"));
		
		add("Center", jtf);
		
//		키보드 이벤트 등록
		jtf.addKeyListener(new TestKeyEvt(this));
		
//		발생된 Window Event 등록
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
//				inner class 는 외부 클래스의 자원을 직접 사용가능
			} //windowClosing
		}); //addWindowListener
		setBounds(100,100,400,300);
		setVisible(true);
	} //TestKeyDesign
	
	public JTextField getJtf() {
		return jtf;
	} //getJtf

	public static void main(String[] args) {
		new TestKeyDesign();
	} //main

} //class

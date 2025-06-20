package day0219;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SameEventDesign extends JFrame {

	private JButton jbtnOpen;
	private JButton jbtnSave;
	
	public SameEventDesign() {
		super("같은 이벤트 처리");
		
		jbtnOpen=new JButton("파일 다이얼로그 열기");
		jbtnSave=new JButton("파일 다이얼로그 저장");
		
		JPanel jpCenter=new JPanel();
		jpCenter.add(jbtnOpen);
		jpCenter.add(jbtnSave);
		
		add(jpCenter);
		
//		window 종료 이벤트 처리
//		has a 관계 객체생성
		SameEvent se=new SameEvent(this);
//		윈도우에 이벤트 등록
		addWindowListener(se);
//		버튼에 이벤트 등록
		jbtnOpen.addActionListener(se);
		jbtnSave.addActionListener(se);
		
		setBounds(100,100,500,400);
		setVisible(true);
		
	} //SameEventDesign
	
	public JButton getJbtnOpen() {
		return jbtnOpen;
	} //getJbtnOpen

	public JButton getJbtnSave() {
		return jbtnSave;
	} //getJbtnSave

	public static void main(String[] args) {
		new SameEventDesign();
	} //main

} //class

package day0220;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * javax.swing.JOptionPane
 * JOptionPane 사용예제
 */
@SuppressWarnings("serial")
public class UseOptionPane extends JFrame {

	private JButton jbtnInput;
	private JButton jbtnMessage;
	private JButton jbtnConfirm;
	
	private UseOptionPane jop;
	
	public UseOptionPane() {
		super("JOptionPane 사용");
		jbtnInput=new JButton("input dialog");
		jbtnMessage=new JButton("message dialog");
		jbtnConfirm=new JButton("confirm dialog");
		
//		Component 생성
		JPanel jpCenter=new JPanel();
		jpCenter.add(jbtnInput);
		jpCenter.add(jbtnMessage);
		jpCenter.add(jbtnConfirm);
		
//		Component 배치
		add("Center", jpCenter);
		jop=this;
		
//		event 등록
		UseOptionPane.InnerEvent ie=this.new InnerEvent();
		jbtnInput.addActionListener(ie);
		jbtnMessage.addActionListener(ie);
		jbtnConfirm.addActionListener(ie);
		
//		window 크기 설정
		setBounds(100,100,500,500);
		setVisible(true);
		
//		window 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	} //UseOptionPane
	
//	inner class 시작
	public class InnerEvent implements ActionListener{

		public void useInputDialog() {
			String msgName="당신의 이름을 입력해주세요.";
			String name=JOptionPane.showInputDialog(jop,msgName
					,JOptionPane.INFORMATION_MESSAGE);
			if(name!=null) {
				setTitle(name+" 님 어서오세요.");
			} //end if
			
		} //useInputDialog
		public void useMessageDialog() {
			String msg="오전시간 수고하셨습니다.";
//			JOptionPane.showMessageDialog(jop, jop.getTitle());
			JOptionPane.showMessageDialog(jop,msg, "오늘의 메세지"
					,JOptionPane.ERROR_MESSAGE);
		} //useMessageDialog
		public void useConfirmDialog() {
			int selectBtnInd=JOptionPane.showConfirmDialog(jop, "점심 맛있게 드셨나요?",
					"오늘의 점심은", JOptionPane.YES_NO_CANCEL_OPTION);
			switch(selectBtnInd) {
			case JOptionPane.OK_OPTION :
				JOptionPane.showMessageDialog(jop, "식당은 어디?");
				break;
			case JOptionPane.NO_OPTION :
				JOptionPane.showMessageDialog(jop, "맛저하세요.");
				break;
			} //end switch
			
		} //useConfirmDialog
		@Override
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()== jbtnInput) {
				useInputDialog();
			} //end if
			if(ae.getSource()== jbtnMessage) {
				useMessageDialog();
			} //end if
			if(ae.getSource()== jbtnConfirm) {
				useConfirmDialog();
			} //end if
		} //actionPerformed
		
	} //InnerEvent inner class
	
//	inner class 종료
	
	public static void main(String[] args) {
		new UseOptionPane();
		JOptionPane.showConfirmDialog(null, "오전에 수고하셨습니까?");
	} //main

} //UseOptionPane class

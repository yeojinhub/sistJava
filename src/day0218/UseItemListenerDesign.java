package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * MVC Pattern이 도입된 컴포넌트사용
 * Model: 데이터
 * Viewer: 화면
 * Controller: 이벤트
 */
@SuppressWarnings("serial")
public class UseItemListenerDesign extends JFrame implements ActionListener{
	
	private DefaultComboBoxModel<String> dcbm;
	private JComboBox<String> jcbDomain;
	
	private JTextField jtfEmail;
	private JTextField jtfDomain;
	private JLabel emailOutput;
	
	public UseItemListenerDesign() {
		super("JComboBox 사용");
		
		//1. 데이터를 가지는 Model 단의 클래스를 객체화
		dcbm=new DefaultComboBoxModel<String>();
		//2. 데이터를 사용하여 화면을 만드는 View단 클래스를 객체화.(has a)
		jcbDomain=new JComboBox<String>(dcbm);
		
//		jcbDomain.addActionListener(this);
		
		//도메인을 추가 (데이터)=> Model 사용
		dcbm.addElement("gmail.com");
		dcbm.addElement("naver.com");
		dcbm.addElement("daum.net");
		dcbm.addElement("hotmail.com");
		dcbm.addElement("직접입력");
		
		//도메인을 삭제
		
		
		JPanel jp= new JPanel();
		jp.setBorder(new TitledBorder("이메일 입력"));
		
		jtfEmail=new JTextField(15);
		jtfDomain=new JTextField(15);
		emailOutput=new JLabel("출력");
		emailOutput.setBorder(new TitledBorder("출력"));
		jp.add(jtfEmail);
		jp.add(new JLabel("@", JLabel.CENTER));
		jp.add(jtfDomain);
		jp.add(jcbDomain);
		
		add("North", jp);
		add("Center", emailOutput);
		
//		디자인에서 발생한 이벤트를 처리하기 위해 이벤트 클래스를 has a 관계로 생성
		ItemListenerDesignEvent ilde=new ItemListenerDesignEvent(this);
		jcbDomain.addItemListener(ilde);
		jtfEmail.addActionListener(ilde);
		
		setBounds(100,100,600,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}//UseJComboBox

	public DefaultComboBoxModel<String> getDcbm() {
		return dcbm;
	} //getDcbm

	public JComboBox<String> getJcbDomain() {
		return jcbDomain;
	} //getJcbDomain

	public JTextField getJtfEmail() {
		return jtfEmail;
	} //getJtfEmail

	public JTextField getJtfDomain() {
		return jtfDomain;
	} //getJtfDomain

	public JLabel getEmailOutput() {
		return emailOutput;
	} //getEmailOutput

	public static void main(String[] args) {
		new UseItemListenerDesign();
	}//main

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}//class
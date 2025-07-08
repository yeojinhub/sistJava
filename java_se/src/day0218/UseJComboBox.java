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
public class UseJComboBox extends JFrame implements ActionListener{
	
	private DefaultComboBoxModel<String> dcbm;
	private JComboBox<String> jcbDomain;
	
	public UseJComboBox() {
		super("JComboBox 사용");
		
		//1. 데이터를 가지는 Model 단의 클래스를 객체화
		dcbm=new DefaultComboBoxModel<String>();
		//2. 데이터를 사용하여 화면을 만드는 View단 클래스를 객체화.(has a)
		jcbDomain=new JComboBox<String>(dcbm);
		
		jcbDomain.addActionListener(this);
		
		//도메인을 추가 (데이터)=> Model 사용
		dcbm.addElement("gamil.com");
		dcbm.addElement("naver.com");
		dcbm.addElement("daum.net");
		dcbm.addElement("hotmail.com");
		dcbm.addElement("hotmail.net");
		
		//도메인을 삭제
		
		
		JPanel jp= new JPanel();
		jp.setBorder(new TitledBorder("이메일 입력"));
		
		jp.add(new JTextField(15));
		jp.add(new JLabel("@", JLabel.CENTER));
		jp.add(jcbDomain);
		
		add("South", jp);
		
		setBounds(100,100,400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}//UseJComboBox

	

	public static void main(String[] args) {
		new UseJComboBox();
	}//main



	@Override
	public void actionPerformed(ActionEvent e) {
		int selectedIndex= jcbDomain.getSelectedIndex();//View에서 선택한 인덱스를 얻고
		System.out.println("선택한 인덱스"+ jcbDomain.getSelectedIndex());
		//Model에서 선택한 인덱스에 해당하는 값 얻기
		System.out.println("값 얻기: "+ dcbm.getElementAt(selectedIndex));
		//선택한 아이템 삭제
		dcbm.removeElementAt(selectedIndex);
	}//actionPerformed

}//class
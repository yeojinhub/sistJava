package day0218;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Icon 사용예제
 */
@SuppressWarnings("serial")
public class UseIcon extends JFrame {

	public UseIcon() {
		super("이미지 연습");
		
//		ImageIcon 생성
		ImageIcon ii1=new ImageIcon("C:/dev/workspace/java_se/src/day0218/images/img1.png");
		ImageIcon ii2=new ImageIcon("C:/dev/workspace/java_se/src/day0218/images/img2.png");
		ImageIcon ii3=new ImageIcon("C:/dev/workspace/java_se/src/day0218/images/img3.png");
		ImageIcon ii4=new ImageIcon("C:/dev/workspace/java_se/src/day0218/images/img4.png");
		
//		Component 와 has a 관계 설정
		JButton jbtn1=new JButton("우는 차차", ii1);
		JButton jbtn2=new JButton("웃는 차차", ii2);
		JButton jbtn3=new JButton("기대 차차", ii3);
		JButton jbtn4=new JButton("랄프", ii4);
		
//		풍선도움말 설정
		jbtn1.setToolTipText("울고 있는 차차");
		jbtn2.setToolTipText("웃고 있는 차차");
		jbtn3.setToolTipText("응시하고 있는 차차");
		jbtn4.setToolTipText("바트 친구");
		
//		버튼 라벨 이동
//		수직
		jbtn1.setVerticalTextPosition(JButton.TOP);
		jbtn2.setVerticalTextPosition(JButton.BOTTOM);
//		수평
		jbtn3.setVerticalTextPosition(JButton.BOTTOM);
		jbtn3.setHorizontalTextPosition(JButton.CENTER);
		
//		RollOver
		jbtn3.setRolloverIcon(ii4);
		
		setLayout(new GridLayout(1,3));
		
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
//		add(jbtn4);
		
		setBounds(200,200,1400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	} //UseIcon
	
	public static void main(String[] args) {
		new UseIcon();
	} //main

} //class

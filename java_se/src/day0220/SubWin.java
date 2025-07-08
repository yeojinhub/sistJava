package day0220;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * MainWindow 를 부모로 하는 SubWindow
 * (Dialog : 부가적인 서비스 제공)
 */
@SuppressWarnings("serial")
public class SubWin extends JDialog {
	
	public SubWin(MainWindow mw) {
//		true : 모달(창 1개만 열기), false : 비모달(창 여러개 열기)
		super(mw, "다이얼로그", true);	
//		super(mw, "다이얼로그", false);
		
//		Component 생성
		ImageIcon imgMain=new ImageIcon("C:/dev/workspace/java_se/src/day0218/images/img2.png");
		JLabel jlbl=new JLabel(imgMain);
		
		JPanel jpSouth=new JPanel();
		JButton jbtnClose=new JButton("창 닫기");
		
//		Component 배치
		jpSouth.add(jbtnClose);
		
		add("Center", jlbl);
		add("South", jpSouth);
		
//		event 등록
		SubWinEvt swe=new SubWinEvt(this);
		addWindowListener(swe);
		jbtnClose.addActionListener(swe);
		
//		System.out.println("부모창의 시작좌표 : "+mw.getX()+","+mw.getY());
		
//		window 크기 설정
//		부모창의 시작좌표를 받아와서 자식창의 시작창의 위치를 조정
		setBounds(mw.getX()+100,mw.getY()+100, 300, 400);
		setVisible(true);
		setResizable(false);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	} //SubWin

} //class

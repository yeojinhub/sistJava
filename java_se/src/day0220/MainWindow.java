package day0220;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 */
@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	private JMenuItem jmiSubWin;
	private JMenuItem jmiClose;
	
	public MainWindow() {
		super("Dialog 연습");
		
		JMenuBar jmb=new JMenuBar();
		
		JMenu jmDialog=new JMenu("Dialog");
		
		jmiSubWin=new JMenuItem("열기");
		jmiClose=new JMenuItem("닫기");
		
//		메뉴 아이템을 메뉴에 배치
		jmDialog.add(jmiSubWin);
		jmDialog.addSeparator();
		jmDialog.add(jmiClose);
		
//		메뉴 메뉴바 배치
		jmb.add(jmDialog);
		
//		메뉴바를 Frame 에 배치
		setJMenuBar(jmb);
		
//		window 이벤트 등록
		MainWindowEvt mwe=new MainWindowEvt(this);
		addWindowListener(mwe);
//		액션 이벤트 등록
		jmiSubWin.addActionListener(mwe);
		jmiClose.addActionListener(mwe);
		
		setBounds(10,10,1200,1200);
		setVisible(true);
		
	} //MainWindow

	public JMenuItem getJmiSubWin() {
		return jmiSubWin;
	} //getJmiSubWin

	public JMenuItem getJmiClose() {
		return jmiClose;
	} //getJmiClose
	
} //class

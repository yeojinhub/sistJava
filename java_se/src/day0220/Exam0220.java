package day0220;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

/**
 * 리스트에 아이템이 클릭되면 값을 JTextField추가
 * "추가" 버튼이 눌려지면
 * 이름, 나이,성별,전화번호 를 
 * D.L.M에 추가한다.(JList반영
 * 
 * 리스트에 아이템이 클릭 된 후 
 * "변경" 버튼이 눌려지면 입력된 이름,나이,전화번호를 
 * 사용하여 D.L.M에 추가되어있는 이름과 같은 사람의 나이와 전화번호를
 * 입력된 값으로 변경 
   * 예) DLM아래와 같은 정보가 입력
 * 강태일,22,남,010-1234-5678
 * 
 * 리스트에 아이템이 클릭 된 후 
 * "삭제"버튼이 눌려지면
 * DLM에 입력된 이름과 같은 모든 아이템을 삭제
 * 
 * "종료"버튼이 눌려지면 프로그램을 종료합니다.
 */
@SuppressWarnings("serial")
public class Exam0220 extends JFrame {
	
	private JTextField jtfName;
	private JTextField jtfAge;
	private JTextField jtfNum;
	
	private JRadioButton jbtnMale;
	private JRadioButton jbtnFemale;
	
	private DefaultListModel<String> dlm;
	private JList<String> jl;
	
	private JButton jbtnAdd;
	private JButton jbtnChg;
	private JButton jbtnDel;

	public Exam0220() {
		super("숙제");
//		이름 Component 생성
		JPanel jpName=new JPanel();
		JLabel jlblName=new JLabel("이름");
		jtfName=new JTextField(10);
		
//		나이 Component 생성
		JPanel jpAge=new JPanel();
		JLabel jlblAge=new JLabel("나이");
		jtfAge=new JTextField(10);
		
//		성별 Component 생성
		JPanel jpMale=new JPanel();
		JLabel jlblMale=new JLabel("성별");
		jbtnMale=new JRadioButton("남");
		jbtnFemale=new JRadioButton("여");
		
//		ButtonGroup 생성
		ButtonGroup bg=new ButtonGroup();
		bg.add(jbtnMale);
		bg.add(jbtnFemale);
		
//		전화번호 Component 생성
		JPanel jpNum=new JPanel();
		JLabel jlblNum=new JLabel("전화번호");
		jtfNum=new JTextField(10);
		
//		값을 저장할 list 배열 생성
		dlm = new DefaultListModel<String>();
        jl = new JList<String>(dlm);
        
//		입력받은 텍스트를 출력하는 list Component 생성
        JScrollPane jsp=new JScrollPane(jl);
		
//		이벤트 처리할 Button 생성
		JPanel jpBtn=new JPanel();
		jbtnAdd=new JButton("추가");
		jbtnChg=new JButton("변경");
		jbtnDel=new JButton("삭제");
		JButton jbtnExit=new JButton("종료");
		
//		Component 배치
		jpName.add(jlblName);
		jpName.add(jtfName);
		
		jpAge.add(jlblAge);
		jpAge.add(jtfAge);
		
		jpMale.add(jlblMale);
		jpMale.add(jbtnMale);
		jpMale.add(jbtnFemale);
		
		jpNum.add(jlblNum);
		jpNum.add(jtfNum);

		JPanel jpWest=new JPanel();
		jpWest.setLayout(new GridLayout(4,2));
		
		jpWest.add(jpName);
		jpWest.add(jpAge);
		jpWest.add(jpMale);
		jpWest.add(jpNum);
		
		jpBtn.add(jbtnAdd);
		jpBtn.add(jbtnChg);
		jpBtn.add(jbtnDel);
		jpBtn.add(jbtnExit);
		
		add("West", jpWest);
		add("East", jsp);
		add("South",jpBtn);
		
		Exam0220Evt exe=new Exam0220Evt(this);
		jbtnAdd.addActionListener(exe);
		jbtnChg.addActionListener(exe);
		jbtnDel.addActionListener(exe);
		Exam0220EvtExit exeExit=new Exam0220EvtExit(this);
		jbtnExit.addActionListener(exeExit);
		
//		window 크기 설정
		setBounds(100,100,500,300);
//		가시화
		setVisible(true);
	} //Exam0220
	
	public JTextField getJtfName() {
		return jtfName;
	} //getJtfName

	public JTextField getJtfAge() {
		return jtfAge;
	} //getJtfAge

	public JTextField getJtfNum() {
		return jtfNum;
	} //getJtfNum

	public JRadioButton getJbtnMale() {
		return jbtnMale;
	} //getJbtnMale

	public JRadioButton getJbtnFemale() {
		return jbtnFemale;
	} //getJbtnFemale
	
	public DefaultListModel<String> getListModel() {
		return dlm;
	} //getListModel
	
	public JList<String> getList() {
		return jl;
	} //getList

	public JButton getJbtnAdd() {
		return jbtnAdd;
	} //getJbtnAdd

	public JButton getJbtnChg() {
		return jbtnChg;
	} //getJbtnChg

	public JButton getJbtnDel() {
		return jbtnDel;
	} //getJbtnDel

	public static void main(String[] args) {
		new Exam0220();
	} //main

} //class

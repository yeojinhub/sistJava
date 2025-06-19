package day0123;

/**
 * 마카펜을 대상선정하여 만드는 설계도
 * 마카펜의 추상화(객체모델링)
 *  명사적특징 (눈에 보이는 특징 - 값 저장) : 뚜껑, 몸체, 색
 *  동사적특징 (객체가 제공하는 기능) : 쓴다
 */
public class MarkerPen {
	private int cap;
	private int body;
	private String color;
	
	/**
	 * MarkerPen 클래스의 기본 생성자
	 * 뚜껑 1개, 몸체 1개, 검정색인 MarkerPen 생성
	 */
	public MarkerPen() {
		/*
		cap=1;
		body=1;
		color="검정";
		*/
		
		this(1,2,"검정"); //this 를 사용하면 중복드를 줄일 수 있음
	} //MarkerPen
	
	/**
	 * MarkerPen class 의 매개변수 있는 생성자
	 * 뚜껑, 몸체, 색을 설정한 값으로 생성
	 * 뚜껑과 몸체는 1~10개까지만 설정가능, 색은 검정, 파랑, 빨강으로만 설정가능
	 * 설정되는 값이 맞지 않으면 뚜껑과 몸체는 1개로 설정되고 색은 검정색으로 기본 설정
	 * <p>
	 * 사용법)
	 *  <strong>MakerPen 객체명=new MakerPen(뚜껑의수, 몸체의수, 색깔);</strong>
	 * </p>
	 * @param cap 뚜껑의 개수
	 * @param body 몸체의 개수
	 * @param color 색
	 */
	public MarkerPen(int cap, int body, String color) {
		
		if(!(cap>0 && cap<11)) {
			cap=1;
		} //end if
		
		if(!(body>0 && body<11)) {
			body=1;
		} //end if
		
		if(!("검정".equals(color) || "파랑".equals(color) || "빨강".equals(color))) {
			color="검정";
		} //end if
		
		this.cap=cap;
		this.body=body;
		this.color=color;
	} //MarkerPen
	
	/**
	 * 생성된 MarkerPen 객체의 뚜껑 개수를 설정
	 * 뚜껑의 개수 1개로만 설정 가능
	 * @param cap 설정할 뚜껑의 개수
	 */
	public void setCap(int cap) {
		if(cap!=0) {
			cap=1;
		} //end if
		this.cap=cap;
	} //setCap
	
	/**
	 * 생성된 MarkerPen 객체의 몸체 개수를 설정
	 * 몸체 개수 1개로만 설정 가능
	 * @param body
	 */
	public void setBody(int body) {
		if(body !=1) {
			body=1;
		} //end if
		this.body=body;
	} //setBody
	
	/**
	 * 생성된 MarkerPen 객체의 색을 설정
	 * 색은 검정, 파랑, 빨강 3개의 색으로만 설정 가능
	 * 다른 색이 설정되면 기본 값은 검정
	 * @param color =검정, 파랑, 빨강
	 */
	public void setColor(String color) {
		if(!("검정".equals(color) || "파랑".equals(color) || "빨강".equals(color))) {
			color="검정";
		} //end if
		this.color=color;
	} //setColor
	
	/**
	 * 생성된 MarkerPen 객체의 설정된 뚜껑의 개수를 얻기
	 * @return cap=뚜껑의 수
	 */
	public int getCap() {
		return cap;
	} //getCap
	
	/**
	 * 생성된 MarkerPen 객체의 설정된 몸체의 개수를 얻기
	 * @return body=몸체의 수
	 */
	public int getBody() {
		return body;
	} //getBody
	
	/**
	 * 생성된 MarkerPen 객체의 설정된 색을 얻기
	 * @return color=색깔
	 */
	public String getColor() {
		return color;
	} //getColor

	/**
	 * MakerPen 객체의 쓰는 일에 대한 동사적인 특징을 구현한 method
	 * 
	 * @param msg 칠판에 쓸 메세지
	 * @return msg+"를 칠판에 쓴다" 작성결과 값 변환
	 */
	public String write(String msg) {
		return color+"색으로 \""+msg+"\"를 칠판에 쓴다";
	} //write
	
} //class

package day0207;

import day0205.Fly;

/**
 * Fly 를 구현하는 클래스를 작성
 */
public class FlyImplement implements Fly {

	@Override
	public String lift() {
		return "양력";
	} //lift

	@Override
	public String thrust() {
		return "추진력";
	} //thrust

} //class

package day0226;

import java.io.Serializable;

/**
 * 사용자의 데이터를 저장하는 class
 */
public class UserDataVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8932987414648042889L;
	private /*transient*/ String name;
	private /*transient*/ double height;
	private double weight;
	
	
	public UserDataVO() {
		super();
	} //UserDataVO
	
	public UserDataVO(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	} //UserDataVO
	
	public String getName() {
		return name;
	} //getName
	
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "UserDataVO [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
} //class

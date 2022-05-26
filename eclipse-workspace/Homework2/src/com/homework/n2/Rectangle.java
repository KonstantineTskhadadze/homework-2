package com.homework.n2;

/***
 * 
 * @author ktskh
 *task2
 */
public class Rectangle {
	private double width;
	private double heigh;
	

	public Rectangle(double width, double heigh) {
		this.width = width;
		this.heigh = heigh;
	}
	
	public Rectangle() {}

	public double getPerimeter() {
		return 2 * (getHeigh() + getWidth());
	}
	
	public double getArea() {
		return getHeigh() * getWidth();
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigh() {
		return heigh;
	}

	public void setHeigh(double heigh) {
		this.heigh = heigh;
	}
	
}

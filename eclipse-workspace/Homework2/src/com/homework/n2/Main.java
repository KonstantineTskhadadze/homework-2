package com.homework.n2;

/***
 * 
 * @author ktskh
 *tasks 1, 3, 4, 5
 */
public class Main {
	
	//task 4
	public static int compareTo(Rectangle a, Rectangle b) {
		return a.getArea() > b.getArea() ? 1
				: a.getArea() < b.getArea() ? -1
				: 0;
	}

	public static void main(String[] args) {
		
		//task 1
		
		System.out.println("Hello World");
		
		//task 3.1
		//Rectangle uninitionalised;
		//uninitionalised.getPerimeter(); compliation error
		
		//task 3.2
		Rectangle nullRectangle = null;
		try {
			nullRectangle.getPerimeter();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		//task 3.3
		Rectangle noSetters = new Rectangle();
		System.out.println(noSetters.getHeigh() + " " + noSetters.getWidth());
		
		//task 3.4
		{
			Rectangle rect1 = new Rectangle(10, 20);
			Rectangle rect2 = new Rectangle(10, 20);
			System.out.println(rect1 == rect2);
		}
		{
			Rectangle rect1 = new Rectangle(10, 20);
			Rectangle rect2 = rect1;
			System.out.println(rect1 == rect2);
		}
		
		//task 3.5
		{
			Rectangle rect1 = new Rectangle(10, 20);
			Rectangle rect2 = rect1;
			rect2.setHeigh(100);
			System.out.println(rect1.getHeigh());
		}
		
		
		//task 4
		System.out.println(compareTo(new Rectangle(10, 10), new Rectangle(10 ,20)));
	
		//task5
		{
			double d;
			//d *= 8; compilation error
		}
		double d;
	}
}
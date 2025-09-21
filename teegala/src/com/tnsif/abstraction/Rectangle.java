package com.tnsif.abstraction;

public class Rectangle extends Shape{
	private int height=5,width=2;
	public Rectangle(int height,int width) {
		this.height=height;
		this.width=width;
	}
	void calArea() {
		super.area=height*width;
	}
}

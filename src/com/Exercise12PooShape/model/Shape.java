package com.Exercise12PooShape.model;

public class Shape implements Shapeable {

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Figure is being drawn";
	}

	@Override
	public String ChangeColor() {
		// TODO Auto-generated method stub
		return "Shape is changing color";
	}

	@Override
	public String Erase() {
		// TODO Auto-generated method stub
		return "Shape is bieng erased";
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

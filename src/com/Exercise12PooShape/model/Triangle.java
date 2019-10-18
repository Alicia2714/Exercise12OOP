package com.Exercise12PooShape.model;

import java.lang.Math;

public class Triangle extends Shape {
	
	//variable declaration
	private double base;
	private double height;
	public double area;
	private double perimeter;
	protected String name;
	
	public Triangle() {
		
	}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double CalcularArea(double base, double height) {
		return (base*height)/2;
	}
	
	public double CalcualrPerimeter(double base, double height) {
		return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
	}
	
	public double CalculatePerimeter() {
		this.perimeter = Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.height, 2)); 
		
		return 0;
	}
	
	//getters and setters
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void DoSomething() {
		// TODO Auto-generated method stub
		
	}

}

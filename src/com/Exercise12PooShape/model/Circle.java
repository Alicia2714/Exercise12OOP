package com.Exercise12PooShape.model;

import java.lang.Math;

public class Circle extends Shape {
	
	//variable declaration
	private double radio;
	
	//Constructors
	public Circle() {
		
	}
	
	public Circle(double radio) {
		this.radio = radio;
	}
	
	public double CalculateArea(double radio) {
		return Math.PI*(Math.pow(radio, 2));
	}
	
	public double CarculatePerimeter(double radio) {
		return 2*Math.PI*radio;
	}
	
	//getters and setters
	public double getCircle(double radio) {
		return radio;
	}
	
	
	public void setCircle(double radio) {
		this.radio = radio;
	}


}

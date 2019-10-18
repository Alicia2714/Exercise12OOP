package com.Exercise12PooShape.model;

import java.lang.Math;

public class Square {
	private double side;
	
	public Square() {
		
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public double CalculateArea(double side) {
		return side*side;
	}
	
	public double CalculatePerimeter(double side) {
		return side*4;
	}
	
	//getters and setters
	public double getSquare(double side) {
		return side;
	}
	
	public void setSquare(double side) {
		this.side = side;
	}

}

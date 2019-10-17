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
		return (Math.pow(side, 2)*Math.pow(side, 2));
	}
	
	public double CalculatePerimeter(double side) {
		return Math.pow(side, 2)*4;
	}
	
	//getters and setters
	public double getSquare(double side) {
		return side;
	}
	
	public void setSquare(double side) {
		this.side = side;
	}

}

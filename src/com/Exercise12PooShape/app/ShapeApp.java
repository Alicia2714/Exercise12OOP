package com.Exercise12PooShape.app;

import com.Exercise12PooShape.model.Square;
import com.Exercise12PooShape.model.Circle;
import com.Exercise12PooShape.model.Triangle;
import java.lang.Math;
import java.util.Scanner;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Variable declarations
		double side = 0;
		double radio = 0;
		double base = 0;
		double height = 0;
		
		//Objects declaration
		Square square1 = new Square();
		Circle circle1 = new Circle();
		Triangle triangle1 = new Triangle();
		
		Square square2 = new Square(5);
		Circle circle2 = new Circle(4);
		Triangle triangle2 = new Triangle(6,8);
		
		Scanner input = new Scanner(System.in);
		
		//Ask the user to input the values
		System.out.println("Enter the side of the square: ");
		side = input.nextDouble();
		
		System.out.print("The area of the square is: " + square2.CalculateArea(side));
		System.out.print("\n The perimeter of the square is: " + square2.CalculatePerimeter(side));
		
		System.out.print("\n Introduce the radio of the circle: ");
		radio = input.nextDouble();
		
		System.out.print("The area of the circle is: " + circle2.CalculateArea(radio));
		System.out.print("\n The perimeter of the circle is: " + circle2.CarculatePerimeter(radio));
		
		System.out.print("\n Introduce the base of the triangle: ");
		base = input.nextDouble();
		System.out.print("\n Introduce the height of the triangle: ");
		height = input.nextDouble();
		
		System.out.print("The area of the triangle is: " + triangle2.CalcularArea(base, height));
		System.out.print("\n The perimeter of the triangle is: " + triangle2.CalcualrPerimeter(base, height));
		
		
	}

}

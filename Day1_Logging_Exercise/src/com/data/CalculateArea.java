package com.data;

public class CalculateArea {
	
	public double areaTriangle(int height,int base)
	{
		double area= 0.5* height* base;
		return area;
	}
	
	public double areaCircle(int radius)
	{
		double area= (22/7)*radius * radius;
		return area;
	}
	
	public double areaSquare(int side)
	{
		double area= side *side;
		return area;
	}
	
}

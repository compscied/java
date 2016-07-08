package com.simple.math;


public class Calculator {
		
	public double add(double x, double y)
	{
		double calc = x+y;
		
		return calc;
	}
	
	public double subtract(double x, double y)
	{
		double calc = x-y;
		
		return calc;
	}
	
	public double multiply(double x, double y)
	{
		double calc = x*y;
		
		return calc;
	}
	
	public double divide(double x, double y)
	{
		double calc = x/y;
		
		return calc;
	}
	
	public double power(double x, double power )
	{
		double calc = Math.pow(x, power); 
		
		return calc;
	}
	
	
	public double squareRoot(double x )
	{
		double calc = Math.sqrt(x); 
		
		return calc;
	}
	
}

package com.linecomparision;

import java.util.*;

public class LineComparision {
	
	static int x1,y1,x2,y2;
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Line Comparision Program");
		
		getPoints();
		
		System.out.println("The Length of the Line is "+calculateLength(x1, y1, x2, y2));
		
	}
	
	static void getPoints()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter coordinate of point 1: x1 and y1");
		x1=scan.nextInt();
		y1=scan.nextInt();
		System.out.println("Please Enter coordinate of point 2: x2 and y2");
		x2=scan.nextInt();
		y2=scan.nextInt();
		
		System.out.println("These are the coordinates ("+x1+","+y1+") and ("+x2+","+y2+")");
	}
	
	static double calculateLength(int x1,int y1,int x2,int y2)
	{
		
		double leng;
		leng=Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
		return leng;
	}

}

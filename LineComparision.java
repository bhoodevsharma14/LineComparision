package com.linecomparision;

import java.util.*;

public class LineComparision {
	
	static int x1,y1,x2,y2;
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Line Comparision Program");
		
		
		double line1,line2,difference;
		System.out.println("Getting Coordinates of Line 1");
		getPoints();
		line1=calculateLength(x1, y1, x2, y2);
		
		System.out.println("Getting Coordinates of Line 2");
		getPoints();
		line2=calculateLength(x1, y1, x2, y2);
		
		difference=line1-line2;
		if(difference==0)
			System.out.println("Both The Lines Are EQUAL In Length!!");
		else if(difference>0)
			System.out.println("Line1 is Greater Than Line2 ");
		else
			System.out.println("Line1 is Smaller Than Line2 ");
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
		
//		System.out.println("\nThese are the coordinates ("+x1+","+y1+") and ("+x2+","+y2+")\n");
	}
	
	static double calculateLength(int x1,int y1,int x2,int y2)
	{
		
		double leng;
		leng=Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
		System.out.println("\nThese are the coordinates ("+x1+","+y1+") and ("+x2+","+y2+") and the Length is "+leng+"\n");
		return leng;
	}

}

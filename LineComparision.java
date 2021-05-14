package com.linecomparision;

import java.util.*;

public class LineComparision {
	
	int x1,y1,x2,y2;	
	double length;
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Line Comparision Program");
		
		LineComparision line1 = new LineComparision();
		line1.getPoints();
		line1.length=line1.calculateLength(line1.x1, line1.y1, line1.x2, line1.y2);
		
		LineComparision line2 = new LineComparision();
		line2.getPoints();
		line2.length=line2.calculateLength(line2.x1, line2.y1, line2.x2, line2.y2);
		
		compareTwoLines(line1.length, line2.length);
	}
	
	public void getPoints()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter coordinate of point 1: x1 and y1");
		this.x1=scan.nextInt();
		this.y1=scan.nextInt();
		System.out.println("Please Enter coordinate of point 2: x2 and y2");
		this.x2=scan.nextInt();
		this.y2=scan.nextInt();		
	}
	
	public double calculateLength(int x1,int y1,int x2,int y2)
	{
		
		double leng;
		leng=Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
		System.out.println("\nThese are the coordinates ("+x1+","+y1+") and ("+x2+","+y2+") and the Length is "+leng+"\n");
		return leng;
	}

	public static void compareTwoLines(double l1,double l2)
	{
		double difference=l1-l2;
		if(difference==0)
			System.out.println("Both The Lines Are EQUAL In Length!!");
		else if(difference>0)
			System.out.println("Line1 is Greater Than Line2 ");
		else
			System.out.println("Line1 is Smaller Than Line2 ");
	}
}

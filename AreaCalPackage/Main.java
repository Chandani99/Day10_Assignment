package AreaCalPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Shape sp=new Area();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter length");
		int l=sc.nextInt();
		
		System.out.println("enter breadth");
		int b=sc.nextInt();
		
		System.out.println("enter side");
		int s=sc.nextInt();
		
		System.out.println("enter radious");
		int r=sc.nextInt();
		
		int ractArea=sp.rectangleArea(l, b);
		int sqArea=sp.squareArea(s);
		double cirArea=sp.circleArea(r);
		
		System.out.println("Area of ractangle: "+ractArea);
		System.out.println("Area of squre: "+sqArea);
		System.out.println("Area of Circle: "+cirArea);
	}

}

package myfirstpackage;

import java.util.Scanner;

public class DemoArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// area for rectangle
//		
		float x;
		float y ;
//		
//		System.out.println("Area for Rectangle : "+CalculateArea.calculateRectrangleArea(x, y));
//		
//		
//		
//		
//		System.out.println("Enter the name");
//		String name = scan.next();
//		
//		CalculateArea.printMyNameUppercase(name);
		int condition = 0;
		do {
			System.out.println("Welcome to Menu");
			System.out.println("1 Find Area of Reactangle\n 2 Find Area of Circle\n 3 Area of Triangle");
			System.out.println("Enter you choice");
			int ch = scan.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter value for x");
				 x = scan.nextFloat();
				System.out.println("Enter value for y");
				 y = scan.nextFloat();
				 System.out.println("Area for Rectangle : "+CalculateArea.calculateRectrangleArea(x, y));
				break;
			case 2:
				System.out.println("Enter value for radis");
				 x = scan.nextFloat();
				CalculateArea.calculateCircle(x);
				System.out.println("Area for Circle : "+CalculateArea.calculateCircle(x));
				break;
			case 3:
				System.out.println("Enter value for x");
				 x = scan.nextFloat();
				System.out.println("Enter value for y");
				 y = scan.nextFloat();
				System.out.println("Area for Triangle : "+CalculateArea.calculateTriangle(x, y));
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
			
			System.out.println("Do you want to continue... press 1 else press 0");
			condition = scan.nextInt();
		}while(condition == 1);
		
	}
}

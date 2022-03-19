package myfirstpackage;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println(6>=7);
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter the value");
//		int x = scanner.nextInt();
//		
//		System.out.println("Enter the value");
//		int y = scanner.nextInt();
//		
//		System.out.println("Enter the value");
//		int z = scanner.nextInt();
//		//syntax of if and else
//		if(x > y && x > z) {
//			System.out.println("x is greater = "+x);
//		}else if(y > x && y > z) {
//			System.out.println("y is greater = "+y);
//		}else {
//			System.out.println("z is greater = "+z);
//		}
//		
//		if(x<y) {
//			System.out.println("x is small using if else");
//		}else {
//			System.out.println("y is small using if else");
//		}
//		
//		System.out.println(x < y ? "x is small using ternary op" : "y is small ternary op");
//		
//		System.out.println("Enter day no");
//		int dayNo = scanner.nextInt();
		
//		if(dayNo == 1) {
//			System.out.println("Monday");
//		}
//		
//		if(dayNo == 2) {
//			System.out.println("Thu");
//		}
//		
//		if(dayNo == 3) {
//			System.out.println("Wed");
//		}
//		
//		if(dayNo == 4) {
//			System.out.println("Thu");
//		}
//		
//		if(dayNo == 5) {
//			System.out.println("Fri");
//		}
//		
//		if(dayNo == 6) {
//			System.out.println("Sat");
//		}
//		
//		if(dayNo == 7) {
//			System.out.println("Sunday");
//		}
		
//		switch(dayNo) {
//		case 1 : System.out.println("Monday");
//		break;
//		case 2 : System.out.println("Tue ");
//		break;
//		case 3 : System.out.println("Wed");
//		break;
//		case 4 : System.out.println("Thu");
//		break;
//		case 5 : System.out.println("Fri");
//		break;
//		case 6 : System.out.println("Sat");
//		break;
//		case 7 : System.out.println("Sun");
//		break;
//		default : System.out.println("invalid");
//		break;
//		}
		
		
		int a = 5;
		
		//postfix increment
		System.out.println(a++);
		System.out.println(a);
		
		a++;
		
		System.out.println(a);
		
		//prefix
		
		System.out.println(++a);
		System.out.println(a);
	}
}

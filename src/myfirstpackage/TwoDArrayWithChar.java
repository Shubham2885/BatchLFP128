package myfirstpackage;

import java.util.Scanner;

public class TwoDArrayWithChar {

	public static void main(String[] args) {
		System.out.println("Wolcome");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of rows");
		byte row = scanner.nextByte();

		System.out.println("Enter the size of cols");
		byte col = scanner.nextByte();

		char matrix[][] = new char[row][col];

		byte i = 0;
		byte j;

		while(i<row) {
			j=0;
			while(j<col) {
				System.out.println("Enter value for this index = ["+i+","+j+"] = ");
				matrix[i][j] = scanner.next().charAt(0);
				j++;
			}
			i++;
		}

		System.out.println("***********************Matrix************************");
		i = 0;
		while(i<row) {
			j=0;
			while(j<col) {
				System.out.print(matrix[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}

	}
}

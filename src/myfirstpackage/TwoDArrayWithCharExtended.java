package myfirstpackage;

import java.util.Scanner;

public class TwoDArrayWithCharExtended {

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

		printMatrix(matrix, row, col);

		byte ch = 1;

		do {
			System.out.println("Which Location do you want to value");
			byte loc = scanner.nextByte();

			System.out.println("Enter the value for given location");
			char value = scanner.next().charAt(0);

			byte m = 1;
			i=0;
			while(i<row) {
				j=0;
				while(j<col) {
					if(m == loc) {
						matrix[i][j] = value;
						break;
					}
					m++;
					j++;
				}
				i++;
			}

			printMatrix(matrix, row, col);

			System.out.println("Do you want to continue... press 1");
			ch = scanner.nextByte();
		}while(ch == 1);
	}

	public static void printMatrix(char matrix[][], byte row, byte col) {
		System.out.println("***********************Matrix************************");
		byte i = 0;
		while(i<row) {
			byte j=0;
			while(j<col) {
				System.out.print(matrix[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

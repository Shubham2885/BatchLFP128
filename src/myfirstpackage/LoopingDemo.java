package myfirstpackage;

public class LoopingDemo {

	public static void main(String[] args) {
		//3 loops for, while, do-while
		
		/*
		 * //syntax for(byte index = 1 ; index <= 10 ; index++) { //statement
		 * System.out.println(index+" Shubham"); }
		 * 
		 * int number = 12345; //syntax int sum = 0; while(number != 0) { //statement
		 * int rem = number%10; sum = sum * 10 + rem; number = number/10; }
		 * 
		 * System.out.println("Reverse ="+sum); int x = 1;
		 * 
		 * while(x == 2) { System.out.println("shubham"); }
		 * 
		 * do { System.out.println("Do while-> Shubham"); }while(x == 2);
		 */
		
		//no of row lines
		for(int i=0;i<10;i++) {
			// no of col
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}

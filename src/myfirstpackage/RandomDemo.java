package myfirstpackage;

public class RandomDemo {

	public static void main(String[] args) {
		for(int i=0;i<50;i++) {
			double value = Math.random();
			byte x = (byte) (value * 10);
			System.out.println("value = "+x );
		}
		
		//implicite type casting lower data type to higher data type
		byte a = 10;
		int aa = a;
		float aaa = aa;
		System.out.println(aaa);
		double aaaa = aaa;
		System.out.println(aaaa);
		
		//explicite type casting higher data type to lower data type
		double b = 5.6;
		float bb = (float) b;
		System.out.println(bb);
		int bbb = (int) b;
		System.out.println(bbb);
		
	}
}

package myfirstpackage;

public class CalculateArea {
	
	final static float PI = 3.142f;

	public static float calculateRectrangleArea(float x, float y) {
		//local variable 
		float z = x * y;
		return z;
	}
	
	public static float calculateCircle(float r){
		float z = PI * r * r ;
		return z;
	}
	
	public static float calculateTriangle(float x, float y){
		float z = 0.5f * x * y;
		return z;
	}
//	public static float getPI() {
//		return 3.142f;
//	}
}

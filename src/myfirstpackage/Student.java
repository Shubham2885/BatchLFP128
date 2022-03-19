package myfirstpackage;

public class Student {

	static String f_name;
	String l_name;
	String address;
	int roll_no;
	String collegeName;
	int totalMarks;

	//not return something and not take any value
	public void printStudentDetails() {
		System.out.println("Student Details =>");
		System.out.println("Name :: "+f_name);
		System.out.println("SurName :: "+l_name);
		System.out.println("Address :: "+address);
		System.out.println("Roll No :: "+roll_no);
		System.out.println("College Name :: "+collegeName);
		System.out.println();
	}
	
	//return any type of data but not take any value
	public String getCollegeName() {
		return "CEOK";
	}

	//return something but take any paramenter
	public float calculatePersentage(float bestOfFive) {
		System.out.println(totalMarks);
		float persentage = (float)(totalMarks/bestOfFive) * 100;
		System.out.println("Persent of Student is = "+persentage);
		return persentage;
	}
	
	//not return something but take any value
	//method define or function define
	public static void printCollegeResult(float agv) {
		System.out.println("College Result is = "+agv);
	}
	
	public static float calcualteAvg(float persentage1, float persentage2) {
		return (persentage1 + persentage2) / 2;
	}
	
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.f_name = "Shubham";
		student1.l_name = "Chavan";
		student1.address = "Nagpur";
		student1.roll_no = 1;
		student1.collegeName = student1.getCollegeName();
		student1.totalMarks = 540;
		student1.printStudentDetails();
		//while calling if you are passing the value that called as arguments
		float per1 = student1.calculatePersentage(550);
		
		Student student2 = new Student();
		student2.f_name = "Anmol";
		student2.l_name = "Mane";
		student2.address = "Bhandara";
		student2.roll_no = 2;
		student2.collegeName = student2.getCollegeName();
		student2.totalMarks = 530;
		student2.printStudentDetails();
		float per2 = student2.calculatePersentage(600);
		
		float agv = calcualteAvg(per1, per2);
		
		printCollegeResult(agv);
	}
	
	//not return and not take
	//not return and take
	//return and not take
	//return and take
}

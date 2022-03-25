package myfirstpackage;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//syntax
		
		//datatype arrayName[] = new datatype[size];
		
		byte tableOf2[] = new byte[10];
		
		tableOf2[0] = 7;
		tableOf2[3] = 100;
		System.out.println(tableOf2[0]);
		System.out.println(tableOf2[2]);
		System.out.println(tableOf2[3]);
		
		System.out.println(tableOf2.length);
		for(int index = 0; index < 5; index++) {
			System.out.println(1+index);
			tableOf2[index] =(byte)(1+index);
		}
		
		for(int index = 0; index < tableOf2.length; index++) {
			System.out.println("tableOf2["+index+"] = "+tableOf2[index]);
		}
		
		int rollno[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(rollno.length);
		
		for(int index = 0; index < rollno.length; index++) {
			System.out.println("rollno["+index+"] = "+rollno[index]);
		}
		
		//declaration
		String nameOfStudents[] = new String[10];
		
		for(int index = 0; index < 10; index++) {
			nameOfStudents[index] = "Shubham"+index;
		}
		
		for(int index = 0; index < nameOfStudents.length; index++) {
			System.out.println("nameOfStudents["+index+"] = "+nameOfStudents[index]);
		}
		
		String surnameOfStudents[] = {"Chavan", "Mane", "Kawale", "Kohli"};
		
		for(int index = 0; index < surnameOfStudents.length; index++) {
			System.out.println("surnameOfStudents["+index+"] = "+surnameOfStudents[index]);
		}
		
		
		Student students[] = new Student[5];
		
		Student student1 = new Student();
		student1.f_name = "Shubham";
		student1.l_name = "Chavan";
		student1.roll_no = 10001;
		student1.address = "Nagpur";
		student1.collegeName = "Sinhgad College of Engg. Pune";
		student1.totalMarks = 1680;
		
		Student student2 = new Student();
		student2.f_name = "Raj";
		student2.l_name = "Kawale";
		student2.roll_no = 10002;
		student2.address = "Gondia";
		student2.collegeName = "YCC Nagpur";
		student2.totalMarks = 1780;
		
		students[0] = student1;
		students[1] = student2;
		
		for(int index = 0; index < students.length; index++) {
			Student student = students[index];
			if(student != null) {
				System.out.println("students["+index+"] =>");
				students[index].printStudentDetails();
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many student do you want to add into the array, Enter the size");
		int size = scanner.nextInt();
		System.out.println("Enter the 5 student name");
		
		String nameOfStudent[] = new String[size];
		for(int index = 0; index < size; index++) {
			System.out.println("Enter name for index = "+ index);
			nameOfStudent[index] = scanner.next();
		}
		
		for(int index = 0; index < size; index++) {
			System.out.println("nameOfStudent["+index+"] = "+nameOfStudent[index]);
		}
		
	}
}

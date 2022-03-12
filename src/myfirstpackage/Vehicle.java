package myfirstpackage;

//class is blueprint or structure of real world entity
public class Vehicle {

	//properties
	//instance variable
	String typeOfVehicle;
	byte noOfWheels;
	String modelNo;
	String brand;
	String modeOfTranspotation;
	byte noOfGear;
	byte seatingCapacity;
	int engineInHP;
	String flueType;
	String color;
	String regNo;
	byte mileage;
	short topSpeed;
	
	
	public void something() {
		//local variable
		int x = 100;
	}
	
	public static void main(String args[]) {
		//LHS = Reference variable 
		//RHS = Object/instance creation
//		Vehicle bus = null;
//		bus.brand = "tata";
//		System.out.println("Brand name = "+bus.brand);
		
		Vehicle car = new Vehicle();
		car.typeOfVehicle = "Car";
		car.noOfWheels= 4;
		car.modelNo = "Nexa EV";
		car.brand = "TATA";
		car.modeOfTranspotation = "Passenger";
		car.noOfGear = 5;
		System.out.println("typeOfVehicle = "+car.typeOfVehicle+" noOfWheels = "+car.noOfWheels);
		System.out.println("modelNo = "+car.modelNo);
		System.out.println("brand = "+car.brand);
		System.out.println("modeOfTranspotation = "+car.modeOfTranspotation);
		System.out.println("noOfGear = "+car.noOfGear);
		int x =10;
		System.out.println(x);
		
		//variable declaration
		int y;
		
		//initize the value..
		y = 12;
		
		//variable initilizatioin
		int z = 50;
		System.out.println(y);
	}
}


//Object is real time entity

//3 types of variable 
//1 local variable
//2 static variable
//3 instance variable
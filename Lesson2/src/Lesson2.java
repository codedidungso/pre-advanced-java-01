
public class Lesson2 {

	public static void main(String[] args) {
		Vehicle c = new Car();
		Vehicle b = new Bike();
		c.move();
		b.move();
		System.out.println("======");
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(1000);
		Vehicle v3 = new Vehicle("Thien");
	}

}

class Hooman{
	public String ten;
	protected int luong;
	private String job;
	
	void saysomething(String smt) {
		System.out.println(smt);
	}
	void kind() {
		System.out.println("Hooman");
	}
}
// ke thua public 
// ke thua protected 

class Student extends Hooman{
	@Override
	void kind() {
		System.out.println("Student");
	}
}

// Vehicle
//		name, price 
//		move // Car is moving.
//			// Bike is moving.
	// 		Car, Bike, ... 
	// 		name, owner, price, brand ...
	// 		move, sayName, getPrice, .... 


class Vehicle {
	String owner;
	int price;
	Vehicle(){
		System.out.println("A vehicle is created");
	}
	Vehicle(int price){
		System.out.println("A vehicle is created with price = " + price);
		this.price = price;
	}
	Vehicle(String owner){
		System.out.println("A vehicle is created with owner = " + owner);
		this.owner = owner;
	}
	
	void move() {
		System.out.println("This is a vehicle");
	};
}

class Bike extends Vehicle{ // price = 1tr 
	int wheels;
	Bike(){
		super(1000);
		System.out.println("Bike is created");
	}
	void move() {
		super.move();
		System.out.println("Bike is moving");
	}
	
}

class Car extends Vehicle{
	String brand;
	
	Car(){
		super("Thien");
		System.out.println("Car is created");
	}
	
	
	void move() {
		super.move();
		System.out.println("Car is moving");
	}
}

// class Shape 
//	chuVi, dienTich
// 	getter setter

	// class Square 
	// 	edge
	
	// class Round
	// range

	// class Rectangle
	// height, width

	// class Triangle
	// e1 e2 e3


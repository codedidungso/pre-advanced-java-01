import java.util.Scanner;

public class Lesson01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ... 
		Person thangCu = new Person();
		thangCu.setName("Le Duc Thang");
		thangCu.setAge("21");
		thangCu.setMale(false);
		
		System.out.println("Ten: " + thangCu.getName());
		System.out.println("Tuoi: " + thangCu.getAge());
		if(thangCu.isMale()) {
			System.out.println("Duc");
		} else {
			System.out.println("Cai");
		}
		// input output a list of people 
		Scanner sc = new Scanner(System.in);
		
		Person[] listPeople = new Person[10];
		for (int i = 0; i < listPeople.length; i++) {
			listPeople[i] = new Person();
			System.out.println("Input name: "); 
			listPeople[i].setName(sc.nextLine()); //
			System.out.println("Input age: "); 
			//listPeople[i].setAge(Integer.parseInt(sc.nextLine())); //
			listPeople[i].setAge(sc.nextLine()); 
		}
		
		for (int i = 0; i < listPeople.length; i++) {
			System.out.println("Ten nguoi thu " + i +" la: " + listPeople[i].getName() + "");
		}
		
		for (int i = 0; i < listPeople.length; i++) {
			System.out.println("is male(1 for male, 2 for femail)? ");
			if(sc.nextLine()=="1") listPeople[i].setMale(true);
			else listPeople[i].setMale(false);
		}
		// print 
	}
}

// OOP Object-Oriented Programming 
// Class 

class Person {
	// properties - variable name is a noun / expect boolean
	// methods
	Person() {
		System.out.println("Initialize new people");
		name = "unnamed";
		age = -1;
		isMale = false;
	}
	// get + noun
	// set + noun

	String name;
	int age;
	boolean isMale;

	public int getAge() {
		return age;
	}

	public void setAge(String age) {
		try {
			this.age = Integer.parseInt(age);	
		} catch (Exception e) {
			System.out.println("Nhap sai tuoi.");
		}
		
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	// getter
	String getName() {
		return name;
	}

	// setter
	void setName(String name) {
		this.name = name;
	}

	static String race() {

	}
}

// Object.xxx is a instance of Class.xxx

class HocSinhLop12A {
	String name;
	int diemToan;
	static String tenLop;

	public HocSinhLop12A() {

	}

}

class Mathematics {
	public static final double PI = 3.14;
}
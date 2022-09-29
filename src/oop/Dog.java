package oop;

public class Dog {
	String breed;
	String color;
	int age;
	double weight;
	
	void loyal () {
		System.out.println("protect family");
	}
	void playing () {
		System.out.println("like to play with kids");
	}
public static void main(String[] args) {
	Dog dog=new Dog();
		dog.breed="Akita Pit";
		dog.age=2;
		dog.weight=10;
		
		System.out.println("breed "+ dog.breed + "age "+ dog.age);
		dog.loyal();
		
		System.out.println();

		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.age=3;
		dog1.weight=7;
		
		System.out.println("breed "+ dog1.breed + "age "+ dog1.age);
		dog1.playing();
}

}

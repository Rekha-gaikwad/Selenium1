package oops.polymorphism;

public class User {

	public static void main(String[] args) {
		
		StaticPolymorphism obj = new  StaticPolymorphism();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		//1.when we use parent class ref for child class object then we can only call functons which are present in parent calss
		//2.we can use parent class ref for child class object
		//object then we can only call functions which are present in parent class
		//3.when we use parent class reference for child class object then overriden 
		//function will get call from child class
		//Upcasting/Runtime Binding/ Dynamic Polymorphism
		
		Telephone phone0=new Telephone();
		phone0.calling();
		
		Telephone phone=new Mobile();
		phone.calling();
		
		Telephone phone2=new Smartphone();
		phone2.calling();
		
		
		
		
		

	}

}

package constructor;

public class Car {
	//Instance variables
	String colour;
	String type;
	String fuelType;
	//Class Variables - static
	
	public static int wheels=4;
	
	public void features() {
		System.out.println(colour+" colour "+type+" "+fuelType+" car");
	}
	
	public Car() 
	{
		//default consructor
		//Constructor name will always have a class name
		//Constructor dsnt have any return type
		//Every class by default has a default constructor
	}
	
	public Car(String colour, String type, String fuel)
	{
		//parameterised 
		
		this.colour=colour;
		this.type=type;
		this.fuelType=fuel;
	}
	}
	


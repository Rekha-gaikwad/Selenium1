package constructor;

public class carUsers {

	public static void main(String[] args) {
		
		//Object is and instance of a class
		//Primitive - int, short, byte, long, double, boolean, float, char
		//Non primitive =classes, arrays, interfaces
		
	//Datatype				//Obj Ref        //Obj Ref
		
		Car                  car1=           new Car();
		//car1.colour= "Red";
	//	car1.fuelType= "Diesel";
	//	car1.type="SUV";		
	//	car1.features();
		
	//	Car car2= new Car();
	//car2.colour= "Blue";
	//	car2.fuelType = "Petrol";
	//	car2.type = "Sedan";
		//car2.features();
		
	/*
	 * Car car3= new Car(); car3.colour= "White"; car3.fuelType = "CNG"; car3.type =
	 * "Hatchback"; car3.features();
	 */
		
		Car car4= new Car("white", "SUV", "Petrol");
				car4.features();
				Car car5= new Car();
				car5.features();
	}
}

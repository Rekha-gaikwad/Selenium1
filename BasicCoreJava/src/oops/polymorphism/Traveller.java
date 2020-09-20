package oops.polymorphism;

public class Traveller {

	public static void main(String[] args) {
		
		
		Vehicle a=null;
		String abc="Car";
		
		if (abc.equals("cycle"))
		{
			a=new Cycle();
		}else if (abc.equals("bike"))
		{
			a=new Bike();
		}else if (abc.equals("car"))
		{
			a=new Car();
		}
		
		a.travelling();
		

	}

}

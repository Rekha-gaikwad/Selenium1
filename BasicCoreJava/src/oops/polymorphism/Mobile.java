package oops.polymorphism;

public class Mobile extends Telephone
{
	//Method Overriding - when we have same methods with same parameters in both child and parents class then the conceptis knows as Method Overrifding
	public void texting()
	
	{
		System.out.println("texting from Mobile");
	}

	
	public void calling()
	{
		System.out.println("Calling from Mobile");
	}
}

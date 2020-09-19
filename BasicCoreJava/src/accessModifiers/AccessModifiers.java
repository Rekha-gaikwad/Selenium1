package accessModifiers;

public class AccessModifiers {
	public static void main(String[] args) {
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultFunction();
		obj.protectedFunction();
	}
	
	//Public, Private, Protected, No-Access Mod/Default
	
	//public==>Can be accessed throughout the project 
	//||Within Class - Y||Within Package- Y||Within Project - Y
	
	
	//private==>Can be accessed only within the class
	//||Class - Y||Package- No|| Project -No
	
	
	//default==>Can be accessed within the package
	//||Class - Y||Package- Y|| Project - No
	
	
	//protected==>Can be accessed within the package 
	//and can be accessed outside the package by using child class object
	//||Class - Y||Package- Y|| Project - No*
	
	
	public void publicFunction()
	{
		System.out.println("Public Function");
	}
	
	private void privateFunction()
	{
		System.out.println("Private Function");
	}
	
	void defaultFunction()
	{
		System.out.println("No access modifiers function");
	}
	
	protected void protectedFunction()
	{
		System.out.println("Protected access modifiers");
	}

}

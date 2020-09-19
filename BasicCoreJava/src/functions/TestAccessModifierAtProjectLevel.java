package functions;

import accessModifiers.AccessModifiers;

public class TestAccessModifierAtProjectLevel extends AccessModifiers {
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		TestAccessModifierAtProjectLevel obj2 = new TestAccessModifierAtProjectLevel();
		obj2.protectedFunction();
		
	}

}

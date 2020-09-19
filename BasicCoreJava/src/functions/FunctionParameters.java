package functions;

public class FunctionParameters {

	public static void main(String[] args)
	{
		
		sum(10, 20);
	//	sum(10, 20, 30);
		
	}


//access modifiers//type/nature//return type//name//Parameters
 public static void sum(int a, int b)
{
	System.out.println(a+b);
}
 
 public static void message (int a, int b, int c )
 {
	 System.out.println(a+b+c);
 }
 public static void sum(int a, String name)
 {
 //	System.out.println(a+b);
 }
  
}
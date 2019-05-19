package corejava.methods;

public class MethodTypes 
{
	
	public void method1()
	{
		
	}
	
	
	/*
	 * => Otherthan void for every methodtype we should write return keyword.
	 * => Return value should match with return type/
	 * => Finally it return value to methodname..
	 */
	
	
	public int method2()
	{
		return 100;
	}
	
	
	

	public static void main(String[] args) 
	{

		//Creating object to call instant methods
		MethodTypes obj=new MethodTypes();
		obj.method1();
		int x=obj.method2();
		System.out.println("interger value return => "+x);
		

	}

}

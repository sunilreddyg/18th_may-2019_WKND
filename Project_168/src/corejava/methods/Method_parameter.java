package corejava.methods;

public class Method_parameter 
{
	
	
	public void print_tool()
	{
		System.out.println("webdriver");
	}
	
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println(name);
	}
	

	public static void main(String[] args) 
	{
	
		//Create object for instant methods
		Method_parameter obj=new Method_parameter();
		//Calling method wihtout argument
		obj.print_tool();
		
		//calling method with single argument
		obj.print_tool("GRID");
		obj.print_tool("IDE");
		

	}

}

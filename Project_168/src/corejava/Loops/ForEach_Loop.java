package corejava.Loops;

public class ForEach_Loop 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Foreach:-->
		 * 			Foreach loop read array next values.
		 * 	Syntax:-->
		 * 				for(Variable :  Arrayname)
		 * 				{
		 * 
		 * 				}
		 */
		
		
		/*
		 * Example:--> Print array next value using index value
		 */
		String tools[]={"IDE","RC","WD","GRID"};
		
		//Iterate using foreach loop
		for (String Eachtool : tools)
		{
			System.out.println(Eachtool);
		}
		

	}

}

package corejava.instantmethods;

public class Run_Robot_Actions
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Create object for Instant methods to call from 
		 * public class
		 * 
		 * 			new classname().methodname();
		 */
		new RobotActions().run();
		new RobotActions().walk();
		
		
		//Object cration using referral variable..
		RobotActions obj=new RobotActions();
		obj.run();
		obj.walk();
		

	}

}

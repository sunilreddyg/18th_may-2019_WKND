package corejava.diff_package;

import corejava.instantmethods.RobotActions;
import corejava.staticmethods.NativeInputs;


public class Calling_Methods_From_Diff_package 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> Inorder to call other package methods and variable in current
		 * 			class, we need to  import package referrals to current class.
		 * 
		 * 			import packagename.classname;
		 */
		 RobotActions obj=new RobotActions();
		 obj.run();
		 obj.walk();
		 
		 
		 
		 //Static Method call from different package
		 NativeInputs.Keyboard();
		 NativeInputs.Mouse();
		 
		

	}

}

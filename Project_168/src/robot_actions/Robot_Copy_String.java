package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class Robot_Copy_String {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		//Launch notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		String text="Selenium automate web browser interfaces";
		
		//Select String
		StringSelection Stext=new StringSelection(text);
		//Enable System Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set Copied content to System clipbaord
		clipboard.setContents(Stext, Stext);
		
		
		//Paste Copied text into notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Save Notepad file using Ctrl+S
		robot.keyPress(KeyEvent.VK_S);
		
		//Release control key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		String path="C:\\Users\\SUNIL\\git\\18th_may-2019_WKND\\Project_168\\src\\robot_actions\\OP.txt";
		//Select String
		StringSelection spath=new StringSelection(path);
		//Set content to clipboard
		clipboard.setContents(spath, spath);
		
		
		//Pefrom ctrl+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Keyup control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);

	}

}

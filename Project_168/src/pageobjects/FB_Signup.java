package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FB_Signup 
{
		
	
	@FindBy(how=How.ID,using="u_0_l") 
	public WebElement Firstname_EB;
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'lastname')]") 
	public WebElement Surname_EB;
	
	@FindBy(id="u_0_q")
	public WebElement Mobile_or_Email_EB;
	
	
	@FindBy(xpath = "//input[@id='u_0_t']")
	public WebElement Retype_email_EB;
	
	
	@FindBy(xpath = "//input[contains(@id,'u_0_x')]")
	public WebElement password_EB;
	
	@FindBy(xpath = "//select[@title='Day']")
	public WebElement Day_DD;
	
	@FindBy(xpath = "//select[@title='month']")
	public WebElement Month_DD;
	
	@FindBy(xpath = "//select[@title='year']")
	public WebElement Year_DD;
	
	@FindBy(how=How.TAG_NAME,using="a")
	public List<WebElement> All_links;
	
	@FindAll(@FindBy(xpath="//select"))
	public List<WebElement> All_Dropdowns;
	
	//InputData
	public String IP_Firstname="Arjun";
	public String IP_Secondname="Akash";
	public String IP_Mobile_or_Email="ArjunAkash@gmail.com";
	public String IP_Retype_Email="ArjunAkash@gmail.com";
	public String IP_password="hello123456";
	public String IP_day="22";
	
	
	
	/*
	 * Method for user registration
	 */
	public void User_Signup()
	{
		Firstname_EB.clear();
		Firstname_EB.sendKeys(IP_Firstname);
		
		Surname_EB.clear();
		Surname_EB.sendKeys(IP_Secondname);
		
		Mobile_or_Email_EB.clear();
		Mobile_or_Email_EB.sendKeys(IP_Mobile_or_Email);
	}

	
}

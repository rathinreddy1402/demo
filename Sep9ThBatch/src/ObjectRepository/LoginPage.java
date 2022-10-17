package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement UserTextField;
	
	@FindBy(name="pwd")
	private WebElement PasswordTextField;
	
	@FindBy(id="loginButton")
	private WebElement LoginButton;

	//getter methods
	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
    public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//Bussiness logics
	/**
	 * this method is used for login to Application
	 * @author Shobha
	 */
	public void loginToApp(String UN,String PW)
	{
		UserTextField.sendKeys(UN);
		PasswordTextField.sendKeys(PW);
		LoginButton.click();
	}
	
	
}

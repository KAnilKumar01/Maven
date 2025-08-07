package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
protected WebDriver driver;
	
	private By username=By.id("formEmail");
	private By password=By.xpath("//input[@id='formPassword']");
	private By eyemaskVisible=By.xpath("//img[@alt=' Password Visible']");
	private By eyemaskInvisible=By.xpath("//img[@alt='Password Not Visible']");
	private By loginButton=By.xpath("//button[text()='Log In']");
	private By errorMsg=By.className("invalid-credential-div");

	public LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	public void testLoginButtonDisabledWhenFieldAreEmpty() {
		driver.findElement(loginButton).click();
		System.out.println(driver.findElement(errorMsg).getText());
	}
	public void testPasswordMaskedbutton(String password1) {
		
		driver.findElement(password).sendKeys(password1);
		driver.findElement(eyemaskInvisible).click();
		driver.findElement(eyemaskVisible).click();
		
	}
	public void testInvalidLoginShowErrorMsg(String user,String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
		System.out.println(driver.findElement(errorMsg).getText());
		
		
	}
}

package SpiceJet;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	public WebDriver driver;
	

	public login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Login']")
	WebElement clicklogin;
	@FindBy(xpath = "//input[@data-testid='user-mobileno-input-box']")
	WebElement loginmobilnumber;	
	@FindBy(xpath = "//input[@data-testid='password-input-box-cta']")
	WebElement loginpsswd;
	@FindBy(xpath = "//div[@data-testid='login-cta']")
	WebElement clklogin;
	
	public void parrentwindow() {
		// TODO Auto-generated method stub
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.close();
	    driver.switchTo().window(tabs.get(0));
	}
	
	public void loginbtn() {
		// TODO Auto-generated method stub
		
		clicklogin.click();
		System.out.println("validating the login page");
		
	}
public void username(CharSequence gg) {
	// TODO Auto-generated method stub
	loginmobilnumber.sendKeys(gg);
}
public void password(CharSequence pwd) {
	// TODO Auto-generated method stub
	loginpsswd.sendKeys(pwd);
}
public void clklogin() {
	// TODO Auto-generated method stub
	clklogin.click();
	System.out.println("login menu verified sucessfully");
	driver.navigate().refresh();
}
	public void radiobuttons() {
		// TODO Auto-generated method stub
		try {
			WebElement radiobtn= driver.findElement(By.xpath("//div//div//div//div//div[3]//div[2]//div[2]//div//div//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']"));
			radiobtn.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//a[text()='Log In']")
	WebElement clickloin;

	public void clicklogin() {
		// TODO Auto-generated method stub
		WebElement findElement = driver.findElement(By.xpath("//div[text()='Passwords do not match']"));
		String expected = findElement.getText();
		String actual = "Passwords do not match";

		if (actual.equals(expected)) {
			clickloin.click();
			System.out.println("Navigating to login page");
		} else {
			System.out.println("Signed up sucessfully");
		}

	}

}

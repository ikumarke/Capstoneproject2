package project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flightpayment {
	public WebDriver driver;

	public flightpayment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	WebElement selectflightclkcontinue;
	@FindBy(xpath = "//input[@data-testid='first-inputbox-contact-details']")
	WebElement firstname;
	@FindBy(xpath = "//input[@data-testid='last-inputbox-contact-details']")
	WebElement Lastname;
	@FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	WebElement contactnumber;
	@FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement Emailaddress;
	@FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
	WebElement selectcity;
	@FindBy(xpath = "//div//div[2]//div//div//div//div//div[@class='css-1dbjc4n r-zso239']")
	WebElement Primepassangercheckbox;
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	WebElement dateofbirth;
	@FindBy(xpath = "//div[text()='1957']")
	WebElement selectyear;
	@FindBy(xpath = "//div[text()='Dec']")
	WebElement selectmonth;
	@FindBy(xpath = "//div[text()='16']")
	WebElement selectdate;
	@FindBy(xpath = "//div[text()='Continue']")
	WebElement continueforpayment;
	@FindBy(xpath = "//button[text()='Book Now']")
	WebElement booknowbtn;
	@FindBy(xpath = "//div//div[4]//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-adyw6z r-1kfrs79']")
	WebElement clickcontpyment;
	
	
	public void selectflightclkcontinue() {
		// TODO Auto-generated method stub
		selectflightclkcontinue.click();
		System.out.println("click continue & Enter the passanger detail");
	}
	public void firstname(CharSequence name) {
		// TODO Auto-generated method stub
		firstname.sendKeys(name);
	}
	public void Lastname(CharSequence lastnam) {
		// TODO Auto-generated method stub
		Lastname.sendKeys(lastnam);
	}
	public void contactnumber(CharSequence number) {
		// TODO Auto-generated method stub
		contactnumber.sendKeys(number);
	}
	public void Emailaddress(CharSequence emai) {
		// TODO Auto-generated method stub
		Emailaddress.sendKeys(emai);
	}
	public void selectcity(CharSequence city) {
		// TODO Auto-generated method stub
		selectcity.sendKeys(city);
	}
	public void Primepassangercheckbox() {
		// TODO Auto-generated method stub
		Primepassangercheckbox.click();
	}
	public void dateofbirth() {
		// TODO Auto-generated method stub
		dateofbirth.click();
		selectyear.isDisplayed();
		selectyear.click();
		
	}
	public void selectmonth() {
		// TODO Auto-generated method stub
		selectmonth.isDisplayed();
		selectmonth.click();
	}
	public void selectdate() {
		// TODO Auto-generated method stub
		selectdate.isDisplayed();
		selectdate.click();
	}
	
	public void continueforpayment() {
		// TODO Auto-generated method stub
		continueforpayment.isDisplayed();
		continueforpayment.click();
System.out.println(" succesfull entered the details");
	}
	public void booknowbtn() {
		// TODO Auto-generated method stub
		booknowbtn.click();
	}
	public void clickcontpyment() {
		// TODO Auto-generated method stub
		clickcontpyment.click();
		System.out.println(" succesfull entered the details for dummy payment");
	}
}

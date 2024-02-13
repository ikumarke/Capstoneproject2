package SpiceJet;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement continueforpayment;
	@FindBy(xpath = "//div[@data-testid='add-ons-continue-footer-button'][3]")
	WebElement clickcontpyment;
	@FindBy(xpath = "//button[text()='Book Now']")
	WebElement booknowbtn;
	@FindBy(id = "selectfrompopup")
	WebElement clickselect;
	@FindBy(xpath = "//div[text()='SpiceMax']")
	WebElement scrollup;
	@FindBy(xpath = "//p//span[text()='Skip this to skip comfort.']")
	WebElement skip1;
	@FindBy(id = "skipfrompopup")
	WebElement skip2;
	@FindBy(xpath = "//div[text()='LKW6PHCQ']")
	WebElement ticketRefno;
	//div[text()='LKW6PHCQ']
	
	
	
	public void selectflightclkcontinue() {
		// TODO Auto-generated method stub
		selectflightclkcontinue.click();
		System.out.println("click continue & Enter the passanger detail");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(firstname));
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
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(continueforpayment));
	}
	
	public void continueforpayment() {
		// TODO Auto-generated method stub
		continueforpayment.click();
System.out.println(" succesfull entered the details");
WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(25));
w.until(ExpectedConditions.elementToBeClickable(clickcontpyment));
	}
	
	public void scrolldown() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", clickcontpyment);
		System.out.println("scroll into continuebtn");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(25));
		w.until(ExpectedConditions.elementToBeClickable(clickcontpyment));
	}
	public void clickcontpyment() {
		// TODO Auto-generated method stub
		clickcontpyment.click();
		System.out.println(" succesfull entered the details for dummy payment");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(25));
		w.until(ExpectedConditions.elementToBeClickable(skip1));
	}
	
	public void scrollupbtn() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", scrollup);
		
	}
	
	public void skip1() {
		// TODO Auto-generated method stub
		skip1.click();
		
	}
	public void skip2() {
		// TODO Auto-generated method stub
		skip2.click();
	}
	public void ticketRefno() {
		// TODO Auto-generated method stub
		String text = ticketRefno.getText();
		System.out.println("Ticket bookiung referance no"+text);
	}
}

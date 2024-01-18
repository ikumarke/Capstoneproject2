package project2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sign_up {
	public WebDriver driver;

	public Sign_up(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void title() {
		// TODO Auto-generated method stub
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.manage().deleteAllCookies();
	}

	@FindBy(xpath = "//div[text()='Signup']")
	WebElement Signupbtn;
	@FindBy(linkText = "BOOK NOW")
	WebElement signupwindow;
	@FindBy(xpath = "//select[@class='form-control form-select ']")
	WebElement dropdown;
	@FindBy(id = "first_name")
	WebElement firstname;
	@FindBy(id = "last_name")
	WebElement lasttname;
	@FindBy(xpath = "//select[@class='form-control form-select']")
	WebElement countrynameDD;
	@FindBy(xpath = "//img[@alt='date']")
	WebElement dateofbirth;
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement dateofbirthyear;
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement dateofbirthmonth;
	@FindBy(xpath = "//div[@aria-label='Choose Tuesday, December 16th, 1997']")
	WebElement dateofbirthweek;
	@FindBy(xpath = "//input[@placeholder='+91 01234 56789']")
	WebElement mobilenumber;
	@FindBy(xpath = "//input[@id='email_id']")
	WebElement emailid;
	@FindBy(id = "new-password")
	WebElement newpassword;
	@FindBy(id = "c-password")
	WebElement confpassword;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement defaultCheck;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement signupsubmitbtn;
	@FindBy(xpath = "//div[5]//div[1]//div//div//a//img[@class='icon-default']")
	WebElement passwordeyeview;

	public void signuptab() {
		// TODO Auto-generated method stub
		try {
		Signupbtn.click();
		System.out.println("Page navigated to signup page");
	
			for (String windowhand : driver.getWindowHandles()) {
				driver.switchTo().window(windowhand);
			}
			String expectedresult = "BOOK NOW";
			String Actualresult = signupwindow.getText();
			assertEquals(Actualresult, expectedresult);
			System.out.println(Actualresult + " is displayed on signup page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dropdowntittle() {
		// TODO Auto-generated method stub
		Select s = new Select(dropdown);
		s.selectByValue("MR");
		System.out.println("Entering the signup Mandatory fields");
	}

	public void firstname(CharSequence fname) {
		// TODO Auto-generated method stub
		firstname.sendKeys(fname);
	}

	public void lasttname(CharSequence Lname) {
		// TODO Auto-generated method stub
		lasttname.sendKeys(Lname);
	}

	public void countrynameDD() {
		// TODO Auto-generated method stub
		Select s = new Select(countrynameDD);
		s.selectByValue("IN");

	}

	public void dateofbirth() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(6000);
		dateofbirth.click();
		Thread.sleep(3000);
		dateofbirth.isDisplayed();

		try {

			Select s = new Select(dateofbirthyear);
			s.selectByValue("1997");
			Thread.sleep(2000);
			Select s1 = new Select(dateofbirthmonth);
			s1.selectByValue("11");
			dateofbirthweek.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(defaultCheck));
	}

	public void mobilenumber(CharSequence mobilenu) {
		// TODO Auto-generated method stub
		mobilenumber.sendKeys(mobilenu);

	}

	public void passwordeyeview() {
		// TODO Auto-generated method stub
		passwordeyeview.click();
	}

	public void emailsendkey(CharSequence email) throws InterruptedException {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(emailid);
			a.doubleClick(emailid);
			Thread.sleep(6000);
			emailid.sendKeys(email);
			System.out.println("emailid entered succesfully");
			WebElement findElement = driver.findElement(By.id("email_id"));
			System.out.println(findElement.getText());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void newpassword(CharSequence pwd) {
		// TODO Auto-generated method stub
		try {
			String text = newpassword.getText();
			System.out.println(text);
			if (text.isEmpty()) {
				newpassword.sendKeys(pwd);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void confpassword(CharSequence C_pwd) {
		// TODO Auto-generated method stub
		try {
			confpassword.sendKeys(C_pwd);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", countrynameDD);
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
			w.until(ExpectedConditions.elementToBeClickable(dateofbirth));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void defaultCheck1() {
		try {
			defaultCheck.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void signupsubmitbtn() {
		// TODO Auto-generated method stub
		signupsubmitbtn.click();
System.out.println("signuppage verified sucessfully");
	}

	

}

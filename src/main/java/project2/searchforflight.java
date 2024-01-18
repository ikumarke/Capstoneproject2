package project2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchforflight {
	public WebDriver driver;

	public searchforflight(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@data-testid='to-testID-destination']")
	WebElement destination;
	@FindBy(xpath = "//div[text()='DEL']")
	WebElement Todestination;
	@FindBy(xpath = "//div[@data-testid='departure-date-dropdown-label-test-id']")
	WebElement Depaturedatebtn;
	@FindBy(xpath = "//div[5]//div[3]//div[@data-testid='undefined-calendar-day-1']")
	WebElement Depaturedateselect;
	@FindBy(xpath = "//div[@data-testid='return-date-dropdown-label-test-id']")
	WebElement returndatebtn;
	@FindBy(xpath = "//div[6]//div[3]//div[@data-testid='undefined-calendar-day-30']")
	WebElement returndateselect;
	@FindBy(xpath = "//body//div//div//div//div[3]//div[2]//div[6]//div[1]//div//div//div[1]//div[2]//div[@style='cursor: pointer;']")
	WebElement seniorcitizen;
	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement Clksearchflightbtn;
	@FindBy(xpath = "//div[3]//div//div//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']")
	WebElement verifycheckbox;
	@FindBy(xpath = "//div[3]//div//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement clickcontinue;

	public void destination() {
		// TODO Auto-generated method stub
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(destination));
		destination.click();
	}

	public void Todestination() {
		// TODO Auto-generated method stub
		Todestination.click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(Depaturedatebtn));
	}

	public void Depaturedatebtn() {
		// TODO Auto-generated method stub
		Actions a = new Actions(driver);
		a.clickAndHold(Depaturedatebtn);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(Depaturedateselect));
	}

	public void Depaturedateselect() {
		// TODO Auto-generated method stub
		Depaturedateselect.click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(returndatebtn));
	}

	public void returndatebtn() {
		try {
			Actions a = new Actions(driver);
			a.clickAndHold(returndatebtn);
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
			w.until(ExpectedConditions.elementToBeClickable(returndateselect));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("date menu not getting displayed");
		}
	}

	public void returndate() {
		// TODO Auto-generated method stub
		returndateselect.click();
		System.out.println("Returndate selected sucessfully");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(seniorcitizen));
	}

	public void seniorcitizen() {
		// TODO Auto-generated method stub
		seniorcitizen.click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(Clksearchflightbtn));
		System.out.println("Round trip selected ");
	}

	public void Clksearchflightbtn() {
		// TODO Auto-generated method stub
		Clksearchflightbtn.click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(verifycheckbox));
	}

	public void verifycheckbox() throws InterruptedException {
		
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		verifycheckbox.click();
		Thread.sleep(5000);
		System.out.println("check box verified");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.elementToBeClickable(clickcontinue));
		String text = clickcontinue.getText();
		System.out.println(text);
	}

	public void clickcontinue() {
		clickcontinue.click();
		System.out.println("flight selected and page navigated to passengerinformation");
	}
}

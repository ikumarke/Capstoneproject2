package Project2.org;

import org.testng.annotations.Test;

import Baseclass.baseclasse;
import project2.Sign_up;
import project2.flightpayment;
import project2.login_page;
import project2.searchforflight;

public class Test1 extends baseclasse {

	@Test
	public void login() throws InterruptedException {
		// TODO Auto-generated method stub

		Sign_up s = new Sign_up(driver);
		s.signuptab();
		s.dropdowntittle();
		s.firstname(prop.getProperty("firstname"));
		s.lasttname(prop.getProperty("lastname"));
		s.mobilenumber(prop.getProperty("mobileno"));
		Thread.sleep(6000);
		s.newpassword(prop.getProperty("enterpwd"));
		s.confpassword(prop.getProperty("enterpwd"));
		s.dateofbirth();
		Thread.sleep(3000);
		s.defaultCheck1();
		s.emailsendkey(prop.getProperty("enteremail"));
		s.signupsubmitbtn();
		login_page l = new login_page(driver);
		l.parrentwindow();
		l.loginbtn();
		l.username(prop.getProperty("mobileno"));
		l.password(prop.getProperty("enterpwd"));
		l.clklogin();
		l.radiobuttons();
		searchforflight f = new searchforflight(driver);
		f.destination();
		Thread.sleep(4000);
		f.Todestination();
		f.Depaturedatebtn();
		f.Depaturedateselect();
		Thread.sleep(5000);
		f.returndatebtn();
		Thread.sleep(5000);
		f.returndate();
		f.seniorcitizen();
		f.Clksearchflightbtn();
		f.verifycheckbox();
		f.clickcontinue();
		flightpayment p = new flightpayment(driver);
		p.selectflightclkcontinue();
		p.firstname(prop.getProperty("firstname"));
		p.Lastname(prop.getProperty("lastname"));
		p.contactnumber(prop.getProperty("mobileno"));
		p.Emailaddress(prop.getProperty("enteremail"));
		p.selectcity(prop.getProperty("city"));
		p.Primepassangercheckbox();
		p.dateofbirth();
		p.selectmonth();
		p.selectdate();
		p.continueforpayment();

	}

}

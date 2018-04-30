package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
		
	/*	WebDriver driver;
		
		
		@Given("^Open the browser$")
		public void open_the_browser() {
			System.setProperty("webdriver.chrome.driver", "E:\\CodeTester\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		@Given("^enter the URL$")
		public void enter_the_URL() {
			driver.manage().window().maximize();
			driver.navigate().to("https://www.freecrm.com/index.html");
		}
		
		@Then("^verify the page title$")
		public void verify_the_page_title() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		@When("^Enter the username And enter the password$")
		public void enter_the_username_And_enter_the_password(DataTable credentials){
			List<List<String>> data = credentials.raw();
			driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
			driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		}
		
		@Then("^click on login button$")
		public void click_on_login_button() {
		    driver.findElement(By.cssSelector(".btn-small")).click();
		    System.out.println(driver.getTitle());
		}
		
		
		@Then("^close the browser$")
		public void close_the_browser()  {
		    driver.quit();
		}
*/}

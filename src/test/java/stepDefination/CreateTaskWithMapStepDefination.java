package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreateTaskWithMapStepDefination {

	WebDriver driver;
	
	
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
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials){
		for(Map<String,String> data : credentials.asMaps(String.class, String.class)){
		
		driver.findElement(By.name("username")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	}
	
	@Then("^click on login button$")
	public void click_on_login_button() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-small"))).click();
	   // driver.findElement(By.cssSelector(".btn-small")).click();
	    System.out.println(driver.getTitle());
	}
	
	@Then("^user on home page$")
	public void user_on_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO", title);
	    
	}

	@Then("^user moves to deal page$")
	public void user_moves_to_deal_page()  {
	    driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
	    Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[6]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[6]/ul/li[1]/a")).click();
		
	}

	@Then("^user enter deals details$")
	public void user_enter_deals_details(DataTable dealDetails) {
	   for(Map<String, String> data : dealDetails.asMaps(String.class, String.class)){
		   
		   driver.findElement(By.xpath("//*[@id='title']")).sendKeys(data.get("Title"));
		   driver.findElement(By.xpath("//*[@id='completion']")).sendKeys(data.get("Completion"));
		   driver.findElement(By.xpath("//*[@id='description']")).sendKeys(data.get("Description"));
		   driver.findElement(By.xpath("//input[@value='Save' and @class='button']")).click();
		   Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[6]/a"))).build().perform();
			driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[6]/ul/li[1]/a")).click();
			
			
	   }
	}

	
	@Then("^close the browser$")
	public void close_the_browser()  {
	    driver.quit();
	}
}

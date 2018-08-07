package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.cg.test.SearchResult;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sd {

	ChromeOptions option=new ChromeOptions();


	public static WebDriver driver;

	@Before(order=1)
	public void setup_step_env() {
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\chromedriver.exe");
	}


	@Given("^user is on RedBus home page$")
	public void user_is_on_RedBus_home_page() throws Throwable {
		driver=new ChromeDriver(option);

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}



	@When("^user enters the source, destination,onward date and return date$")
	public void user_enters_the_source_destination_onward_date_and_return_date() throws Throwable {


		/* Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText()); 
			alert.dismiss();*/
		//<label for="onward_cal" class="db text-trans-uc move-up">Onward Date</label>
		//<label for="onward_cal" class="db text-trans-uc move-up">Onward Date</label>



		WebElement element=driver.findElement(By.id("src"));
		element.sendKeys("Pune");


		//driver.findElement(By.className("autocomplete-suggestion")).click();

		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click();

		WebElement element1 = driver.findElement(By.id("dest"));
		element1.sendKeys("Hyderabad");

		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();


		//driver.findElement(By.className("autocomplete-suggestion")).click();
		/*Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText()); 
		alert.dismiss();*///*[@id="search"]/div/div[2]/div/ul/li[1]
		//driver.findElement(By.id("txtOnwardCalendar")).sendKeys("06-Aug-2018");
		// driver.findElement(By.className("db text-trans-uc move-up"));


		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[3]")).click();


		//	driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[1]")).click();



		//	driver.findElement(By.id("search_btn")).click();


	}

	@When("^clicks on search Buses$")
	public void clicks_on_search_Buses() throws Throwable {
		driver.findElement(By.id("search_btn")).click();
	}

	@Then("^user is able to see all the available buses$")
	public void user_is_able_to_see_all_the_available_buses() throws Throwable {


	}

	@When("^user selects the \"([^\"]*)\" and checks for seat availability$")
	public void user_selects_the_and_checks_for_seat_availability(String arg1) throws Throwable {
		
	/*	WebElement element=driver.findElement(By.xpath("//*[@id=\"8826688\"]/div/div[1]/div[1]/div[1]/div[1]"));
		
		if(element.getText().compareTo("Jabbar Travels") == 0) {

			driver.findElement(By.xpath("//*[@id=\"8826688\"]/div/div[2]/div[1]")).click();

			Thread.sleep(3000);
			WebElement element1 = driver.findElement(By.xpath("//*[@id=\"rt_8826688\"]/div/div/div/div[2]/div[2]/div[2]/canvas")); 

			Actions builder = new Actions(driver);
			builder.moveToElement(element1,60,30).click().build().perform();

			element1.click();
		}*/
	}
	@Then("^user selects the seat and proceeds for payment$")
	public void user_selects_the_seat_and_proceeds_for_payment() throws Throwable {


WebElement element=driver.findElement(By.xpath("//*[@id=\"8826688\"]/div/div[1]/div[1]/div[1]/div[1]"));
		
		if(element.getText().compareTo("Jabbar Travels") == 0) {

			driver.findElement(By.xpath("//*[@id=\"8826688\"]/div/div[2]/div[1]")).click();

			Thread.sleep(3000);
			WebElement element1 = driver.findElement(By.xpath("//*[@id=\"rt_8826688\"]/div/div/div/div[2]/div[2]/div[2]/canvas")); 

			Actions builder = new Actions(driver);
			builder.moveToElement(element1,60,30).click().build().perform();
			
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

			
			driver.findElement(By.xpath("//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[1]/div[2]")).click();

			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[1]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[2]/span[2]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")).click();
			
		
		}

		
		
	}}


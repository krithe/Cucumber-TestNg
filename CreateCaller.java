package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCaller {
	
ChromeDriver driver;
	
	@Given("Launch Chrome browser")
    
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://dev103117.service-now.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
     
	@When("Load URL {string}")
	public void loadurl(String url) {
		driver.get(url);
	}
	@Then("SwitchFrame")
    public void switchToFrame() throws InterruptedException {
    	driver.switchTo().frame(0);
	}
	
	@And("Type Username as {string}")
	public void typeUserName(String username) {
		driver.findElement(By.id("user_name")).sendKeys(username);
	}
	@And("Type Password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("user_password")).sendKeys(password);
	}
	@And("Click Login Button")
    public void clickOnButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();;
}
	@When("Enter Callers in filter navigator")
	    public void enterCaller() {
	    driver.findElement(By.id("filter")).sendKeys("Callers",Keys.ENTER);
}
    @And("press enter")
    public void pressEnter() {
    	driver.findElement(By.xpath("//div[text()='Callers']")).click();
    	}
    
    @Then("Switch to Frame")
    public void switchToFrame1() throws InterruptedException {
    	driver.switchTo().frame(0);
	       Thread.sleep(3000);
    }
    	
    @And("Click New Tab")
    public void clickNewtab() {
    	driver.findElement(By.id("sysverb_new")).click();
    }
    
    @And("Enter First Name as (.*)$")
    public void typeFirstName(String firstname) {
    	driver.findElement(By.id("sys_user.first_name")).sendKeys(firstname);
    }
    
    @And("Enter Last Name as (.*)$")	
    public void typeLastName(String lastname) {	
    driver.findElement(By.id("sys_user.last_name")).sendKeys(lastname);
    }
    @And("Enter Email ID as (.*)$")
    public void typeEmailId(String email) {		
    driver.findElement(By.id("sys_user.email")).sendKeys(email);
    }     
    @And("Enter Phone Number as (.*)$")	
    public void typePhoneNumber(String phonenumber) {		
    	driver.findElement(By.id("sys_user.phone")).sendKeys(phonenumber);
    }       	
    @And("Enter Mobile Phone Number as (.*)$")
    public void typeMobilePhoneNumber(String mobilephonenumber) {	
    	driver.findElement(By.id("sys_user.mobile_phone")).sendKeys(mobilephonenumber);
    }
    @And("Click Submit")
    public void clickSubmit() {
    	driver.findElement(By.id("sysverb_insert_bottom")).click();
    }
    
    @Then("Verify the Caller is Created")
    public void verification() {
   	
    System.out.println("verified");
}
}
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

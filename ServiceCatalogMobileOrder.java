package servicecatalog.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceCatalogMobileOrder {

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
	@Then("Switch to Login Page Frame")
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
		driver.findElement(By.xpath("//button[@type='submit']")).click();

}
	
	@When("Enter Service Catalog in filter navigator")
	public void enterServiceCatalog() {
		driver.findElement(By.id("filter")).sendKeys("Service Catalog",Keys.ENTER);
	}
	@And("Click Service Catalog")
	public void clickServiceCatalog() {
		driver.findElement(By.xpath("//div[text()='Service Catalog']")).click();
	}
	
	@Then("Switch to Service Catalog Frame")
	public void switchToServiceCatalogFrame() {
		driver.switchTo().frame(0);
	}
	@Then("Click on Mobile")
	public void clickOnMobile() {
		driver.findElement(By.xpath("//span[text()[normalize-space()='Cell phones to meet your business needs.']]")).click();
	}
	
	@And("Click Apple Iphone 6S")
	public void clickAppleIphone6s() {
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 6s']")).click();
	}
	@And("Select Update Monthly allowances field as Unlimited")
	public void updateMonthlyAllowances() {
		WebElement iOebedaadeeda = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']")); 
		  new Select(iOebedaadeeda).selectByValue("unlimited");
	}
	@And("Select Color field as Rose Gold")
	public void selectColor() {
		WebElement iObedaadeeda = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]")); 
		  new Select(iObedaadeeda).selectByValue("rose"); 
	}
	@And("Select Storage Field as 128Gb")
	public void selectStorageField() {
		WebElement niVEdbbfedcfbc = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[3]")); 
		  new Select(niVEdbbfedcfbc).selectByValue("onetwentyeight");
	}
	@Then("Click Order Now Button")
	public void clickOrderButton() {
		driver.findElement(By.id("oi_order_now_button")).click();
	}
	@Then("Verify the Order is Placed")
	public void verifyOrderPlaced() {
		String requestNo = driver.findElement(By.xpath("//a[@id='requesturl']//b[1]")).getText();
		
		  if(!requestNo.isEmpty()) {
				System.out.println("Order is placed successfully and the requestNo# is:"+requestNo);
			
			}
			
	}
}
	
	
	
	
	
	
	
	

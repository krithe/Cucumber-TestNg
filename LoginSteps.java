package proposal.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends ProposalBaseSteps {
	
	
	
	@Given("Load URL {string}")
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
    public void clickOnSubmit() {
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

}
package proposal.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateProposal extends ProposalBaseSteps {

	
	
		@When("Enter Proposal in filter navigator")
		    public void enterCaller() {
			driver.findElement(By.id("filter")).sendKeys("Proposal",Keys.ENTER);

	}
        @And("Click My Proposals")
        public void clickMyProposal() {
        	driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
        }
        @Then("Switch Frame")
        public void switchFrame() {
        	driver.switchTo().frame(0);
        }
      @And("Click New to Create New Proposal")
      public void clickNew() {
    	  driver.findElement(By.id("sysverb_new")).click();
      }
       @Then("Open new Proposal")
       public void openNewProposal() {
    	   String proposalnumber = driver.findElement(By.id("std_change_proposal.number")).getAttribute("value");
	   	   System.out.println("Number: " + proposalnumber);
		   System.out.println(" ");      
       }
       @And("Enter the field Short Description as (.*)$")
       public void enterShortDescription(String shortdescription) {
    	   driver.findElement(By.id("std_change_proposal.short_description")).sendKeys(shortdescription);
       }
        @And("Click Change Request")
        public void clickChangeRequest() {
        	driver.findElement(By.xpath("//span[text()='Change Request values']")).click();
        }
       @Then("Clear the field")
       public void clearTheField() {
    	   driver.findElement(By.xpath("//input[@class='filerTableInput form-control']")).clear();  
       }
       @And("Enter Description as (.*)$")
       	public void enterDescription(String description) {
    	   driver.findElement(By.xpath("//input[@class='filerTableInput form-control']")).sendKeys(description);   
       }
        @And("Click SUbmit")
        public void clickSubmit() {
        	driver.findElement(By.id("sysverb_insert_bottom")).click();
        }
    
        }
        
        
        
        
        
        
        
        
        
        
        
        


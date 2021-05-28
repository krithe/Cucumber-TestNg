package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunCucumberTestCaller {

	@CucumberOptions(
			dryRun = false,
			features = {"src/test/java/features/CreateCaller.feature"},
			glue = {"steps"},
			monochrome = true
	)

	public class RunCucumberTests extends AbstractTestNGCucumberTests{

		
}
}
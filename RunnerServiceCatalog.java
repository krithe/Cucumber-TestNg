package runner.servicecatalog;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerServiceCatalog {
	@CucumberOptions(
			dryRun = false,
			features = {"src/test/java/features/ServiceCategory.feature"},
			glue = {"servicecatalog.steps"},
			monochrome = true
	)

	public class RunCucumberTests extends AbstractTestNGCucumberTests{

		
}
}



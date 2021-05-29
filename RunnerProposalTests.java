package runner.proposal;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerProposalTests {

	@CucumberOptions(
			dryRun = false,
			features = {"src/test/java/features/Proposal.feature"},
			glue = {"proposal.steps","hooks"},
			monochrome = true
	)

	public class RunCucumberTests extends AbstractTestNGCucumberTests{

		
}
}


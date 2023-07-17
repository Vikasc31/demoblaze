package demoblaze.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Selenium training\\demoblaze_project\\features\\home.feature",
		
		glue = "stepdef",
		
		dryRun = false
			
		)

public class TestRunner {

}

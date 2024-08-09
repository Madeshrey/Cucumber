package runnerFile;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	import org.junit.runner.RunWith;
	import io.cucumber.testng.AbstractTestNGCucumberTests;

	//@RunWith(value = "")
	@CucumberOptions(

	features = {"src/test/resources/Feature/newfeature.feature"},
	glue = {"com.StepFile"},
	dryRun=true,
	monochrome = true,

	plugin={"html:target/cucumber-reports/cucumberreport.html"}					
		)
	public class RunnerFile extends AbstractTestNGCucumberTests{

	}




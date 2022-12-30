package runner;

import org.testng.annotations.DataProvider;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/main/java/feature",
glue = {"pages"},
monochrome = true,
publish = true,
dryRun = false,
snippets=SnippetType.CAMELCASE)

public class RunnerNew extends BaseClass{

@DataProvider(parallel = true)
public Object[][] scenarios() {
return super.scenarios();
}
}


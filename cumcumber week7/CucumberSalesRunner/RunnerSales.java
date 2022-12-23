package CucumberSalesRunner;

import CucumberSalesSteps.SalesForceBaseClass;
import io.cucumber.plugin.event.SnippetsSuggestedEvent;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClassLeadForm;
@CucumberOptions(features="src/test/java/CucumberSalesFeature", glue="CucumberSalesSteps",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)



public class RunnerSales extends SalesForceBaseClass {

}

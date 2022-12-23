
package runner;
import io.cucumber.plugin.event.SnippetsSuggestedEvent;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClassLeadForm;
@CucumberOptions(features="src/test/java/feature", glue="steps",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)
public class Runner extends BaseClassLeadForm {
//public class runner extends {
}
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", 
monochrome = true, 
snippets = SnippetType.CAMELCASE, 
dryRun = true, 
strict = false)

public class Runner {

}
package RC;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
        "json:target/surefire-reports/cucumberOriginal.json"},
        features="src/test/resources/features/rc/demo/EndToEnd.feature")

public class EndToEndTestSuite {}

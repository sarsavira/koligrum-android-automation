import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"steps", "hooks"},
        plugin = {"pretty", "html:build/result.html"},
        //plugin pretty untuk log
        features = "src/test/resources/features",
        stepNotifications = true,
        tags = "@login and @positive",
        publish = true

)
//khusus cucumber 6 ada online reporting (publish)

public class CucumberRunner {

}

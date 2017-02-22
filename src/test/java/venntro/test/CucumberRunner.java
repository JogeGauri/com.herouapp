package venntro.test;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by Gauri on 22/02/2017.
 */
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.jason",
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        coverageReport = true,
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true)

@CucumberOptions(features = ".",
        tags = "@automated",
        dryRun = false,
        strict = true

)

public class CucumberRunner {
}

package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //configurações padrões
        //dryRun = false,
        //monochrome = false,
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {
                "pretty", // para colocar varios valores, deve incluir entre chaves.
                "html:target/relatorioSimples",
                "json:target/relatorioSimples.json",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/dashbgoard.html"
        }
)
public class Runner {

}
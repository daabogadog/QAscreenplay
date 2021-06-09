package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import java.beans.FeatureDescriptor;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/features/Ejemplo.feature",
        glue="stepdefinitions",
        tags="@EscenarioUno",
        snippets = SnippetType.CAMELCASE
)
public class EjemploRunner {
}

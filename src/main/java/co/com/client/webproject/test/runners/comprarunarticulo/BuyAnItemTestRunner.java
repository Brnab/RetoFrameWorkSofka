package co.com.client.webproject.test.runners.comprarunarticulo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/main/resources/features/buyanitem/comprarunitem.feature"},
        glue = {"co.com.client.webproject.test.stepdefinition.comprar"},
        tags = "",
        publish = true
)

public class BuyAnItemTestRunner {
}

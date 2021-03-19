package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base {
    private Base base;

    public Post(Base base) {
        this.base = base;
    }
 /*
    @Dado("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url); // Abre o navegador no site alvo (extendendo a base)
    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Ent�o("^exibe a express�o \"([^\"]*)\" no t�tulo da guia$")
    public void exibeAExpress�oNoT�tuloDaGuia(String produto) {
        // AssertTrue: ele v� se a frase cont�m o texto que ele deseja
        assertTrue(base.driver.getTitle().contains(produto));
    }
*/

    @Given("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url); // Abre o navegador no site alvo (extendendo a base)
    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Then("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto) {
        // AssertTrue: ele v� se a frase cont�m o texto que ele deseja
        assertTrue(base.driver.getTitle().contains(produto));
    }
}
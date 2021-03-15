package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base {
    private Base base;

    public Post(Base base) {
        this.base = base;
    }

    @Dado("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url); // Abre o navegador no site alvo (extendendo a base)
    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Então("^exibe a expressão \"([^\"]*)\" no título da guia$")
    public void exibeAExpressãoNoTítuloDaGuia(String produto) {
        // AssertTrue: ele vê se a frase contém o texto que ele deseja
        assertTrue(base.driver.getTitle().contains(produto));
    }
}
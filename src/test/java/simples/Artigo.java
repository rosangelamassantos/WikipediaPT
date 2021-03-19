package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Artigo {
    // Atributos
    String url;         // endere�o do site alvo
    WebDriver driver;   // Objeto do Selenium WebDriver


    // M�todos
    @Before    // Antes do Teste
    public void iniciar(){
        url = "https://pt.wikipedia.org/";
        // Onde est� o Chrome Driver
        System.setProperty("webdriver.chrome.driver","drivers/chrome/89/chromedriver.exe");
        driver = new ChromeDriver(); // instanciar o Selenium como Chrome Driver
        driver.manage().window().maximize(); // vai maximizar a janela do navegador
        // define uma espera implicita de 1 min, verificando o carregamento a cada milisegundo
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @Test   // Durante o Teste
    public void consultarArtigo(){
        // Abrir o site
        driver.get(url);

        // Pesquisar por "Ovo de P�scoa"
        driver.findElement(By.id("searchInput")).sendKeys("Ovo de P�scoa");
        //driver.findElement(By.id("searchButton")).click(); // Clica na lupa
        driver.findElement(By.cssSelector("button.wvui-button")).click();

        // Validar o titulo da p�gina de retorno
        // vai pegar o texto que esta na linha ativa
        assertEquals("Ovo de P�scoa � Wikip�dia, a enciclop�dia livre", driver.getTitle());
    }

    @After  // Depois do teste
    public void finalizar(){
        driver.quit();  // matou o Selenium
    }
}
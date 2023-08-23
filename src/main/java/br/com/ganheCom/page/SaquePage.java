package br.com.ganheCom.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;


public class SaquePage {

    private WebDriver driver;


    @FindBy(css = ".btn-block:nth-child(1)")
    private WebElement btnSacarTop;

    @FindBy(xpath = "//input[@id='valor']")
    private WebElement txtValor;

    @FindBy(xpath = "//select[@name='tipo']")
    private WebElement dropTipoDeChave;

    @FindBy(xpath = "//input[@name='chave']")
    private WebElement txtChave;

    @FindBy(css = ".btn:nth-child(4)")
    private WebElement btnSacarCarteira;


    public SaquePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selecionarDropDown(String botao, String testeSeleciona) {
        WebElement dropTipoDeChave = driver.findElement(By.xpath(botao));
        Select combo = new Select(dropTipoDeChave);
        combo.selectByVisibleText(testeSeleciona);
    }

    public void clicarBtnSaquedoTopo() {
        esperaCarregar();
        btnSacarTop.click();
    }

    public void digitaValorTxtValor(String valor) {
        txtValor.sendKeys(valor);
    }

    public void digitaChavePix(String chavePix) {
        txtChave.sendKeys(chavePix);
    }

    public void clicarBtnSaqueCarteira() {
        btnSacarCarteira.click();
    }

    public void esperaCarregar() {
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-block:nth-child(1)")));
    }
}

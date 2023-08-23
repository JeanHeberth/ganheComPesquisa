package br.com.ganheCom.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;

public class LoginPage {

    private WebDriver driver;


    @FindBy(xpath = "//a[contains(@href,'login.php')]")
    private WebElement btnFazerLogin;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement txtEmail;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement txtSenha;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogar;

    @FindBy(id = "button_like")
    private WebElement btnSimGostei;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void realizarLogin(String usuario, String senha) {
        btnFazerLogin.click();
        txtEmail.sendKeys(usuario);
        txtSenha.sendKeys(senha);
        btnLogar.click();
    }

    public void clicaSimGostei() {
        for (int i = 0; i < 50; i++) {
            btnSimGostei.click();
        }
    }

    public void esperaCarregar() {
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button_like")));
    }
}

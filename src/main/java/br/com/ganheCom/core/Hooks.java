package br.com.ganheCom.core;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import br.com.ganheCom.utils.CaptarConfig;
import br.com.ganheCom.utils.Screenshot;
import br.com.ganheCom.utils.CaptarConfig;
import br.com.ganheCom.utils.Screenshot;
import java.util.Properties;


import org.openqa.selenium.WebDriver;

public class Hooks {
    
    Properties properties;
    private WebDriver driver;
    private BaseTest baseTest;
    private CaptarConfig captaConfig;

    @BeforeEach()
    public void captarPropriedades() {
        captaConfig = new CaptarConfig();
        properties = captaConfig.iniciarPropriedades();
    }

    @BeforeEach()
    public void iniciarNavegador() {
        String navegador = properties.getProperty("browser");
        baseTest = new BaseTest();
        driver = baseTest.inicializacao(navegador);
    }

    @AfterEach()
    public void fecharNavegador() {
        driver.quit();
    }

    @AfterEach()
    public void screenShot(String scenario) {
        Screenshot.takeScreenShot(driver);
    }
}

package br.com.ganheCom.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class DriveFactory {

    @BeforeMethod
    public WebDriver setUp(){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headleass");
        WebDriver driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get("https://ganhecom.app/looks/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    @AfterMethod
    public void tearDown(WebDriver driver) {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}

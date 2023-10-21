package br.com.ganheCom.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.LoggerFactory;
import org.testng.log4testng.Logger;
import java.time.Duration;


public class BaseTest {
    
    WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public WebDriver initNavegation(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            tlDriver.set(new ChromeDriver());
        }else if(browser.equalsIgnoreCase("firefox")){
            tlDriver.set(new FirefoxDriver());
        }else{
            System.out.println("Informe o navegador que deseja utilizar");
        }
        driver.manage().window().maximize();
        driver.get("https://ganhecom.app/looks/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public static synchronized WebDriver getDriver(){
        return tlDriver.get();
    }
    protected final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

}

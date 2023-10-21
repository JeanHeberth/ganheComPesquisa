package br.com.ganheCom.utils;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless {
    
    public static ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        return chromeOptions;
    }
    public static FirefoxOptions getFirefoxOptions(){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--headless");
        return firefoxOptions;
    }
}


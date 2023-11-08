package br.com.ganheCom;

import br.com.ganheCom.core.DriveFactory;
import br.com.ganheCom.page.LoginPage;
import br.com.ganheCom.page.SaquePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AbrindoPaginaTest {

    private DriveFactory driveFactory = new DriveFactory();
    private WebDriver driver;

    private LoginPage loginPage;
    private SaquePage saquePage;

    @BeforeMethod
    void beforeMethod() {
        driver = driveFactory.setUp();
        loginPage = new LoginPage(driver);
        saquePage = new SaquePage(driver);
    }

    @AfterMethod
    void afterMethod() {
        driveFactory.tearDown(driver);
    }

//    @Test
//    void test_1_realizaLoginGmail() {
//        loginPage.realizarLogin("jeanheberth19@gmail.com", "Paoeovo12#$");
//        loginPage.clicaSimGostei();
//        saquePage.clicarBtnSaquedoTopo();
//        saquePage.digitaValorTxtValor("5000.00");
//        saquePage.digitaChavePix("jeanheberth19@gmail.com");
//        saquePage.clicarBtnSaqueCarteira();
//    }
//
//    @Test
//    void test_2_realizaLoginHotMail() {
//        loginPage.realizarLogin("jean-hv@hotmail.com", "Paoeovo12,#$");
//        loginPage.clicaSimGostei();
//        saquePage.clicarBtnSaquedoTopo();
//        saquePage.digitaValorTxtValor("5000.00");
//        saquePage.digitaChavePix("jeanheberth19@gmail.com");
//        saquePage.clicarBtnSaqueCarteira();
//    }

    @Test(invocationCount = 250)
    public void test_3_saqueGmail() {
        loginPage.realizarLogin("jeanheberth19@gmail.com", "Paoeovo12#$");
        saquePage.clicarBtnSaquedoTopo();
        saquePage.digitaValorTxtValor("5000.00");
        saquePage.digitaChavePix("jeanheberth19@gmail.com");
        saquePage.clicarBtnSaqueCarteira();

    }

    @Test(invocationCount = 250)
    public void test_4_saqueHotmail() {
        loginPage.realizarLogin("jean-hv@hotmail.com", "Paoeovo12,#$");
        saquePage.clicarBtnSaquedoTopo();
        saquePage.digitaValorTxtValor("5000.00");
        saquePage.digitaChavePix("jeanheberth19@gmail.com");
        saquePage.clicarBtnSaqueCarteira();

    }


}

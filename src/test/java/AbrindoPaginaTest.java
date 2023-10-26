import br.com.ganheCom.core.DriveFactory;
import br.com.ganheCom.page.LoginPage;
import br.com.ganheCom.page.SaquePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;


public class AbrindoPaginaTest {

    String email = System.getenv("EMAIL");
    String senha = System.getenv("PASSWORD");


    private DriveFactory driveFactory = new DriveFactory();
    private WebDriver driver;

    private LoginPage loginPage;
    private SaquePage saquePage;

    @BeforeEach
    void beforeMethod() {
        driver = driveFactory.setUp();
        loginPage = new LoginPage(driver);
        saquePage = new SaquePage(driver);
    }

    @AfterEach
    void afterMethod() {
       driveFactory.tearDown(driver);
    }

//    @RepeatedTest(1)
//    @Ignore
//    void test_1_realizaLoginGmail(){
//        loginPage.realizarLogin(email,senha);
//        loginPage.clicaSimGostei();
//        saquePage.clicarBtnSaquedoTopo();
//        saquePage.digitaValorTxtValor("5000.00");
//        saquePage.digitaChavePix("jeanheberth19@gmail.com");
//        saquePage.clicarBtnSaqueCarteira();
//    }

//    @RepeatedTest(1)
//    @Ignore
//    void test_2_realizaLoginHotMail() {
//        loginPage.realizarLogin(email,senha);
//        loginPage.clicaSimGostei();
//        saquePage.clicarBtnSaquedoTopo();
//        saquePage.digitaValorTxtValor("5000.00");
//        saquePage.digitaChavePix("jeanheberth19@gmail.com");
//        saquePage.clicarBtnSaqueCarteira();
//    }

    @RepeatedTest(1)
    public void test_3_saqueGmail() {
        loginPage.realizarLogin("jeanheberth19@gmail.com","Paoeovo12#");
        saquePage.clicarBtnSaquedoTopo();
        saquePage.digitaValorTxtValor("5000.00");
        saquePage.digitaChavePix("jeanheberth19@gmail.com");
        saquePage.clicarBtnSaqueCarteira();

    }

    @RepeatedTest(1)
    public void test_4_saqueHotmail() {
        loginPage.realizarLogin("jean-hv@hotmail.com","Paoeovo12,#$");
        saquePage.clicarBtnSaquedoTopo();
        saquePage.digitaValorTxtValor("5000.00");
        saquePage.digitaChavePix("jeanheberth19@gmail.com");
        saquePage.clicarBtnSaqueCarteira();

    }


}

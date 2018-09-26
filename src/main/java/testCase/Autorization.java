package testCase;

import org.openqa.selenium.WebDriver;
import pageObject.LoginPage;

import java.util.concurrent.TimeUnit;

public class Autorization {


    public void testLogin(WebDriver driver) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage.goToPage(driver);
        LoginPage.setLogin(driver);
        LoginPage.setPassword(driver);
        LoginPage.setChkBox(driver);
        LoginPage.setLoginBtn(driver);
        LoginPage.loginchk(driver);
    }


}

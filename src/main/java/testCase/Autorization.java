package testCase;

import org.openqa.selenium.WebDriver;
import pageObject.LoginPage;

import java.util.concurrent.TimeUnit;

public class Autorization {


    public void testLogin(WebDriver driver) {

        LoginPage.goToPage(driver);
        LoginPage.setLogin(driver);
        LoginPage.setPassword(driver);
        LoginPage.setChkBox(driver);
        LoginPage.setLoginBtn(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*        try {

            Thread.sleep(5000);

        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        LoginPage.returnToMain(driver);*/

    }


}

package moduleTest;

import java.util.concurrent.TimeUnit;

import interfaces.IBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.Dropdown;
import testCase.Autorization;


public class BaseTest implements IBase {
    private static WebDriver driver = null;

    @BeforeTest
    public void init() {

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void t1_auth() {

        auth.testLogin(driver);
    }

    @Test
    public void t2_dropdown() {

        ddown.checkingURL(driver);
    }

    @AfterTest
    public void exit() {

        driver.quit();
    }

}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    private static WebDriver driver = null;


    public static void goToPage(WebDriver driver) {

        driver.get("http://store.demoqa.com/products-page/your-account/");

    }
    public static void returnToMain(WebDriver driver) {

        driver.get("http://store.demoqa.com/");

    }
    public static void setLogin(WebDriver driver) {
        WebElement login = driver.findElement(By.id("log"));
        login.sendKeys("zonder");
    }

    public static void setPassword(WebDriver driver) {
        WebElement password = driver.findElement(By.id("pwd"));
        password.sendKeys("test");
    }

    public static void setLoginBtn(WebDriver driver) {
        WebElement loginBtn = driver.findElement(By.id("login"));
        loginBtn.click();
    }
    public static void setChkBox(WebDriver driver) {
        WebElement chkBox = driver.findElement(By.id("rememberme"));
        chkBox.click();
    }
   /* public static void loginchk (WebDriver driver) {
        WebElement name = driver.findElement(By.className("ab-item"));
        System.out.println(name.getAttribute("ab-item"));
    }*/
}
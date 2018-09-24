package pageObject;

import Utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {


    public static void goToPage(WebDriver driver) {

        driver.get("http://store.demoqa.com/products-page/your-account/");

    }
    public static void returnToMain(WebDriver driver) {

        driver.get("http://store.demoqa.com/");

    }
    public static void setLogin(WebDriver driver) {
        WebElement loginField = driver.findElement(By.id("log"));
        loginField.sendKeys(Constants.login);
    }

    public static void setPassword(WebDriver driver) {
        WebElement passwordField = driver.findElement(By.id("pwd"));
        passwordField.sendKeys(Constants.password);
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
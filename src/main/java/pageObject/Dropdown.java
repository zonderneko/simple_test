package pageObject;

import Utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


public class Dropdown {

    private WebDriver driver;

    public Dropdown(WebDriver driver) {

        this.driver = driver;
    }

    public static void mainPage(WebDriver driver) {

        driver.get(Constants.main);
    }

    public static void moveTo(WebDriver driver) {

        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(By.xpath("/html/body/div[2]/div/div/header/nav/ul/li[2]/a"));
        action.moveToElement(menu).build().perform();
    }

    @Nullable
    public WebElement getElementByLinkPart(@Nonnull String linkPart) {

        return driver.findElement(By.partialLinkText(linkPart));
    }
}

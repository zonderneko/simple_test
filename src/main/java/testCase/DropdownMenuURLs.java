package testCase;

import org.openqa.selenium.WebDriver;
import pageObject.Dropdown;

public class DropdownMenuURLs {

    public void checkingURL(WebDriver driver) {

        Dropdown.mainPage(driver);
        Dropdown dropdown = new Dropdown(driver);
        dropdown.assertChilds();
    }
}

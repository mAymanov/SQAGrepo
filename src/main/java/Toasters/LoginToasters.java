package Toasters;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginToasters {
    private static WebDriver driver = WebDriverFactory.getDriver();


    public static void invalidLoginToaster ()
    {
        driver.findElement(By.xpath(""));

    }
}

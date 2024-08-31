package AppAuth;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

    private static WebDriver driver = WebDriverFactory.getDriver();

    public static void logOut()
    {
        driver.findElement(By.className("bm-burger-button")).click();
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
    }

}

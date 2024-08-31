package AppAuth;


import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private static WebDriver driver = WebDriverFactory.getDriver();

    public static void loginSwag(String loginURL, String userName, String userPassword)
    {
        driver.manage().window().maximize();
        driver.get(loginURL);
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(userPassword);
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    }

}

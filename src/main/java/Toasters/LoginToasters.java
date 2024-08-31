package Toasters;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.*;

import java.time.Duration;

public class LoginToasters {
    private static final WebDriver driver = WebDriverFactory.getDriver();


    public String invalidLoginToaster() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //WebElement errorMsg = driver.findElement(By.cssSelector("h3[data-test=\"error]"));
       // WebElement invalidLoginToaster = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
        // Assert.assertTrue(errorMsg.isDisplayed());
        String invalidLogintoaster = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()")).getText();

        return invalidLogintoaster;
    }
}




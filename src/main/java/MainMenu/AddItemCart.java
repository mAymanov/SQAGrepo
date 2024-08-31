package MainMenu;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemCart {
    private static WebDriver driver = WebDriverFactory.getDriver();

    public static void AddToCart ()
    {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }

}

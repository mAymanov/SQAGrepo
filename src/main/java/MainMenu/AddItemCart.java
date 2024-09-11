package MainMenu;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemCart {
    private static WebDriver driver = WebDriverFactory.getDriver();

    public static void AddToCart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }

    public static String getCartNumber() {
        String ActualCartNumber = driver.findElement(By.className("shopping_cart_badge")).getText();

        return ActualCartNumber;
    }


    public static String GetPageTitle() {
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        return pageTitle;
    }

}

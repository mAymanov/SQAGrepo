package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    private static WebDriver cDriver;
    public static WebDriver getDriver() {
        if (cDriver == null) {

            // Initialize ChromeDriver
            cDriver = new ChromeDriver();
        }
        return cDriver;
    }


}



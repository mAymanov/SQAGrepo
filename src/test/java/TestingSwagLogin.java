import AppAuth.Login;
import AppAuth.Logout;
import MainMenu.AddItemCart;
import Toasters.LoginToasters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingSwagLogin {
/*
    @BeforeMethod
    public static void Login()
    {

    }
*/
    @Test (priority = 1)
    public static void TestCart ()
    {
        Login.loginSwag("https://www.saucedemo.com/","standard_user","secret_sauce");
        AddItemCart.AddToCart();
    }
/*
    @Test (priority = 2)
    public static void TestLocked ()
    {
        Login.loginSwag("https://www.saucedemo.com/","locked_out_user","secret_sauce");
    }

    */
/*
    @Test (priority = 3)
    public static void TestError ()
    {
        Login.loginSwag("https://www.saucedemo.com/","error_user","secret_sauce");
    }

    @Test (priority = 4)
    public static void TestProblem ()
    {
        Login.loginSwag("https://www.saucedemo.com/","problem_user","secret_sauce");
    }
    @Test (priority = 5)
    public static void TestPerformanceGlitch ()
    {
        Login.loginSwag("https://www.saucedemo.com/","performance_glitch_user","secret_sauce");
    }

    @Test (priority = 6)
    public static void TestVisualError ()
    {
        Login.loginSwag("https://www.saucedemo.com/","visual_user","secret_sauce");
    }
*/


    /*
    @AfterMethod
    public static void Logout()
    {
        Logout.logOut();
    }
*/
}

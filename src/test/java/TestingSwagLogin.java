import AppAuth.Login;
import MainMenu.AddItemCart;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingSwagLogin {

    @Test(priority = 1)
    public static void TestCart() {
        Login.loginSwag("https://www.saucedemo.com/", "standard_user", "secret_sauce");
        //  AddItemCart.AddToCart();
    }

    @Test(priority = 2)
    public static void TestAddToCart() {
        Login.loginSwag("https://www.saucedemo.com/", "standard_user", "secret_sauce");
        AddItemCart.AddToCart();
       String actNum = AddItemCart.getCartNumber();
        Assert.assertEquals(actNum,"1");
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

}
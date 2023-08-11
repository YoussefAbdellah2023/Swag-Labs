package StepDefinitions2;

import Pages.P01_Login2;
import Pages.P02_Cart2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import static StepDefinitions2.Hocks2.driver;

public class TC02_Cart2 {

    P02_Cart2 cart = new P02_Cart2();
    P01_Login2 login = new P01_Login2();




    @Then("user add product to cart")
    public void AddProduct(){
        cart.ImgProduct().click();
        cart.BtnAddToCart().click();
    }

    @Then("click on the cart see all the products")
    public void SeeProduct(){
        cart.BtnCart().click();
        Assert.assertTrue(cart.NumberAtCart().isDisplayed());

     //   Assert.assertEquals(cart.NumberAtCart(),"1");
      //  Assert.assertTrue(cart.NumberAtCart().isEnabled(),"1");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/cart.html");

        cart.RemoveProduct().click();
      //  cart.ContinueShopping().click();
       // Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
    }
}

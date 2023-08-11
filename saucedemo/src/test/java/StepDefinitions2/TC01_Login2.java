package StepDefinitions2;

import Pages.P01_Login2;
import Pages.P02_Cart2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static StepDefinitions2.Hocks2.driver;

public class TC01_Login2 {

    P01_Login2 login = new P01_Login2();
    P02_Cart2 cart = new P02_Cart2();



    @When("^user login with valid data \"([^\"]*)\" and \"([^\"]*)\"$")
    public void loginValid( String username, String password){
        login.Email().sendKeys(username);
        login.Password().sendKeys(password);
    }

    @And("user press on login button")
    public void btn_Login_Button(){
        login.Btn_Login().click();

    }

    @Then("user login successfully")
    public void user_login_success(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
    }


    @Given("user go to login page")
    public void user_login_page(){
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @When("^user login with invalid data \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_Invalid(String type, String username, String password){
        login.Email().sendKeys(username);
        login.Password().sendKeys(password);
    }

    @Then("user see the error message")
    public void ErrorMessage(){
       System.out.println(("The Error Message Is : ")+login.ErrorMessageTxt().getText());
     Assert.assertTrue(login.ErrorMessageTxt().getText().contains(" Username and password do not match any user in this service"));

        String rgb= driver.findElement(By.cssSelector("div[class=\"error-message-container error\"]")).getCssValue("background-color");
        System.out.println(rgb);
        Assert.assertEquals(rgb,"rgba(226, 35, 26, 1)");

    }



}

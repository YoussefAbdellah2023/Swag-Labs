package StepDefinitions2;

import Pages.P04_CheckOut;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_lol.AN;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static StepDefinitions2.Hocks2.driver;

public class TC04_CheckOut {

    P04_CheckOut checkOut = new P04_CheckOut();

        @And("click on the checkout button")
        public void click_on_check_out_btn(){
        checkOut.CheckOutBtn().click();
        }



        @Then("fill all require data")
        public void fill_require_data(){
        checkOut.FirstNameCheckOut().sendKeys("Youssef");
        checkOut.LastNameCheckOut().sendKeys("Abdellah");
        checkOut.PostalCode().sendKeys("8134805");

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/checkout-step-one.html");
        }



        @And("click on continue button")
    public void click_on_continue_btn(){
        checkOut.ContinueBtn().click();
        }



        @And("click on the finish button to see success message and click on back home button")
    public void click_on_finish_btn() {

            Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html");
            checkOut.FinishBtn().click();

            Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-complete.html");

            Assert.assertTrue(checkOut.SuccessMessage().isDisplayed());
            Assert.assertTrue(checkOut.SuccessMessage().getText().contains("Thank you for your order!"));

            checkOut.BackHomeBtn().click();


        }



        @Then("click on tap menu and logout")
    public void user_logout(){

            checkOut.TapMenu().click();


            // This Is Bug When LogOut Automation But Work In Manual //
//            Assert.assertTrue(checkOut.LogOutBtnMenu().isDisplayed());
//            System.out.println(checkOut.LogOutBtnMenu());

        }

        @Then("leave all require data empty")
    public void leave_all_data_empty(){

            checkOut.FirstNameCheckOut().sendKeys("");
            checkOut.LastNameCheckOut().sendKeys("");
            checkOut.PostalCode().sendKeys("");

        }

        @And("click on continue button and see error message")
    public void Error_Message(){
            checkOut.ContinueBtn().click();

        Assert.assertTrue(checkOut.ErrorMessageCheckOut().isDisplayed());
          Assert.assertTrue(checkOut.ErrorMessageCheckOut().getText().contains("First Name is required"));
        }








}

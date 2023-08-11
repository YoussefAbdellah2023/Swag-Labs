package Pages;

import StepDefinitions2.Hocks2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_CheckOut {


    public WebElement CheckOutBtn(){return Hocks2.driver.findElement(By.cssSelector("button[id=\"checkout\"]"));
    }
    public WebElement FirstNameCheckOut(){return Hocks2.driver.findElement(By.cssSelector("input[id=\"first-name\"]"));}
    public WebElement LastNameCheckOut(){return Hocks2.driver.findElement(By.cssSelector("input[id=\"last-name\"]"));}
    public WebElement PostalCode(){return Hocks2.driver.findElement(By.cssSelector("input[id=\"postal-code\"]"));}
    public WebElement ContinueBtn(){return Hocks2.driver.findElement(By.cssSelector("input[id=\"continue\"]"));}
    public WebElement FinishBtn(){return Hocks2.driver.findElement(By.cssSelector("button[id=\"finish\"]"));}
    public WebElement BackHomeBtn(){return Hocks2.driver.findElement(By.cssSelector("button[id=\"back-to-products\"]"));}
    public WebElement SuccessMessage(){return Hocks2.driver.findElement(By.cssSelector("h2[class=\"complete-header\"]"));}
    public WebElement TapMenu(){return Hocks2.driver.findElement(By.cssSelector("button[id=\"react-burger-menu-btn\"]"));}
    public WebElement LogOutBtnMenu(){return Hocks2.driver.findElement(By.cssSelector("a[id=\"about_sidebar_link\"]"));}
    public WebElement ErrorMessageCheckOut(){return Hocks2.driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));}





}

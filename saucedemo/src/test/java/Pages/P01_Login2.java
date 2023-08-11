package Pages;

import StepDefinitions2.Hocks2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Login2 {

    public WebElement Email(){return Hocks2.driver.findElement(By.id("user-name"));
    }
    public WebElement Password(){return Hocks2.driver.findElement(By.id("password"));}
    public WebElement Btn_Login(){return Hocks2.driver.findElement(By.cssSelector("input[id=\"login-button\"]"));}
    public WebElement ErrorMessageTxt(){return Hocks2.driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
    }



}



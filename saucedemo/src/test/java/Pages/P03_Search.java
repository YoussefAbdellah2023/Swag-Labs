package Pages;

import StepDefinitions2.Hocks2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_Search {

    public WebElement SearchDropDown(){return Hocks2.driver.findElement(By.cssSelector("select[data-test=\"product_sort_container\"]"));
    }

}

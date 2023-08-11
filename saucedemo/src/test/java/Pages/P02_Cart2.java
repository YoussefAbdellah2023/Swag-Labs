package Pages;

import StepDefinitions2.Hocks2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Cart2 {

//    public WebElement BtnAddProduct(){return Hocks2.driver.findElement(By.xpath("//button[@class=\"btn btn_primary btn_small btn_inventory\"][@data-test=\"add-to-cart-sauce-labs-backpack\"]"));
//    }

    public WebElement ImgProduct(){return Hocks2.driver.findElement(By.cssSelector("a[id=\"item_0_img_link\"]"));}
    public WebElement BtnAddToCart(){return Hocks2.driver.findElement(By.cssSelector("button[class=\"btn btn_primary btn_small btn_inventory\"]"));}
    public WebElement BtnCart(){return Hocks2.driver.findElement(By.className("shopping_cart_container"));}
    public WebElement NumberAtCart(){return Hocks2.driver.findElement(By.cssSelector("span[class=\"shopping_cart_badge\"]"));}
    public WebElement RemoveProduct(){return Hocks2.driver.findElement(By.cssSelector("button[class=\"btn btn_secondary btn_small cart_button\"]"));}
    public WebElement ContinueShopping(){return Hocks2.driver.findElement(By.cssSelector("button[class=\"btn btn_secondary back btn_medium\"]"));}



}



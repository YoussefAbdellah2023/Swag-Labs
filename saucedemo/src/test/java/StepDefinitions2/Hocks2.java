package StepDefinitions2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hocks2 {

    public static WebDriver driver;



    @Before
    public static void openBrowser(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }

    @After
    public static void quit() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();

    }
}

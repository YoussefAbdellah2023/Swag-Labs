package StepDefinitions2;

import Pages.P03_Search;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class TC03_Search {

    P03_Search search = new P03_Search();

    @Then("user search from dropdown list")
    public void Day_dropdown () throws InterruptedException {
        int min = 0;
        int max = 3;
        int random_int = (int)Math.floor(Math.random()*(max - min+1)+min);
        Select select = new Select(search.SearchDropDown());
        select.selectByIndex(random_int);
        Thread.sleep(1000);

    }
}

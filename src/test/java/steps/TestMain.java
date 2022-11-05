package steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.jojonomic.test.pages.Main;
import com.jojonomic.test.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMain {
	private static WebDriver driver;
	private Main main = new Main();

	
	public TestMain () {
		driver = Hook.driver;
	}


	@When("navigate to url")
	public void navigate () {
		driver.get(Constants.url);
	}
	
	@And("click search box")
	public void searchbox () {
		main.searchbox();
	}
	
	@And("click search icon")
	public void searchicon () {
		main.searchicon();
	}
	
	@Then("validate site")
	public void validate () {
		
	}
	
	@When("navigate to url 2")
	public void navigate2 () {
		driver.get(Constants.url);
	}
	
	@And("click search box 2")
	public void searchbox2 () {
		main.searchbox();
	}
	
	@And("click search icon 2")
	public void searchicon2 () {
		main.searchicon();
	}
	
	@And("click mcville 2")
	public void macville2 () {
		main.mcville();
	}	
	
	@Then("validate site 2")
	public void validate2 () {
		
	}
	
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
	
	
	
	
	
	
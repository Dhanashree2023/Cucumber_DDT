package StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Steps {
	WebDriver driver;
	@Given("User is on Home Login Page")
	public void user_is_on_home_login_page() {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://admin-demo.nopcommerce.com/login");   
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		WebElement user = driver.findElement(By.xpath("//input[@type = 'email']"));
		user.clear();
		user.sendKeys(username);  	
		WebElement pwd = driver.findElement(By.xpath("//input[@type = 'password']"));
		pwd.clear();
		pwd.sendKeys(password);       
	}

	@And("Click on Login")
	public void click_on_login() {
		WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
		login.click(); 
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
		String actualTitle = driver.getTitle();
		System.out.println("title is = "+actualTitle);
		if(actualTitle.equals(ExpectedTitle))
		{
			Assert.assertTrue(true); //pass
		}
		else
		{
			Assert.assertTrue(false); // Fail
		}
	}
}




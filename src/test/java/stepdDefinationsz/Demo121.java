

package stepdDefinationsz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo121{
	WebDriver driver;

	@Given("application is launched")
	public void application_is_launched() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver =  (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}


	@Given("demowebshop website is launched")
	public void demowebshop_website_is_launched() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();

	}

	@Given("user clicks on register btn")
	public void user_clicks_on_register_btn() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();

	}

	@When("user enter proper data")
	public void user_enter_proper_data() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Saavi");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Borkar");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("saavi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("saavi@123");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("saavi@123");
	}

	@Then("clicks on register btn")
	public void clicks_on_register_btn() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.close();
	}

	@Given("Registered user clicks on LogIn link")
	public void registered_user_clicks_on_LogIn_link() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}

	@Given("he provides valid  username{string}")
	public void he_provides_valid_username(String string1) {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(string1);
	}

	@Given("he provides valid password for login{string}")
	public void he_provides_valid_password_for_login(String string2) {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(string2);
	}

	//@Given("he provides valid data such as userId and password for login input feilds")
	//public void he_provides_valid_data_such_as_userId_and_password_for_login_input_feilds() {
	// Write code here that turns the phrase above into concrete actions
	//throw new cucumber.api.PendingException();
	//driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("saavi@gmail.com");
	//driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("saavi@123");
	//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	//}

	@When("clicks on login btn for the login validation")
	public void clicks_on_login_btn_for_the_login_validation() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.close();
	}

	@Given("user searches for item")
	public void user_searches_for_item() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).click();


	}

	@Given("types the item name on search tab")
	public void types_the_item_name_on_search_tab() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("jewelry");

	}

	@When("user clicks on search tab")
	public void user_clicks_on_search_tab() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("page with item information is displayed")
	public void page_with_item_information_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		String abc=driver.getTitle();
		//		Assert.assertEquals("Demo Web Shop. Search", abc);
	}

	@Given("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input")).click();
	}

	@Given("selects the required features and quantity for item")
	public void selects_the_required_features_and_quantity_for_item() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"product_attribute_71_10_16\"]")).sendKeys("15");
	}

	@When("user clicks on add to cart btn")
	public void user_clicks_on_add_to_cart_btn() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-71\"]")).click();
	}

	@Then("product is succesfully added")
	public void product_is_succesfully_added() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.partialLinkText("Shopping cart(2)"));
	}

}




package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefs extends POM {
	WebDriver driver;
	@Given("User logged in to Gmail")
	public void user_logged_in_to_gmail() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\COMPOSEAMAIL\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://mail.google.com");
        
        driver.findElement(By.id("identifierId")).sendKeys("GIVE ANY MAIL OF YOUR CHOICE");
        
        Thread.sleep(2500);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Enter your password']")).sendKeys("GIVE PASSWORD");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        
	}

	@When("User click on the compose button")
	public void user_click_on_the_compose_button() {
	  driver.findElement(compose);
	}

	@When("User enter recipient email address")
	public void user_enter_recipient_email_address() {
	   driver.findElement(Recipient).sendKeys("bugathapraveenkumar2006@gmail.com");
	}

	@When("User enter email subject")
	public void user_enter_email_subject() {
	   driver.findElement(Subject).sendKeys("Regarding an Assessment");
	}

	@When("User enter email message")
	public void user_enter_email_message() {
	 driver.findElement(message).sendKeys("Send the task through GIT-HUB and use BDD to do the Task");
	}

	@Then("User click on the send button")
	public void user_click_on_the_send_button() {
	   driver.findElement(sendbtn).click();
	}
}

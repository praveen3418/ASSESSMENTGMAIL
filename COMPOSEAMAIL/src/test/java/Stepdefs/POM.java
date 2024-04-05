package Stepdefs;

import org.openqa.selenium.*;

public class POM {
WebDriver driver;
    public By compose =By.xpath("//div[text()='Compose']");

    public By Recipient =By.name("//input[@id=':th']");

    public By Subject =By.name("subjectbox");

    public By message=By.xpath("//div[@aria-label='Message Body']");

    public By sendbtn=By.xpath("//div[contains(text(),'Send')");
 
    }

package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.LoginPageObjects;
import pageobjects.UpdatePageObjects;

public class UpdateProfile {
    @Test
    public void update() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.phptravels.net/login");
//        LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
//        LoginPageObjects.password(driver).sendKeys("demouser");
//        LoginPageObjects.button(driver).click();

        PageFactory.initElements(driver,LoginPageObjects.class);


        LoginPageObjects.username.sendKeys("user@phptravels.com");
        LoginPageObjects.password.sendKeys("demouser");
        LoginPageObjects.button.click();

        PageFactory.initElements(driver,UpdatePageObjects.class);

        UpdatePageObjects.myprofile.click();
        UpdatePageObjects.city.sendKeys("Nagercoil");
        UpdatePageObjects.phone.sendKeys("9876543218");
        UpdatePageObjects.submit.click();
//        UpdatePageObjects.myprofile(driver).click();
//        UpdatePageObjects.city(driver).sendKeys("Nagercoil");
//        UpdatePageObjects.phone(driver).sendKeys("9876543218");
//        UpdatePageObjects.submit(driver).click();
    }
}

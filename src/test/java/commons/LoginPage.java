package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.LoginPageObjects;

public class LoginPage {
    @Test
    public void loginpage(){
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.phptravels.net/login");
//        LoginPageObjects loginPageObjects=new LoginPageObjects();
//        LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
//        LoginPageObjects.password(driver).sendKeys("demouser");
//        LoginPageObjects.button(driver).click();

        PageFactory.initElements(driver,LoginPageObjects.class);


        LoginPageObjects.username.sendKeys("user@phptravels.com");
        LoginPageObjects.password.sendKeys("demouser");
        LoginPageObjects.button.click();
       // driver.quit();

    }
}

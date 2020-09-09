package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPage {
    @Test
    public void loginpage() throws IOException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.phptravels.net/login");
//        LoginPageObjects loginPageObjects=new LoginPageObjects();
//        LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
//        LoginPageObjects.password(driver).sendKeys("demouser");
//        LoginPageObjects.button(driver).click();

//        PageFactory.initElements(driver,LoginPageObjects.class);
//
//
//        LoginPageObjects.username.sendKeys("user@phptravels.com");
//        LoginPageObjects.password.sendKeys("demouser");
//        LoginPageObjects.button.click();
//        ExcelDP excelDP=new ExcelDP();
//        excelDP.readexel()
       // driver.quit();

    }
}

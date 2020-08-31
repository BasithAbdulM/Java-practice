package pagefactorywithoutannotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithOutFindBy {
    public static WebElement txtUsername;
    public static WebElement txtPassword;
    public static WebElement btnLogin;
    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
        PageFactory.initElements(driver,LoginWithOutFindBy.class);
        txtUsername.sendKeys("Admin");
        txtPassword.sendKeys("admin123");
        btnLogin.click();


    }
}

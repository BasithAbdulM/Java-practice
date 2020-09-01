package Ddlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUserName {
    @Test
    @Parameters({"username","password"})
    public void loginwithcorrectusername(String Un,String PWD){
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys(Un);
        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys(PWD);



//        WebElement username= driver.findElement(By.id("txtUsername"));
////        username.sendKeys("Admin");
////        WebElement password= driver.findElement(By.id("txtPassword"));
////        password.sendKeys("admin12");


    }
}

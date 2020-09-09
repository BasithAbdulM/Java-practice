package Ddlogintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class LoginDataProvider {


    String[][] data =null;


//            {
//            {"Admin", "admin12"},
//            {"Admin1", "admin123"},
//            {"Admin", "admin123"},
//            {"Admin1", "admin12"}
//
//
//    };


    @DataProvider(name = "logindata")
    public Object[][] logindp() {
        return data;

    }




        @Test(dataProvider ="logindata" )
//        @Parameters({"username","password"})
        public void loginsuccess(String Un, String PWD) {
            System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
            WebElement username= driver.findElement(By.id("txtUsername"));
            username.sendKeys(Un);
            WebElement password= driver.findElement(By.id("txtPassword"));
            password.sendKeys(PWD);
        }
    }


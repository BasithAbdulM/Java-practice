package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

    @FindBy(name ="username" )
    public static WebElement username;
    @FindBy(name ="password" )
    public static WebElement password;
    @FindBy(xpath ="//*[@id=\"loginfrm\"]/button" )
    public static WebElement button;
//    public static WebElement username(WebDriver driver){
//       return driver.findElement(By.name("username"));
//
//
//    }
//    public static WebElement password(WebDriver driver){
//        return driver.findElement(By.name("password"));
//    }
//    public static WebElement button(WebDriver driver){
//        return driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
//
//    }
}

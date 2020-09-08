package pagefactorywithoutannotation;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExtentReport {
    WebDriver driver;
   ExtentReports extentReport;
   ExtentSparkReporter extentSparkReporter;
   ExtentTest testCase;
   LoginWithOutFindBy loginWithOutFindBy=new LoginWithOutFindBy();

    @Test
    public void opengoogle() {
        testCase=extentReport.createTest("opengoogle");

        driver.get("http://www.google.com");
        testCase=extentReport.createTest("Verify Google title");
        String title=driver.getTitle();
        if(title.equals("Google")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
    @Test
    public void openbing() {

        driver.get("http://www.bing.com");
        testCase=extentReport.createTest("Verify Bing title");
        String title=driver.getTitle();
        if(title.equals("bing ")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
    @BeforeSuite
    public void lauchbrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\IdeaProjects\\TestNGTutor\\src\\driversss\\chromedriver.exe");
        extentReport=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter("src/test/Report");
        extentReport.attachReporter(extentSparkReporter);

        driver = new ChromeDriver();
    }
    @AfterSuite
    public void closebrowser() {

        driver.quit();
        extentReport.flush();
    }
}


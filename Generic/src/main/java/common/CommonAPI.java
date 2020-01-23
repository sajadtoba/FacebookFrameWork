package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver=null;


    @BeforeMethod
    public void setUp(){
        // Setting up the chrome browser
        System.setProperty("webdriver.chrome.driver",
                "/Users/sajadakbar/Documents/develop/SeleniumJuly2019/AutoFramWorkBank/Generic/src/main/java/driver/chromedriver");
        // Time to initialize the driver with the chrome driver
        driver = new ChromeDriver();
        // Now we can do other methods  etc
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();

    }
}

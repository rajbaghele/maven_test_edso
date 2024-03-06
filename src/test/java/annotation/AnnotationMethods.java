package annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationMethods {
    public WebDriver driver;

    @BeforeMethod
    public void beforeMethod1(){
        System.setProperty("Webdriver.crome.driver", "C:\\NEW CHROME DR\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        System.out.println("login appication ");
    }
    @Test
    public void tC01(){
        driver.get("https://www.canva.com/");
        System.out.println("tc01 ");
    }

    @Test
    public void tC02(){
        driver.get("https://www.saucedemo.com/v1/");
        System.out.println("tc02 ");
    }
    @AfterMethod
    public void close(){
        driver.close();
        System.out.println("Close Application");
    }

}

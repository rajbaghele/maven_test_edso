package annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgBasic {
    public WebDriver driver;

    @Test
    public void testCase1(){
        System.setProperty("Webdriver.crome.driver", "C:\\NEW CHROME DR\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.close();

    }
    @Test
    public void testCase2(){
        System.setProperty("Webdriver.crome.driver", "C:\\NEW CHROME DR\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.canva.com/");
        driver.close();
    }
}

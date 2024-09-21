package Tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    WebDriver driver;
    @BeforeClass
    public void Setup(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
    }

    @AfterClass
    public void Teardown(){
        driver.quit();
    }
}




package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class FirstItemPage {
    static WebDriver driver;
    public FirstItemPage(WebDriver driver){
        this.driver = driver;
    }

    WebElement AddItem = driver.findElement(By.id("add-to-cart-button"));
    public void ClickOnAddCartButton(){
        AddItem.click();
    }


}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArtsFirstItemPage extends BasePage{
    WebDriver driver;

    public ArtsFirstItemPage(WebDriver driver) {
    }

    public void ArtsFirstItemPage(WebDriver driver){
        this.driver = driver;
    }
    WebElement AddToCartButton = driver.findElement(By.id("add-to-cart-button"));
    public void ClickOnAddToCartButton(){
        AddToCartButton.click();
    }
}

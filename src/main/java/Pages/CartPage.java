package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    WebDriver driver ;
    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    WebElement ItemInCart = driver.findElement(By.xpath("//span[text()='2D Car Mat Set For VW PASSAT B6 Sedan / Variant SW - Black']"));
     public String getTestOfItem(){
        return ItemInCart.getText();
     }
}

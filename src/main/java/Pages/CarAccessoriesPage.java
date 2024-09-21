package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarAccessoriesPage extends BasePage {
    WebDriver driver;
    public CarAccessoriesPage(WebDriver driver){
        this.driver = driver;
    }
    WebElement FirstItem = driver.findElement(By.xpath("//span[text() = '2D Car Mat Set For VW PASSAT B6 Sedan / Variant SW - Black']"));
     public void SelectFirstItem(){
         waitForVisibility(FirstItem);
         FirstItem.click();
     }

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    WebElement SearchField = driver.findElement(By.id("twotabsearchtextbox"));
    WebElement Cart = driver.findElement(By.id("nav-cart-count"));
    WebElement TodayDealis = driver.findElement(By.linkText("Today's Deals"));
    public void SendDatainSearchField(String product){
        waitForVisibility(SearchField);
        SearchField.clear();
        SearchField.sendKeys(product);
        SearchField.sendKeys(Keys.ENTER);
    }
    public void ClickOnCart(){
        Cart.click();
    }
    public void ClickonTodayDeails(){
        TodayDealis.click();
    }
}

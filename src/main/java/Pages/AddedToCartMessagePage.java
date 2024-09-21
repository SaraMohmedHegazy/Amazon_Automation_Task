package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddedToCartMessagePage extends BasePage {
    WebDriver driver;
    public void AddedToCartMessagePage(WebDriver driver){
        this.driver = driver;
    }
    WebElement AddedMessage = driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1"));
    public void AppearanceOfAddedMessage(){
        waitForVisibility(AddedMessage);
        AddedMessage.getText();
    }
}

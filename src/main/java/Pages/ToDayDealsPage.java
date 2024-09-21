package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class ToDayDealsPage extends BasePage{
    WebDriver driver ;

    public ToDayDealsPage(WebDriver driver) {
    }

    public void ToDayDealsPage(WebDriver driver){
        this.driver = driver;

    }
    WebElement ArtsAndCraftsCheckBox = driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[2]/div/label/span/span"));
    WebElement discountCheckBox = driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[4]/div/span[2]/div/label/span/span"));
    WebElement FirstItem = driver.findElement(By.xpath("//span[text()='Water Rooting Hormone For Plants - To Activate Growt…']"));
    public void ClickOnArtsAndCraftsCheckBox(){
        ArtsAndCraftsCheckBox.click();
    }
    public void ClickOndiscountCheckBox(){
        discountCheckBox.click();
    }
    public void ClickOnFirstItem(){
        FirstItem.click();
    }
}

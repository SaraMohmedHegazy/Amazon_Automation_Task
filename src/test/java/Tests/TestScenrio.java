package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenrio extends TestBase{
    @Test
    public void Scenrio1(){
        HomePage home = new HomePage(driver);
        home.SendDatainSearchField("car accessories");
        String Actual_url = driver.getCurrentUrl();
        String Expected_Url ="https://www.amazon.eg/s?k=car+accessories&ref=nb_sb_noss";
        Assert.assertEquals(Actual_url,Expected_Url );

        CarAccessoriesPage car_acess = new CarAccessoriesPage(driver);
        car_acess.SelectFirstItem();
        String Actual_urlOfFirstItem = driver.getCurrentUrl();
        String Expected_urlOfFirstItem = "https://www.amazon.eg/Car-Mat-PASSAT-Sedan-Variant/dp/B096DFH4HN/ref=sr_1_1_sspa?dib=eyJ2IjoiMSJ9.V93WWJJecoBiu0m_8gLJxa_wmaZ-3Aob5OeNbG-pHg1SsClPF480bOSlWL_6IR-bPGqnUDAwZMDPKVJ-b94a3pzbXDulgTSB4-eLNSkvYCZ8cUKcFxeue-WRtNx4UTwCRB9kY968yElVqS23jzZOoo9B_T6BxdZ1XJjJLOPQPqc-YOw6ugz7CuHSW6MHGXa8f4iCxVO9da7H2LjIdo3kTrYHTUioYnmxTwoKFu0jMGBFCUT5wtj-ohT7HwbDa_1tHQvBTQiFJajkAFKLo2xl4qw0IYCG-OJSvyPaaWvciaM.1MlBYN8WXjIOADumV4qZP6KKK3BD4VRs2Yz4TlmKRdY&dib_tag=se&keywords=car+accessories&qid=1726931207&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1";
        Assert.assertEquals(Actual_urlOfFirstItem ,Expected_urlOfFirstItem);

        FirstItemPage Firstitem = new FirstItemPage(driver);
        Firstitem.ClickOnAddCartButton();

        CartPage cart = new CartPage(driver);
        String Actual_Text = cart.getTestOfItem();
        String Expected_Text = "2D Car Mat Set For VW PASSAT B6 Sedan / Variant SW - Black";
        Assert.assertEquals(Actual_Text ,Expected_Text );
    }
    @Test
    public void Scenrio2(){
        ToDayDealsPage DayDeal = new ToDayDealsPage(driver);
        DayDeal.ClickOnArtsAndCraftsCheckBox();
        String Actual_url = driver.getCurrentUrl();
        String Expected_url ="https://www.amazon.eg/-/en/deals?ref_=nav_cs_gb&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522";
       Assert.assertEquals(Actual_url ,Expected_url );
       DayDeal.ClickOndiscountCheckBox();
       DayDeal.ClickOnFirstItem();

       ArtsFirstItemPage item = new ArtsFirstItemPage(driver);
       item.ClickOnAddToCartButton();


    }
}

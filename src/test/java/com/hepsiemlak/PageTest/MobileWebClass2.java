package com.hepsiemlak.PageTest;

import com.hepsiemlak.Base.Base;
import com.hepsiemlak.PageModel.PageModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class MobileWebClass2 extends Base {

    PageModel pageModel = new PageModel(getWebDriver());

    @Step({"Cookie Kapatılır"})
    public void closeMobile2Cookie(){pageModel.closeCookieMobile2();}

    @Step({"Kiralık Butonuna Tıklanır"})
    public void clickButtonKiralik(){pageModel.clickKiralikButton();}

    @Step({"Filtrele Butonuna Tıklanır"})
    public void clickFiltreleButton(){pageModel.clickFiltreleMobile2();}

    @Step({"İl Seçiniz Kutusuna Tıklanır"})
    public void clickMobile2IlSeciniz(){pageModel.clickIlSecinizMobile2();}

    @Step({"İl Ankara Olarak Seçilir"})
    public void selectMobile2Ankara(){pageModel.selectAnkaraMobile2();}

    @Step({"İlçe Seçiniz Kutusuna Tıklanır"})
    public void clickMobile2IlceSeciniz(){pageModel.clickIlceSecinizMobile2();}

    @Step({"İlçe Seçinizden Çankaya Seçilir"})
    public void selectCankayaMobile2(){pageModel.selectCankaya();}

    @Step({"Uygula Butonuna Tıklanır"})
    public void clickMobile2UygulaButton(){pageModel.clickUygulaButtonMobile2();}

    @Step({"Oda Seçiniz Kutusuna Tıklanır"})
    public void clickMobile2OdaSeciniz(){pageModel.clickOdaSecinizMobile2();}

    @Step({"Oda Sayısı (2+1) Seçilir"})
    public void selectIkiArtiBirMobile2(){pageModel.selectIkiArtiBir();}

    @Step({"Uygula Butonuna Tekrar Tıklanır"})
    public void clickUygulaButton2Mobile2(){pageModel.clickUygulaButton2();}

    @Step({"Site İçinde Kutucuğu Evet Olucak Şekilde Seçilir"})
    public void clickSiteIcindeBoxMobile2(){pageModel.clickSiteIcindeBox();}

    @Step({"Sonuçları Göster Butonuna Tıklanır"})
    public void clickMobile2SonuclariGosterButton(){pageModel.clickSonuclariGosterButtonMobile2();}

    @Step({"2 Saniye Kadar Beklenir"})
    public void waitTwoSeconds() throws InterruptedException {pageModel.waitForTwoSeconds();}

    @Step({"Üçüncü İlana Tıklanır"})
    public void clickUcuncuIlanMobile2(){pageModel.clickUcuncuIlan();}


    @Step({"3 Saniye Kadar Beklenir"})
    public void waitThreeSeconds() throws InterruptedException {pageModel.waitForThreeSeconds();}

    @Step({"Telefonu Göster Butonuna Tıklanır"})
    public void clickMobile2TelefonuGoster(){pageModel.clickTelefonuGosterMobile2();}

    @Step({"Telefon Numarasının Gerçekliğini Sorgula"})
    public void assertCheckPhoneNumberIfReal() {
        String expectedTitle = driver.findElement(By.xpath("//div[@class='phone-number']/a[@href='tel:+905323638378']")).getText();
        String actualTitle = "0532 363 83 78";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}

package com.hepsiemlak.PageTest;

import com.hepsiemlak.Base.Base;
import com.hepsiemlak.PageModel.PageModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MobileWebCase1 extends Base {
    PageModel pageModel = new PageModel(getWebDriver());

    public MobileWebCase1(){

    }

    @Step({"Cookie Mobilde Kapatılır"})
    public void closeMobileCookie(){pageModel.closeCookieMobile();}

    @Step({"Mobilde Satılık Butonuna Tıklanır"})
    public void clickMobileSatilik(){pageModel.clickSatilikMobile();}

    @Step({"Mobilde Filtrele Butonuna Tıklanır"})
    public void clickFiltrele(){pageModel.clickFiltreleMobile();}

    @Step({"Mobilde İl Seçiniz Kutucuğuna Tıklanır"})
    public void clickMobileIlSeciniz(){pageModel.clickIlSecinizMobile();}

    @Step({"Mobilde İl İzmir Seçilir"})
    public void selectMobileIzmir(){pageModel.selectIzmirMobile();}

    @Step({"Mobilde İlçe Seçiniz Kutucuğuna Tıklanır"})
    public void clickMobileIlceSeciniz(){pageModel.clickIlceSecinizMobile();}

    @Step({"Mobilde İlçe Bornova Seçilir"})
    public void selectMobileBornova(){pageModel.selectBornovaMobile();}

    @Step({"Mobilde Uygula Butonuna Tıklanır"})
    public void clickButtonUygula(){pageModel.clickUygulaButton();}

    @Step({"Mobilde Kategori Olarak İşyeri Seçilir"})
    public void selectMobileIsYeri(){pageModel.selectIsYeriMobile();}

    @Step({"Mobilde Minimum Fiyat <cost> Olarak Girilir"})
    public void sendMobileMinValue(String cost){pageModel.sendMinValueMobile(cost);}

    @Step({"Mobilde 1 Saniye Kadar Beklenir"})
    public void waitASecond() throws InterruptedException {pageModel.waitForOneSecond();}

    @Step({"Mobilde Maksimum Fiyat <cost> Olarak Girilir"})
    public void sendMobileMaxValue(String cost){pageModel.sendMaxValueMobile(cost);}

    @Step({"Mobilde Bina Yaşı Kutucuğuna Tıklanır"})
    public void clickBinaYasiBoxMobile(){pageModel.clickBinaYasiBox();}

    @Step({"Mobilde Sıfır Bina Seçilir"})
    public void selectMobileSifirBina(){pageModel.selectSifirBinaMobile();}

    @Step({"Mobilde Bina Yaşı 1-5 Seçilir"})
    public void selectMobileBirBesBina(){pageModel.selectBirBesBinaMobile();}

    @Step({"Mobilde Bina Yaşı 6-10 Seçilir"})
    public void selectMobileAltiOn(){pageModel.selectAltiOnMobile();}

    @Step({"Mobilde Bina Yaşları Uygulanır"})
    public void clickBinaUygulaButton(){pageModel.clickUygulaButtonBina();}

    @Step({"Mobilde Sonuçları Göster Butonuna Tıklanır"})
    public void clickButtonSonuclariGoster(){pageModel.clickSonuclariGosterButton();}

    @Step({"Mobilde Filtrele Butonuna Tekrar Tıklanır"})
    public void clickAgainFiltreleButton(){pageModel.clickFiltreleButtonAgain();}

    @Step({"Bina Yaşının 6-10 Olduğu Kontrolü Yapılır"})
    public void tagYasAltiOnAssertion() {
        String ActualTitle = driver.findElement(By.xpath("//p[text()='6-10']")).getText();
        String ExpectedTitle = "6-10";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Bina Yaşının 1-5 Olduğu Kontrolü Yapılır"})
    public void tagYasBirBesAssertion() {
        String ActualTitle = driver.findElement(By.xpath("//p[text()='1-5']")).getText();
        String ExpectedTitle = "1-5";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Bina Yaşının Sıfır Bina Olduğu Kontrolü Yapılır"})
    public void tagYasSifirBinaAssertion() {
        String ActualTitle = driver.findElement(By.xpath("//div[@class='swiper-slide']//div[@class='val']//p[text()='Sıfır Bina']")).getText();
        String ExpectedTitle = "Sıfır Bina";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Bina Maximum Fiyat Bilgisi Kontrolü Yapılır"})
    public void tagMaxValAssertion() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement flag = driver.findElement(By.xpath("//p[text()='2.000.000 TL']"));
        js.executeScript("arguments[0].scrollIntoView();", new Object[]{flag});
        String expectedTitle = flag.getText();
        String actualTitle = "2.000.000 TL";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Step({"Bina Minimum Fiyat Bilgisi Kontrolü Yapılır"})
    public void tagMinValAssertion() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement flag = driver.findElement(By.xpath("//p[text()='100.000 TL']"));
        js.executeScript("arguments[0].scrollIntoView();", new Object[]{flag});
        String expectedTitle = flag.getText();
        String actualTitle = "100.000 TL";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Step({"Kategorinin İşyeri Olduğu Kontrol Edilir"})
    public void tagCategoryCheckAssertion() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement flag = driver.findElement(By.xpath("//p[text()='İşyeri']"));
        js.executeScript("arguments[0].scrollIntoView();", new Object[]{flag});
        String expectedTitle = flag.getText();
        String actualTitle = "İşyeri";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Step({"İşyeri Durumunun Satılık Olduğu Kontrol Edilir"})
    public void tagStatusCheckAssertion() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement flag = driver.findElement(By.xpath("//p[text()='Satılık']"));
        js.executeScript("arguments[0].scrollIntoView();", new Object[]{flag});
        String expectedTitle = flag.getText();
        String actualTitle = "Satılık";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}

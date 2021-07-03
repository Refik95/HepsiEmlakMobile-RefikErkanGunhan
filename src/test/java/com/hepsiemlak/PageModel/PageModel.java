package com.hepsiemlak.PageModel;

import com.hepsiemlak.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static com.hepsiemlak.PageModel.Constants.*;


public class PageModel extends BasePage {
    protected static WebDriver driver;

    public PageModel(WebDriver driver) {
        super(driver);
    }

    public PageModel() {
        super();
    }

    //Mobile Case 1
    public void closeCookieMobile(){click(MOBIL_CLOSE_COOKIE);}

    public void clickSatilikMobile(){click(MOBIL_CLICK_SATILIK);}

    public void clickFiltreleMobile(){click(MOBIL_CLICK_FILTRELE);}

    public void clickIlSecinizMobile(){click(MOBIL_CLICK_IL_SECINIZ);}

    public void selectIzmirMobile(){click(MOBIL_SELECT_IZMIR);}

    public void clickIlceSecinizMobile(){click(MOBIL_CLICK_ILCESECINIZ);}

    public void selectBornovaMobile(){click(MOBIL_SELECT_BORNOVA);}

    public void clickUygulaButton(){click(MOBIL_CLICK_UYGULA_BUTTON);}

    public void selectIsYeriMobile(){click(MOBIL_SELECT_ISYERI);}

    public void sendMinValueMobile(String cost){
        scrollDownToElement(MOBIL_MIN_FIYAT);
        sendKeys(MOBIL_MIN_FIYAT , cost);
    }

    public void sendMaxValueMobile(String cost){
        scrollDownToElement(MOBIL_MAX_FIYAT);
        sendKeys(MOBIL_MAX_FIYAT , cost);
    }

    public void clickBinaYasiBox(){click(MOBIL_CLICK_BINA_YASI_SECINIZ);}

    public void selectSifirBinaMobile(){click(MOBIL_SELECT_SIFIR_BINA);}

    public void selectBirBesBinaMobile(){click(MOBIL_SELECT_BIR_BES);}

    public void selectAltiOnMobile(){click(MOBIL_SELECT_ALTI_ON);}

    public void clickUygulaButtonBina(){click(MOBIL_CLICK_UYGULA_BUTTON_BINA);}

    public void clickSonuclariGosterButton(){click(MOBIL_CLICK_SONUCLARI_GOSTER);}

    public void clickFiltreleButtonAgain(){click(MOBIL_CLICK_FILTRELE_AGAIN);}

    //Mobile Case 2
    public void closeCookieMobile2(){click(MOBIL2_CLOSE_COOKIE);}

    public void clickKiralikButton(){click(MOBIL2_CLICK_KIRALIK);}

    public void clickFiltreleMobile2(){click(MOBIL2_CLICK_FILTRELE);}

    public void clickIlSecinizMobile2(){click(MOBIL2_CLICK_IL_SECINIZ);}

    public void selectAnkaraMobile2(){click(MOBIL2_SELECT_ANKARA);}

    public void clickIlceSecinizMobile2(){click(MOBIL2_CLICK_ILCESECINIZ);}

    public void selectCankaya(){click(MOBIL2_SELECT_CANKAYA);}

    public void clickUygulaButtonMobile2(){click(MOBIL2_CLICK_UYGULA_BUTTON);}

    public void clickOdaSecinizMobile2(){scrollDownToElementAndClick(MOBIL2_CLICK_ODA_SECINIZ_BOX);}

    public void selectIkiArtiBir(){click(MOBIL2_CLICK_IKI_BIR);}

    public void clickUygulaButton2(){click(MOBIL2_CLICK_UYGULA_BUTTON2);}

    public void clickSiteIcindeBox(){scrollDownToElementAndClick(MOBIL2_CLICK_SITE_ICINDE);}

    public void clickSonuclariGosterButtonMobile2(){click(MOBIL2_CLICK_SONUCLARI_GOSTER);}

    public void clickUcuncuIlan(){scrollDownToElementAndClick(MOBIL2_CLICK_UCUNCU_ILAN);}

    public void clickTelefonuGosterMobile2(){scrollDownToElementAndClick(MOBIL2_CLICK_TELEFONU_GOSTER);}

}

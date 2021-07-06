package com.hepsiemlak.PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Constants {

   //MobileCase1
   public static final By MOBIL_CLOSE_COOKIE = By.cssSelector("div[class='cookie-policy'] button");
   public static final By MOBIL_CLICK_SATILIK = By.xpath("//div[@class='link-sliding']/a[@href='/satilik']");
   public static final By MOBIL_CLICK_FILTRELE = By.xpath("//span[@class='val']");
   public static final By MOBIL_CLICK_IL_SECINIZ = By.xpath("//div[@class='city']");
   public static final By MOBIL_SELECT_IZMIR = By.xpath("//option[@value='izmir']");
   public static final By MOBIL_CLICK_ILCESECINIZ = By.xpath("//section[@class='location']/section[@class='select-content']");
   public static final By MOBIL_SELECT_BORNOVA = By.xpath("//span[text()='Bornova']");
   public static final By MOBIL_CLICK_UYGULA_BUTTON = By.xpath("//button[contains(text(),'Uygula')]");
   public static final By MOBIL_SELECT_ISYERI = By.xpath("//label[@for='category1']");
   public static final By MOBIL_MIN_FIYAT = By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/div[1]/section[2]/div/div[1]/input");
   public static final By MOBIL_MAX_FIYAT = By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/div[1]/section[2]/div/div[2]/input");
   public static final By MOBIL_CLICK_BINA_YASI_SECINIZ = By.xpath("//section[@class='building-age']");
   public static final By MOBIL_SELECT_SIFIR_BINA = By.xpath("//span[text()='Sıfır Bina']");
   public static final By MOBIL_SELECT_BIR_BES = By.xpath("//span[text()='1-5']");
   public static final By MOBIL_SELECT_ALTI_ON = By.xpath("//span[text()='6-10']");
   public static final By MOBIL_CLICK_UYGULA_BUTTON_BINA = By.xpath("//*[@id=\"dropdown-lightbox-filter\"]/button");
   public static final By MOBIL_CLICK_SONUCLARI_GOSTER = By.xpath("//button[@class='btn btn-red cardShadow3 get-result']");
   public static final By MOBIL_CLICK_FILTRELE_AGAIN = By.xpath("//span[@class='he-svg he-svg--funnel']");

   //MobileCase2
   public static final By MOBIL2_CLOSE_COOKIE = By.cssSelector("div[class='cookie-policy'] button");
   public static final By MOBIL2_CLICK_KIRALIK = By.xpath("//span[@class='he-svg left-icon he-svg--kiralik']");
   public static final By MOBIL2_CLICK_FILTRELE = By.xpath("//span[@class='val']");
   public static final By MOBIL2_CLICK_IL_SECINIZ = By.xpath("//div[@class='city']");
   public static final By MOBIL2_SELECT_ANKARA = By.xpath("//option[@value='ankara']");
   public static final By MOBIL2_CLICK_ILCESECINIZ = By.xpath("//section[@class='location']/section[@class='select-content']");
   public static final By MOBIL2_SELECT_CANKAYA = By.xpath("//span[text()='Çankaya']");
   public static final By MOBIL2_CLICK_UYGULA_BUTTON = By.xpath("//button[contains(text(),'Uygula')]");
   public static final By MOBIL2_CLICK_ODA_SECINIZ_BOX = By.xpath("//span[contains(text(),'Oda Seçiniz')]");
   public static final By MOBIL2_CLICK_IKI_BIR = By.xpath("//span[text()='2+1']");
   public static final By MOBIL2_CLICK_UYGULA_BUTTON2 = By.xpath("//*[@id=\"dropdown-lightbox-filter\"]/button");
   public static final By MOBIL2_CLICK_SITE_ICINDE = By.xpath("//span[contains(text(),'Site İçinde')]");
   public static final By MOBIL2_CLICK_SONUCLARI_GOSTER = By.xpath("//button[@class='btn btn-red cardShadow3 get-result']");
   public static final By MOBIL2_CLICK_UCUNCU_ILAN = By.xpath("//span[text()='İlan No: 3298-1930']");
   public static final By MOBIL2_CLICK_TELEFONU_GOSTER = By.xpath("//button/span[text()='Telefonu Göster']");


}

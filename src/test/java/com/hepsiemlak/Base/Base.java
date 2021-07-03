package com.hepsiemlak.Base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
        protected static WebDriver driver;

        public Base() {
        }

        @BeforeScenario
        public void setUp() {

                Map<String, String> mobileEmulation = new HashMap();
                mobileEmulation.put("deviceName", "iPhone 8");
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("mobileEmulation", mobileEmulation);
                options.addArguments(new String[]{"start-maximized"});
                options.addArguments(new String[]{"--disable-notifications"});
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver(options);
                driver.get("https://www.hepsiemlak.com/");
                driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);
            }

       @AfterScenario
        public void tearDown() {
        }

    public static WebDriver getWebDriver() {
        return driver;
    }


}

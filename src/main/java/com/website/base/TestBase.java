package com.website.base;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeClass;

public class TestBase {

    private static final String BASE_URL = "https://divan.tv/";
    private static final String BROWSER = "chrome";


    @BeforeClass
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = System.getProperty("browser", BROWSER);
        Configuration.baseUrl = System.getProperty("baseUrl", BASE_URL);
        Configuration.startMaximized = false;
        Configuration.browserSize = "1024x1000";
        Configuration.holdBrowserOpen = false; //true; //
    }
}

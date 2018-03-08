package com.zyt.test.baidu;

import com.zyt.pages.Index;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by zengyuetian
 */
public class TestSearch {

    WebDriver driver;
    Index index;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test()
    public void testSearch() {
        index = new Index(driver);
        index.search("ijumper");
    }
}

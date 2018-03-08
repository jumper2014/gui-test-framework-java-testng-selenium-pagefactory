package com.zyt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by zengyuetian
 */
public class Index {

    WebDriver driver;

    @FindBy(id="kw")
    WebElement wd;

    @FindBy(id="su")
    WebElement submit;

    public Index(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void setKeyword(String word) {
        wd.sendKeys(word);    }


    public void clickSubmit() {
        submit.click();

    }

    public void search(String word) {
        this.setKeyword(word);
        this.clickSubmit();
    }

}

package com.training.pages;

import com.training.browser.Driver;
import com.training.constants.Constants;
import com.training.reports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected BasePage() {
        PageFactory.initElements(Driver.driver,this);
    }

    /*
        Creating Constructor in Base Class -- Hence if sub class is extending a parent class then
        parent class constructor will also be called

        Protected Keyword  --> to allow access for child classes


     */


    public static void click(WebElement element, String name) {
        explicitlyWait(element);
        element.click();
        //LogStatus.pass(name + "is clicked successfully");
    }

    public static void explicitlyWait(WebElement element) {
        new WebDriverWait(Driver.driver, Constants.EXPLICITWAIT)
                .until(ExpectedConditions.visibilityOf(element));
    }
}

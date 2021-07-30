package com.selenium.pophandling.pages;

import com.selenium.pophandling.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {

    @FindBy(linkText = "Login")
    WebElement login_btn;

    @FindBy(xpath = "//input[@id='txt_uid']")
    WebElement input_id;

    @FindBy(xpath = "//input[@id='txt_pwd']")
    WebElement input_pwd;

    @FindBy(xpath = "//button[normalize-space()='SIGN IN']")
    WebElement login;

    public Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String login_to_application_for_pop() throws InterruptedException {
        login_btn.click();
        Thread.sleep(3000);
        input_id.sendKeys("diliprathod@gmail.com");
        Thread.sleep(1000);
        input_pwd.sendKeys("Login@123");
        Thread.sleep(2000);
        login.click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert(); // switch to alert
        alert.accept();
        Thread.sleep(4000);
        System.out.println("Get title:"+driver.getTitle());
        return driver.getTitle();
        
    }
}

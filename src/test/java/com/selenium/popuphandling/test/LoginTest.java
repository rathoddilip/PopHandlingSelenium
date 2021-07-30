package com.selenium.popuphandling.test;

import com.selenium.pophandling.base.BaseClass;
import com.selenium.pophandling.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void login_to_application() throws InterruptedException {
        Login login= new Login(driver);
        login.login_to_application_for_pop();

        String  expectedUrl="https://tpcindia.com/Admin/signin.aspx";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }
}

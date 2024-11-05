package com.tests.interfaces.elements;

import com.base.BaseTest;
import com.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

    private String email = "alden@example.com";
    private String age = "34";

    @Test
    public void testWebTable() {
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAgeField(age);
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);
        Assert.assertEquals(actualAge, age, "Actual and Expected Ages do not match.");

    }
}

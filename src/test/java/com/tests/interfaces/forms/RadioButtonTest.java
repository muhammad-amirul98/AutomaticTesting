package com.tests.interfaces.forms;

import com.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleRadioButtonSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected, "Female Radio Button not selected");
    }
}

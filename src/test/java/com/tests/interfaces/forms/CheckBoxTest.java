package com.tests.interfaces.forms;

import com.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckBox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportCheckBox();
        formsPage.clickReadingCheckBox();
        formsPage.clickMusicCheckBox();
        formsPage.unClickReadingCheckBox();

        Assert.assertFalse(formsPage.isReadingSelected(), "Reading Checkbox is selected");
    }
}

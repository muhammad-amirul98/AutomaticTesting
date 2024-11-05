package com.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsCheckBox = By.id("hobbies-checkbox-1");
    private By readingCheckBox = By.id("hobbies-checkbox-2");
    private By musicCheckBox = By.id("hobbies-checkbox-3");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportCheckBox() {
        if (!find(sportsCheckBox).isSelected()) {
            scrollToElementJS(sportsCheckBox);
            clickJS(sportsCheckBox);
        }
    }

    public void clickReadingCheckBox() {
        if (!find(readingCheckBox).isSelected()) {
            scrollToElementJS(readingCheckBox);
            clickJS(readingCheckBox);
        }
    }

    public void clickMusicCheckBox() {
        if (!find(musicCheckBox).isSelected()) {
            scrollToElementJS(musicCheckBox);
            clickJS(musicCheckBox);
        }
    }

    public void unClickSportCheckBox() {
        if (find(sportsCheckBox).isSelected()) {
            scrollToElementJS(sportsCheckBox);
            clickJS(sportsCheckBox);
        }
    }

    public void unClickReadingCheckBox() {
        if (find(readingCheckBox).isSelected()) {
            scrollToElementJS(readingCheckBox);
            clickJS(readingCheckBox);
        }
    }

    public void unClickMusicCheckBox() {
        if (find(musicCheckBox).isSelected()) {
            scrollToElementJS(musicCheckBox);
            clickJS(musicCheckBox);
        }
    }

    public boolean isSportSelected() {
        return find(sportsCheckBox).isSelected();
    }

    public boolean isReadingSelected() {
        return find(readingCheckBox).isSelected();
    }

    public boolean isMusicSelected() {
        return find(musicCheckBox).isSelected();
    }
}

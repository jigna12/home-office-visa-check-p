package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {

   /* 3.SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create
    methods 'void selectNationality(String nationality)'
    and 'void clickNextStepButton()'*/

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "response")
    WebElement selectCountry;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectcountry(String country) {
        Reporter.log("select country " + selectCountry.toString());
        selectByVisibleTextFromDropDown(selectCountry, country);
    }
    public void clickContinueButton() {
        clickOnElement(continueButton);
    }
}

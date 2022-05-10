package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility {

    /*6.FamilyImmigrationStatusPage - nextStepButton, yes, no locators and create methods 'void
    selectImmigrationStatus(String status)'
            (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'*/

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']//label")
    List<WebElement> visaType;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectImmigrationStatus(String status){
        Reporter.log("select immigartion status " + visaType.toString());

        switch (status){
            case "Yes":
                visaType.get(0).click();
                break;
            case "NO":
                visaType.get(1).click();
                break;
        }
    }
    public void clickContinueButton() {
        clickOnElement(continueButton);
    }
}




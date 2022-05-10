package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class WorkTypePage extends Utility {

    /* 2.WorkTypePage - nextStepButton, selectJobtypeList locators and create methods 'void
      selectJobType(String job)'
      and 'void clickNextStepButton()*/

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement> workTypeList;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;


    public void selectJobtypeList(String jobType) {
        Reporter.log("select job type list" + workTypeList.toString());
        for (WebElement jobList : workTypeList) {
            if (jobList.getText().contains(jobType))
                clickOnElement(jobList);
            break;
        }
    }
    public void clickContinueButton() {
        clickOnElement(continueButton);
    }
}





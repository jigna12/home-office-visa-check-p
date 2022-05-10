package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

   /* 7.DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators
    and create methods
'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select
    moreOrLess stay) and
'void clickNextStepButton()'*/

    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> stayTime;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectLengthOfStay(String moreOrLess){
        Reporter.log("Select the Stay time length " + stayTime.toString());
      switch(moreOrLess){
          case "6 months or less":
              stayTime.get(0).click();
              break;
          case "longer than 6 months":
              stayTime.get(1).click();
              break;
      }
    }
    public void clickNextStepButton(){
        clickOnElement(continueButton);
    }
}

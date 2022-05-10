package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {
//1.StartPage - startNowButton locatores and create method 'void clickStartNow()'
    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath =  "//a[normalize-space()='Start now']")
    WebElement startNowButton;


    public void clickStartNow(){
        Reporter.log("click On Start Button" + startNowButton.toString());
        clickOnElement(startNowButton);
    }
}

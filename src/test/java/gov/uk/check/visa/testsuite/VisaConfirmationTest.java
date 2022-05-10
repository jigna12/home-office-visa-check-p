package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
    StartPage startPage;
    WorkTypePage workTypePage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    DurationOfStayPage durationOfStayPage;


    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        durationOfStayPage = new DurationOfStayPage();
    }
/*1.VisaConfirmationTest
Inside VisaConfirmationTest class create following testmethods
1.anAustralianCominToUKForTourism().
Click on start button
Select a Nationality 'Australia'
Click on Continue button
Select reason 'Tourism'
Click on Continue button
verify result 'You will not need a visa to come to the UK*/
    @Test
    public void anAustralianCominToUKForTourism(){
         //Click on start button
        startPage.clickStartNow();
        //Select a Nationality 'Australia'
        selectNationalityPage.selectcountry("Australia");
        //Click on Continue button
        selectNationalityPage.clickContinueButton();
       //Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit("Tourism");
       //Click on Continue button
        reasonForTravelPage.clickContinueButton();
      //verify result 'You will not need a visa to come to the UK
        String expectedResult = "You will not need a visa to come to the UK";
        String actualResult = resultPage.getResultMessage();
        Assert.assertEquals(actualResult, expectedResult, "Result not found");
    }
/*2.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths().
Click on start button
Select a Nationality 'Chile'
Click on Continue button
Select reason 'Work, academic visit or business'
Click on Continue button
Select intendent to stay for 'longer than 6 months'
Click on Continue button
Select have planning to work for 'Health and care professional'
Click on Continue button
verify result 'You need a visa to work in health and care'*/
    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
       //Click on start button
        startPage.clickStartNow();
        //Select a Nationality 'Chile'
        selectNationalityPage.selectcountry("Chile");
        //Click on Continue button
        selectNationalityPage.clickContinueButton();
        //Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        //Click on Continue button
        reasonForTravelPage.clickContinueButton();
        //Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        //Click on Continue button
        durationOfStayPage.clickNextStepButton();
        //Select have planning to work for 'Health and care professional'
        workTypePage.selectJobtypeList("Health and care professional");
        //Click on Continue button
        workTypePage.clickContinueButton();
        //verify result 'You need a visa to work in health and care
        String expectedResult = "You need a visa to work in health and care";
        String actualResult = resultPage.getResultMessage();
        Assert.assertEquals(actualResult, expectedResult, "Result not found");
    }
/*3.aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArti
cle10Or20Card()
Click on start button
Select a Nationality 'Colombia'
Click on Continue button
Select reason 'Join partner or family for a long stay'
Click on Continue button
Select state My partner of family member have uk immigration status 'yes'
Click on Continue button
verify result 'You’ll need a visa to join your family or partner in the UK'*/
    @Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
       //Click on start button
        startPage.clickStartNow();
        //Select a Nationality 'Colombia'
        selectNationalityPage.selectcountry("Colombia");
        //Click on Continue button
        selectNationalityPage.clickContinueButton();
        //Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        //Click on Continue button
        reasonForTravelPage.clickContinueButton();
        //Select state My partner of family member have uk immigration status 'yes'
        familyImmigrationStatusPage.selectImmigrationStatus("Yes");
        //Click on Continue button
        durationOfStayPage.clickNextStepButton();
        //verify result 'You’ll need a visa to join your family or partner in the UK'
        String expectedResult = "You’ll need a visa to join your family or partner in the UK";
        String actualResult = resultPage.getResultMessage();
        Assert.assertEquals(actualResult, expectedResult, "Result not found");
    }
}

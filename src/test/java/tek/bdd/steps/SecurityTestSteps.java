package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.LoginPage;
import tek.bdd.utility.SeleniumUtilities;

public class SecurityTestSteps extends SeleniumUtilities {

    @Given("user click on sign in button")
    public void UserClickOnSignInButton() {
        clickElement(HomePage.Sign_In_Button);

    }
    @When("user enter {string} and {string} and  click on login")
    public void UserClickCredentialsandLogin(String username, String password) {

        SendTextToElement(LoginPage.EMAIL_INPUT,username);
        SendTextToElement(LoginPage.PASSWORD_INPUT,password);
        clickElement(LoginPage.LOGIN_BUTOON);
        //clickElement(HomePage.LoginButtonforclcik);

    }

    @Then("user will see account button on homepage")
    public void accountButtonWillDisplayOnHomePage() {
         boolean isdisplayed=IsElementDisplayed(HomePage.ACCOUNT_LINK);
         clickElement(LoginPage.ACOUNT_Link);
         clickElement(HomePage.ACCOUNT_LINK);
         Assert.assertTrue(isdisplayed);


    }
    @Then("Validdate error message {string}")
    public void validdateerrormessage(String ExpectedErrorMesage) {
       String actualmessage= getElementText(LoginPage.ERROR_MESSAGE);
        Assert.assertEquals(ExpectedErrorMesage,actualmessage);
        //System.out.println(message);


    }



}








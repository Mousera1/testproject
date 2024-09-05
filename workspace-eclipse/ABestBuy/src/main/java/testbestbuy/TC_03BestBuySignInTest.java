package testbestbuy;

import org.testng.Assert;
import org.testng.annotations.Test;
import ABestBuy.BaseTest;
import pages.SignInPage;

public class TC_03BestBuySignInTest extends BaseTest {

    @Test
    public void testSignIn() {
        SignInPage signInPage = new SignInPage(driver);
        
        signInPage.selectUnitedStates();
        signInPage.mouseOverAccount();
        signInPage.clickSignIn();

        // Get username and password from properties
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        signInPage.enterEmail(username);
        signInPage.enterPassword(password);	
        signInPage.clickSignInSubmit();
        signInPage.skipfornow();
        
        // Dismiss any alert asking to save the password
        signInPage.dismissSavePasswordAlert();
        
        String greetingText = signInPage.getGreetingMessage();
        System.out.println(greetingText);

        Assert.assertTrue(greetingText.contains("Hi, Mourice"), "Greeting message not found or incorrect");
    }
}


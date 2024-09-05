package testbestbuy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BottomLinksPages;
import pages.HomePage;
import pages.SignInPage;
import ABestBuy.BaseTest;

public class TC_04BottomLinkTest extends BaseTest {

    @Test(priority = 4)
    public void testBottomLinksPresence() {
        BottomLinksPages bottomLinksPage = new BottomLinksPages(driver);
        
        HomePage homePage = new HomePage(driver); 
        homePage.selectUnitedStates();
        homePage.mouseOverAccount();
        SignInPage signInPage = new SignInPage(driver); 
        signInPage.clickSignIn();
        signInPage.enterEmail("mouricesera1@gmail.com");
        signInPage.enterPassword("HANA2@legendlegend1");
        signInPage.clickSignInSubmit();
        signInPage.skipfornow();

        // Validate presence of bottom links
        System.out.println("Checking Accessibility link presence");
        Assert.assertTrue(bottomLinksPage.isAccessibilityLinkPresent(), "Accessibility link is not present.");

        System.out.println("Checking Terms and Conditions link presence");
        Assert.assertTrue(bottomLinksPage.isTermsConditionsLinkPresent(), "Terms and Conditions link is not present.");

        System.out.println("Checking Privacy link presence");
        Assert.assertTrue(bottomLinksPage.isPrivacyLinkPresent(), "Privacy link is not present.");

        System.out.println("Checking Interest-Based Ads link presence");
        Assert.assertTrue(bottomLinksPage.isInterestBasedAdsLinkPresent(), "Interest-Based Ads link is not present.");

        System.out.println("All required bottom links are found.");
    }
}

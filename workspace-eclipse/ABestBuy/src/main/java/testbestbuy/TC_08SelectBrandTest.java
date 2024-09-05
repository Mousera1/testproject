package testbestbuy;

import org.testng.Assert;
import org.testng.annotations.Test;

import ABestBuy.BaseTest;
import pages.HomePage;
import pages.SignInPage;

public class TC_08SelectBrandTest extends BaseTest {

    @Test(priority =3)
    public void testSelectAppleBrand() {
    	HomePage homePage = new HomePage(driver);

        
        homePage.selectUnitedStates();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.mouseOverAccount();
        signInPage.clickSignIn();
        signInPage.enterEmail("mouricesera1@gmail.com"); // Replace with actual email
        signInPage.enterPassword("HANA2@legendlegend1"); // Replace with actual password
        signInPage.clickSignInSubmit();
        signInPage.skipfornow();
        
        homePage.clickMenuButton();
        
        homePage.clickBrand();
        homePage.AppleBrand();
        homePage.AppleWatchMethod();
        homePage.GPSWatchMethod();
        homePage.CartWatchMethod();
        System.out.println("done");
        
        // Get the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Verify that the page title contains "Apple"
        Assert.assertTrue(pageTitle.contains("Apple"), "Not on the Apple brand page.");
    }
}

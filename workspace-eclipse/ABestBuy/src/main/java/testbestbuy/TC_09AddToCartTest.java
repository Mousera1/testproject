package testbestbuy;

import org.testng.Assert;
import org.testng.annotations.Test;

import ABestBuy.BaseTest;
import pages.HomePage;
import pages.ProductPage;
import pages.SignInPage;

public class TC_09AddToCartTest extends BaseTest {

    @Test(priority=4)
    public void testAddAppleWatchSeries9ToCart() {
    	HomePage homePage = new HomePage(driver);

        // Navigate to the United States site (if applicable)
        homePage.selectUnitedStates();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.mouseOverAccount();
        signInPage.clickSignIn();
        signInPage.enterEmail("mouricesera1@gmail.com"); 
        signInPage.enterPassword("HANA2@legendlegend1"); 
        signInPage.clickSignInSubmit();
        signInPage.skipfornow();
        
        homePage.CartPageMethod();
        System.out.println("Add to cart clicked");
        homePage.CheckoutPageMethod();

        System.out.println("checkout clicked");
    }
}
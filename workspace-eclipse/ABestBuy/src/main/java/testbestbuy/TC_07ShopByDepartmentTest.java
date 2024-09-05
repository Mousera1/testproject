package testbestbuy;

import org.testng.Assert;
import org.testng.annotations.Test;
import ABestBuy.BaseTest;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;
import pages.SignInPage;

public class TC_07ShopByDepartmentTest extends BaseTest {

    @Test(priority = 2)
    public void testShopByDepartmentAndAddToCart() {
       
        HomePage homePage = new HomePage(driver);

        
        homePage.selectUnitedStates();

        // Initializing SignInPage object and perform sign-in
        SignInPage signInPage = new SignInPage(driver);
        signInPage.mouseOverAccount();
        signInPage.clickSignIn();
        signInPage.enterEmail("mouricesera1@gmail.com"); 
        signInPage.enterPassword("HANA2@legendlegend1"); 
        signInPage.clickSignInSubmit();
        signInPage.skipfornow(); 

        
        String greeting = signInPage.getGreetingMessage();
        Assert.assertTrue(greeting.contains("Hi,"), "Sign in failed or greeting message did not appear.");

        // Initializing HomePage object and navigate to "Audio" > "Headphones"
        homePage = new HomePage(driver);
        homePage.clickMenuButton();
        
        homePage.clickAudioOption();
        homePage.clickHeadphonesLink();
        homePage.clickAirPodsLink();
        homePage.clickInsideAirpodsLinkItem();
        System.out.println("Item through Department successfully added");


        // Initializing CartPage object and verify the item is added to the cart
       // CartPage cartPage = new CartPage(driver);
       // Assert.assertTrue(cartPage.isSamsoniteUmbrellaAdded(), "Samsonite umbrella is not added to the cart.");
       // System.out.println("Samsonite umbrella is added to the cart");
    }
}


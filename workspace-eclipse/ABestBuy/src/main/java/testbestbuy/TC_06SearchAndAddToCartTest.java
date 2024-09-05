package testbestbuy;

import org.testng.Assert;
import org.testng.annotations.Test;

import ABestBuy.BaseTest;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;
import pages.SignInPage;

public class TC_06SearchAndAddToCartTest extends BaseTest {

    @Test(priority = 1)
    public void testSignInSearchAndAddToCart() {
        
        HomePage homePage = new HomePage(driver);

        
        homePage.selectUnitedStates();

       
        SignInPage signInPage = new SignInPage(driver);
        signInPage.mouseOverAccount();
        signInPage.clickSignIn();
        signInPage.enterEmail("mouricesera1@gmail.com"); 
        signInPage.enterPassword("HANA2@legendlegend1"); 
        signInPage.clickSignInSubmit();
        signInPage.skipfornow(); 

       
        String greeting = signInPage.getGreetingMessage();
        Assert.assertTrue(greeting.contains("Hi,"), "Sign in failed or greeting message did not appear.");

        // Searching for the specific item using HomePage search functionality
        homePage.searchForItem("Samsonite umbrella navy blue");

        
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.clickFirstResult();

        // Initializing ProductPage object and add the item to the cart
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        // Initializing CartPage object and verify the item is added to the cart
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isSamsoniteUmbrellaAdded(), "Samsonite umbrella is not added to the cart.");
        System.out.println("Samsonite umbrella is added to the cart");
    }
}

package testbestbuy;

import org.testng.annotations.Test;

import ABestBuy.BaseTest;
import pages.HomePage;
import pages.SignInPage;


public class TC_10CheckoutPlaceOrderTest extends BaseTest {

    @Test(priority=9)
    public void testCheckoutProcess() {
    	HomePage homePage = new HomePage(driver);

        
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
        homePage.ContinuePaymentMethod();
        
        String cardNumber = "1234 5678 9012 3456";
        String firstName = "Mourice";
        String lastName = "Seraphin";
        String address = "123 Lake Street";
        String city = "Cityname";
        String state = "AL";  
        String zipCode = "69000";
        
        homePage.cardnumber(cardNumber);
        
        homePage.firstnameMethod(firstName);
        
        homePage.lastnameMethod(lastName);
        
        homePage.addressMethod(address);
        
        homePage.cityMethod(city);
        
        homePage.stateMethod(state);
        
        homePage.PinMethod(zipCode);
        
        homePage.PlaceOrderMethod();
        
        System.out.println("Place Order Button Clicked");
    }
}

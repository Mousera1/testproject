package testbestbuy;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.CreateAccountPage;
import pages.HomePage;
import ABestBuy.BaseTest;

public class TC_05CreateAccountTest extends BaseTest {

    @Test(priority = 5)
    public void testCreateAccount() {
        
        HomePage homePage = new HomePage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        
        homePage.selectUnitedStates();
        homePage.mouseOverAccount();
        homePage.clickCreateAccountLink(); 
        
        
        createAccountPage.enterUserDetails("Alex", "A", "Alex@example.com", "Password123", "Password123", "1234567890");
        createAccountPage.checkRecoveryPhone();
        createAccountPage.clickCreateAnAccount();
        
        String successTitle = createAccountPage.getSuccessMessageTitle();
        Assert.assertEquals(successTitle, "Account created successfully", "Account creation failed or message not found.");
        

        
    }
}

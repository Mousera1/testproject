package testbestbuy;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TC_01BestBuyNavigationTest extends ABestBuy.BaseTest {

    @Test(priority =1)
    public void testNavigateToBestBuy() {
        // Verify the page title to ensure successful navigation
        String expectedTitle = "Best Buy International: Select your Country - Best Buy";
        String actualTitle = driver.getTitle();
        System.out.println("Navigated to Best Buy");
        Assert.assertEquals(actualTitle, expectedTitle, "The page title does not match.");
    }
}

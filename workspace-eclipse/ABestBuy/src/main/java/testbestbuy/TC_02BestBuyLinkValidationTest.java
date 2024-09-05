package testbestbuy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ABestBuy.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LinkValidator;

public class TC_02BestBuyLinkValidationTest extends BaseTest {
	

    

    @Test(priority =2)
    public void testValidLink() {
        String url = "https://www.bestbuy.com/";
        boolean isBroken = LinkValidator.isLinkBroken(url);

        
        if (isBroken) {
            System.out.println("The link is broken: " + url);
        } else {
            System.out.println("The link is valid: " + url);
        }

        
        Assert.assertFalse(isBroken, "The link should be valid: " + url);
    }

   
}
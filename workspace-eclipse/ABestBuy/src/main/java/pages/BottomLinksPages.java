package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BottomLinksPages {
    private WebDriver driver;

    // Locators for bottom links
    @FindBy(linkText = "Accessibility")
    private WebElement accessibilityLink;

    @FindBy(xpath = "//a[text()='Terms & Conditions']")
   private WebElement termsConditionsLink;

   @FindBy(linkText = "Privacy")
   private WebElement privacyLink;

   @FindBy(linkText = "Interest-Based Ads")
   private WebElement interestBasedAdsLink;

  @FindBy(linkText = "State Privacy Rights")
    private WebElement statePrivacyRightsLink;

   @FindBy(linkText = "Health Data Privacy")
    private WebElement healthDataPrivacyLink;

    

    // Constructor to initialize elements
    public BottomLinksPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to validate each link
    public boolean isAccessibilityLinkPresent() {
        return accessibilityLink.isDisplayed();
    }

   public boolean isTermsConditionsLinkPresent() {
     return termsConditionsLink.isDisplayed();
    }

   public boolean isPrivacyLinkPresent() {
    return privacyLink.isDisplayed();
    }

    public boolean isInterestBasedAdsLinkPresent() {
    return interestBasedAdsLink.isDisplayed();
    }

    
    
}
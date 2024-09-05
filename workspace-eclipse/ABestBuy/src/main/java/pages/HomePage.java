package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

   
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "United States")
    WebElement unitedStatesButton;

    @FindBy(xpath = "//span[text()='Account']")
    WebElement accountMenu;

    @FindBy(xpath = "//button[text()='Sign In']")
    WebElement signInButton;

    @FindBy(id = "fld-e")
    WebElement emailField;

    @FindBy(id = "fld-p1")
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit' and text()='Sign In']")
    WebElement signInSubmitButton;

    @FindBy(css = "button[aria-label='Menu']") 
    private WebElement menuButton;

    @FindBy(xpath = "//button[@data-id='node-531']") 
    private WebElement audioLink;

    @FindBy(xpath = "//button[@data-id='node-494']") 
    private WebElement headphonesLink;

    @FindBy(xpath = "//a[contains(@class, 'hamburger-menu-flyout-list-item') and @href='/site/airpods-earpods/airpods/pcmcat1575047837167.c?id=pcmcat1575047837167']") // Locator for "AirPods" under Headphones
    private WebElement airPodsLink;

    @FindBy(xpath = "//button[@data-sku-id='6447382']")
    private WebElement insideAirpodsLinkItemAddtoCart;

    @FindBy(xpath = "//button[contains(@class,'add-to-cart-button')]")
    private WebElement addToCartButton;
    
    @FindBy(xpath = "//button[@data-id='node-84']") 
    private WebElement BrandLink;

    @FindBy(linkText = "Create Account") 
    private WebElement createAccountLink;

    @FindBy(id = "gh-search-input") 
    private WebElement searchBox;

    @FindBy(xpath = "//button[@title='submit search']") 
    private WebElement searchButton;
    
    @FindBy(linkText="Apple") 
    private WebElement AppleButton;
    
    @FindBy(linkText="Apple Watch") 
    private WebElement AppleWatch;
    
    @FindBy(linkText = "Apple Watch SE GPS (2nd generation)")
    private WebElement GPSWatch;
    
    @FindBy(xpath = "//button[@data-sku-id='6340310']")
    private WebElement Addtocartwatch;
    
    @FindBy(xpath="//span[@class='cart-label']")
    private WebElement AddtoCartPage;
    
    @FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
    private WebElement CheckOutPage;
    
    @FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-secondary']")
    private WebElement ContinuePaymentPage;
    
    @FindBy(id = "number")
    private WebElement Cardnumber;
    
    @FindBy(id = "first-name")
    private WebElement firstnamecard;
    
    @FindBy(id = "last-name")
    private WebElement lastnamecard;
    
    @FindBy(id = "address-input")
    private WebElement addresscard;
    
    @FindBy(id = "city")
    private WebElement cityname;
    
    @FindBy(id = "state")
    private WebElement statename;// dropdown
    
    @FindBy(id = "postalCode")
    private WebElement poname;
    
    @FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
    private WebElement placeorder;

    
    // Method to search for an item
    public void searchForItem(String itemName) {
        wait.until(ExpectedConditions.visibilityOf(searchBox)).sendKeys(itemName);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }

   

    // Method to click on the "Create Account" link
    public void clickCreateAccountLink() {
        wait.until(ExpectedConditions.elementToBeClickable(createAccountLink)).click();
    }

    // Method to get the page title
    public String getPageTitle() {
        return driver.getTitle();
    }

    // Select United States region
    public void selectUnitedStates() {
        unitedStatesButton.click();
    }

    // Method to sign in using the provided email and password
    public void signIn(String email, String password) {
        mouseOverAccount();
        clickSignIn();
        enterEmail(email);
        enterPassword(password);
        clickSignInSubmit();
    }

    public void mouseOverAccount() {
        actions.moveToElement(accountMenu).perform();
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
    }

    public void clickSignInSubmit() {
        wait.until(ExpectedConditions.elementToBeClickable(signInSubmitButton)).click();
    }
    
 // Method to click on the menu button
    public void clickMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton)).click();
    }

    // Method to click on the "Audio" option
    public void clickAudioOption() {
        wait.until(ExpectedConditions.visibilityOf(audioLink));
        wait.until(ExpectedConditions.elementToBeClickable(audioLink)).click();
    }

    // Method to click on the "Headphones" link
    public void clickHeadphonesLink() {
        wait.until(ExpectedConditions.visibilityOf(headphonesLink));
        wait.until(ExpectedConditions.elementToBeClickable(headphonesLink)).click();
    }
    
    // Method to click on the "AirPods" link
    public void clickAirPodsLink() {
        wait.until(ExpectedConditions.visibilityOf(airPodsLink));
        wait.until(ExpectedConditions.elementToBeClickable(airPodsLink)).click();
    }
    
    // Method to click on the first product under "AirPods"
    public void clickInsideAirpodsLinkItem() {
        wait.until(ExpectedConditions.visibilityOf(insideAirpodsLinkItemAddtoCart));
        wait.until(ExpectedConditions.elementToBeClickable(insideAirpodsLinkItemAddtoCart)).click();
    }
    
    public void clickBrand() {
        wait.until(ExpectedConditions.visibilityOf(BrandLink));
        wait.until(ExpectedConditions.elementToBeClickable(BrandLink)).click();
    }
    
    public void AppleBrand() {
        wait.until(ExpectedConditions.visibilityOf(AppleButton));
        wait.until(ExpectedConditions.elementToBeClickable(AppleButton)).click();
    }
    
    public void AppleWatchMethod() {
        wait.until(ExpectedConditions.visibilityOf(AppleWatch));
        wait.until(ExpectedConditions.elementToBeClickable(AppleWatch)).click();
    }
    
    public void GPSWatchMethod() {
    	wait.until(ExpectedConditions.visibilityOf(GPSWatch));
    	wait.until(ExpectedConditions.elementToBeClickable(GPSWatch)).click();
    }
    
    public void CartWatchMethod() {
    	wait.until(ExpectedConditions.visibilityOf(Addtocartwatch));
    	wait.until(ExpectedConditions.elementToBeClickable(Addtocartwatch)).click();
    }
    
    public void CartPageMethod() {
    	wait.until(ExpectedConditions.visibilityOf(AddtoCartPage));
    	wait.until(ExpectedConditions.elementToBeClickable(AddtoCartPage)).click();
    }
    
    public void CheckoutPageMethod() {
    	wait.until(ExpectedConditions.visibilityOf(CheckOutPage));
    	wait.until(ExpectedConditions.elementToBeClickable(CheckOutPage)).click();
    }
    
    public void ContinuePaymentMethod() {
    	wait.until(ExpectedConditions.visibilityOf(ContinuePaymentPage));
    	wait.until(ExpectedConditions.elementToBeClickable(ContinuePaymentPage)).click();
    }
    
    public void cardnumber(String number) {
    	wait.until(ExpectedConditions.visibilityOf(Cardnumber)).sendKeys(number);
    }
    
    public void firstnameMethod(String firstname) {
    	wait.until(ExpectedConditions.visibilityOf(firstnamecard)).sendKeys(firstname);
    }
    
    public void lastnameMethod(String lastname) {
    	wait.until(ExpectedConditions.visibilityOf(lastnamecard)).sendKeys(lastname);
    }
    
    public void addressMethod(String address) {
    	wait.until(ExpectedConditions.visibilityOf(addresscard)).sendKeys(address);
    }
    
    public void cityMethod(String city) {
    	wait.until(ExpectedConditions.visibilityOf(cityname)).sendKeys(city);
    }
    
    public void stateMethod(String state) {
    	wait.until(ExpectedConditions.elementToBeClickable(statename));
        Select selectState = new Select(statename);
        selectState.selectByVisibleText(state);
    }
    
    public void PinMethod(String pin) {
    	wait.until(ExpectedConditions.visibilityOf(poname)).sendKeys(pin);
    }
    
    public void PlaceOrderMethod() {
    	wait.until(ExpectedConditions.visibilityOf(placeorder));
    	wait.until(ExpectedConditions.elementToBeClickable(placeorder)).click();
    }
}

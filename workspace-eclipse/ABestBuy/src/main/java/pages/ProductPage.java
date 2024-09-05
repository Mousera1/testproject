package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(css = ".sku-header a") // Locator for the first product in the list
    private WebElement firstProductLink;

    @FindBy(css = ".add-to-cart-button") // Locator for the add-to-cart button
    private WebElement addToCartButton;

    @FindBy(linkText = "Headphones") // Locator for "Headphones" under Audio
    private WebElement headphonesLink;

    @FindBy(linkText = "AirPods") // Locator for "AirPods" under Headphones
    private WebElement airPodsLink;

    @FindBy(xpath = "//a[contains(text(), 'Apple - AirPods Pro (2nd generation) with MagSafe Case (USB-C) - White')]") // Locator for the specific AirPods Pro product
    private WebElement airPodsProLink;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    // Method to navigate to the "Headphones" section
    public void navigateToHeadphones() {
        wait.until(ExpectedConditions.elementToBeClickable(headphonesLink)).click();
    }

    // Method to select the AirPods Pro product
    public void selectAirPodsPro() {
        wait.until(ExpectedConditions.elementToBeClickable(airPodsProLink)).click();
    }

    // Method to add the selected product to the cart
    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }
}

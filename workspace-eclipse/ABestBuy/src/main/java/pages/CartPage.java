package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//h1[contains(text(),'Samsonite - Windguard Auto Open/Close Umbrella - New Blue')]")
    private WebElement samsoniteUmbrellaAdded;
    
    @FindBy(css = ".btn-primary") 
    private WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public boolean isSamsoniteUmbrellaAdded() {
        return samsoniteUmbrellaAdded.isDisplayed();
    }

    public void proceedToCheckout() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click(); // This should work as expected
    }
}

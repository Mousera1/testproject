package testpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(linkText = "United States")
    WebElement unitedStatesButton;

    @FindBy(xpath = "//span[text()='Account']")
    WebElement accountMenu;

    @FindBy(xpath = "//a[contains(@href,'identity/global/signin')]")
    WebElement signInButton;

    @FindBy(id = "fld-e")
    WebElement emailField;

    @FindBy(id = "fld-p1")
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit' and text()='Sign In']")
    WebElement signInSubmitButton;
    
    @FindBy(xpath = "//button[text()='Skip for now']")
    WebElement skipForNowButton;
    
    @FindBy(xpath = "//span[contains(text(),'Hi,')]")
    WebElement greetingMessage;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void selectUnitedStates() {
        wait.until(ExpectedConditions.elementToBeClickable(unitedStatesButton)).click();
    }

    public void mouseOverAccount() {
        wait.until(ExpectedConditions.visibilityOf(accountMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountMenu).perform();
    }

    public void clickSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
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
    
    public String getErrorMessage() {
        
        return driver.findElement(By.className("c-section-title cia-section-title cia-section-title__header heading-5 v-fw-medium")).getText();
    }
    public void skipfornow() {
        System.out.println("Attempting to click 'Skip for now' button");
        wait.until(ExpectedConditions.elementToBeClickable(skipForNowButton)).click();
        System.out.println("'Skip for now' button clicked");
    }
    
    public void dismissSavePasswordAlert() {
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.dismiss();
           System.out.println("Save password alert dismissed");
       } catch (Exception e) {
            System.out.println("No alert present to dismiss");
        }
    }
    
    public String getGreetingMessage() {
        wait.until(ExpectedConditions.visibilityOf(greetingMessage));
        return greetingMessage.getText();
    }
}

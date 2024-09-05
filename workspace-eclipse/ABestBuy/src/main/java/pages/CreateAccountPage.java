package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccountPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "fld-p1")
    WebElement password;

    @FindBy(id = "reenterPassword")
    WebElement confirmPassword;

    @FindBy(id = "phone")
    WebElement mobileNumber;

    @FindBy(id = "is-recovery-phone")
    WebElement recoveryCheckBox;

    @FindBy(xpath = "//button[text()='Create an Account']")
    WebElement createAnAccountButton;

    @FindBy(xpath = "//*[text()='Sign Up with Google']")
    WebElement googleSignUp;
    
 // Locator for success message or title
    @FindBy(xpath = "//h1[text()='Account created successfully']")  
    WebElement successMessageTitle;

    
    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    
    public void enterUserDetails(String fName, String lName, String emailAddress, String pwd, String confirmPwd, String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOf(firstName)).sendKeys(fName);
        wait.until(ExpectedConditions.visibilityOf(lastName)).sendKeys(lName);
        wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(emailAddress);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pwd);
        wait.until(ExpectedConditions.visibilityOf(confirmPassword)).sendKeys(confirmPwd);
        wait.until(ExpectedConditions.visibilityOf(mobileNumber)).sendKeys(phoneNumber);
    }

    
    public void clickCreateAnAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(createAnAccountButton)).click();
    }

    
    public void checkRecoveryPhone() {
        if (!recoveryCheckBox.isSelected()) {
            wait.until(ExpectedConditions.elementToBeClickable(recoveryCheckBox)).click();
        }
    }

   
    public void clickGoogleSignUp() {
        wait.until(ExpectedConditions.elementToBeClickable(googleSignUp)).click();
    }
   
    public String getSuccessMessageTitle() {
        return wait.until(ExpectedConditions.visibilityOf(successMessageTitle)).getText();
    }
}

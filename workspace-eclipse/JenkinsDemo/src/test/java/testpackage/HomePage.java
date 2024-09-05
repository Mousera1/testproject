package testpackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//div[@class='css-76zvg2 r-jwli3a r-ubezar']") // Locator for the Login button
    private WebElement loginButton;

    @FindBy(xpath = "//input[@type='number']") // Locator for the mobile number field in the popup
    private WebElement mobileNumberField;

    @FindBy(xpath = "//input[@type='password']") // Locator for the password field in the popup
    private WebElement passwordField;

    @FindBy(xpath = "//div[contains(@class, 'css-1dbjc4n') and contains(@data-testid, 'login-cta')]") // Locator for the Login button in the popup
    private WebElement loginSubmitButton;

    @FindBy(xpath = "//div[contains(@class, 'css-76zvg2') and contains(text(), 'From')]") // Locator for From field
    private WebElement fromField;

    @FindBy(xpath = "//div[contains(text(), 'Bengaluru')]") // Locator for Bengaluru option
    private WebElement bengaluruOption;

    @FindBy(xpath = "//div[contains(@data-testid,'to-testID-destination')]") // Locator for To field
    private WebElement toField;

    @FindBy(xpath = "//div[contains(text(), 'Delhi')]") // Locator for Delhi option
    private WebElement delhiOption;

    @FindBy(xpath = "//div[contains(@class, 'css-1dbjc4n')]") // Locator for calendar icon
    private WebElement calendarIcon;

    @FindBy(xpath = "//div[contains(@class, 'css-76zvg2') and contains(text(), '9')]") // Locator for the date 9
    private WebElement departureDate;

    @FindBy(xpath = "//div[contains(@class, 'css-76zvg2') and contains(text(), 'Passengers')]") // Locator for Passengers dropdown
    private WebElement passengersDropdown;

    @FindBy(css = "[data-testid='home-page-flight-cta']") // Locator for the Search Flights button
    private WebElement searchFlightsButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void login(String mobileNumber, String password) {
        wait.until(ExpectedConditions.visibilityOf(mobileNumberField)).sendKeys(mobileNumber);
        passwordField.sendKeys(password);
    }

    public void clickLoginSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginSubmitButton)).click();
    }

    public void searchFlights() {
        wait.until(ExpectedConditions.elementToBeClickable(fromField)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bengaluruOption)).click();
        wait.until(ExpectedConditions.elementToBeClickable(toField)).click();
        wait.until(ExpectedConditions.elementToBeClickable(delhiOption)).click();
        wait.until(ExpectedConditions.elementToBeClickable(calendarIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(departureDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(passengersDropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchFlightsButton)).click();
    }
}

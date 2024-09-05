package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class SpiceJetFlightSearchRoundTrip {
    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Navigate to SpiceJet website
            driver.get("https://www.spicejet.com/");
            
            // Wait for elements to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Click on the "Round Trip" radio button to select round-trip option
            WebElement roundTripOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-testid, 'round-trip-radio-button')]")));
            roundTripOption.click();
            System.out.println("Round trip selected");

            // Click on the "From" field and select "Bengaluru"
            WebElement fromField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'css-76zvg2') and contains(text(), 'From')]")));
            fromField.click();
            WebElement bengaluruOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Bengaluru')]")));
            bengaluruOption.click();
            System.out.println("From: Bengaluru");

            // Click on the "To" field and select "Delhi"
            WebElement toField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-testid,'to-testID-destination')]")));
            toField.click();
            WebElement delhiOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Delhi')]")));
            delhiOption.click();
            System.out.println("To: Delhi");

            // Select the departure date (September 9, 2024)
            WebElement departureCalendarIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'css-1dbjc4n')]")));
            departureCalendarIcon.click();
            WebElement departureDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'css-76zvg2') and contains(text(), '9')]")));
            departureDate.click();
            System.out.println("Departure date selected: September 9, 2024");

            // Select the return date (October 10, 2024)
            //WebElement returnDateCalendarIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='9']")));
           // returnDateCalendarIcon.click();
            //System.out.println("done");
            WebElement nextMonthButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'css-76zvg2') and contains(text(), 'Return Date')]")));
            nextMonthButton.click(); // Navigate to October
            System.out.println("navigated");
            WebElement returnDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'css-76zvg2') and contains(text(), '9')]")));
            returnDate.click();
            System.out.println("Return date selected: October 9, 2024");

            // Click on the "Passengers" dropdown and select "Adult 1"
          //  WebElement passengersDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'css-76zvg2') and contains(text(), 'Passengers')]")));
           // passengersDropdown.click();
           // WebElement selectAdults = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-testid, 'Adult-testID-plus-one-cta')]")));
           // selectAdults.click();
           // System.out.println("Passengers: 1 Adult");

            // Click the "Search Flights" button
            WebElement flightCTA = driver.findElement(By.cssSelector("[data-testid='home-page-flight-cta']"));
            flightCTA.click();
            System.out.println("Search completed");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            // driver.quit();
        }
    }
}

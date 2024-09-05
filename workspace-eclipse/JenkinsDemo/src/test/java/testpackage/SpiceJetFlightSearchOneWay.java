package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SpiceJetFlightSearchOneWay {
    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Navigate to SpiceJet website
            driver.get("https://www.spicejet.com/");
            
            // Wait for elements to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Click on the "From" field and select "Bengaluru"
            WebElement fromField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'css-76zvg2') and contains(text(), 'From')]")));
            fromField.click();
            

            WebElement bengaluruOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Bengaluru')]")));
            bengaluruOption.click();
            System.out.println("from");

            // Click on the "To" field and select "Delhi"
            WebElement toField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-testid,'to-testID-destination')]")));
            toField.click();

            WebElement delhiOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Delhi')]")));
            delhiOption.click();
            System.out.println("to");

            // Select the departure date (September 7, 2024)

            System.out.println("date");
            

            System.out.println("calender Before");
            
            WebElement iconElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'css-1dbjc4n')]")));
            iconElement.click();     
            System.out.println("calender NEXT");

            
            WebElement passengersDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'css-76zvg2') and contains(text(), 'Passengers')]")));
            passengersDropdown.click();
            System.out.println("adult");

            
            WebElement flightCTA = driver.findElement(By.cssSelector("[data-testid='home-page-flight-cta']"));
            flightCTA.click();
            System.out.println("search completed");
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            //driver.quit();
        }
    }
}

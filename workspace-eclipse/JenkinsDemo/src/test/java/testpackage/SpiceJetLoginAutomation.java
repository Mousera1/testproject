package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetLoginAutomation {
    public static void main(String[] args) {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Navigate to SpiceJet website
        	 driver.get("https://www.spicejet.com/");
             
             // Create a WebDriverWait object
        	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
            // Locate and interact with the login elements using XPath
            WebElement Loginbutton = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar']"));
            Loginbutton.click();

            // Mobile number input field
            WebElement mobileNumberInput = driver.findElement(By.xpath("//input[@type='number']"));
            mobileNumberInput.sendKeys("9442630232"); // Replace with actual mobile number

            // Password input field
            WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
            passwordInput.sendKeys("HANA2@legend"); // Replace with actual password

            // Login submit button
          //  WebElement loginButton = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19m6qjp r-z2wwpe r-1loqt21 r-1x0uki6 r-1e081e0 r-1f1sjgu r-ah5dr5 r-1otgn73']"));
           // loginButton.click();
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'css-1dbjc4n') and contains(@data-testid, 'login-cta')]")));
            loginButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up and close the browser
           // driver.quit();
        }
    }
}

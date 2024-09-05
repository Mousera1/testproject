package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Samsonite - Windguard Auto Open/Close Umbrella - New Blue')]") 
    private WebElement firstResultLink;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFirstResult() {
        firstResultLink.click();
    }
}
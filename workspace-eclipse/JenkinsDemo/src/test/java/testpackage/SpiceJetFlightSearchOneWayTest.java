package testpackage;


import org.testng.annotations.Test;

public class SpiceJetFlightSearchOneWayTest extends BaseTest {

    @Test
    public void testFlightSearch() {
        HomePage homePage = new HomePage(driver);

        // Click on the Login button and perform login
        //homePage.clickLoginButton();
        //homePage.login("9442630232", "HANA2@legend");
        //homePage.clickLoginSubmitButton();

        // Search for flights
        homePage.searchFlights();

        System.out.println("Flight search completed successfully.");
    }
}

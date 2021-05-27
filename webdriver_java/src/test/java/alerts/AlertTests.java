package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Incorrect result message");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerConfirmation();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Incorrect alert text message");
    }

    @Test
    public void testAcceptEnteredTextOfAlert() {
        var alertsPage = homePage.clickAlertsPage();
        String text = "TAU rocks!";

        alertsPage.triggerPrompt();
        alertsPage.setInput(text);
        alertsPage.alert_clickToAccept();
        assertTrue(alertsPage.getResult()
                        .contains(text),
                "Incorrect result text");
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAddPage {

    //TO DO: move modal to inner class so both page and modal can be interacted with
    private final WebDriver driver;
    private final By closeModalButton = By.className("modal-footer");

    public EntryAddPage(WebDriver driver){
        this.driver = driver;
    }

    public void modalClose(){
        driver.findElement(closeModalButton).click();
    }
}

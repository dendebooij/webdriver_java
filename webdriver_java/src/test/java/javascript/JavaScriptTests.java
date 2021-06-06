package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void addMultipleAttributeToDropDown(){

        var dropDownPage = homePage.clickDropDown();
        dropDownPage.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 2, "Incorrect number of selections");
    }
}

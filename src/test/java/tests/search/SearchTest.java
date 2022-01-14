package tests.search;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.URL.AVITO_HOME_PAGE;

public class SearchTest extends BaseTest {
    @Test (
            groups = { "CPT" }
    )
    public void checkIsRedirectToListing() {
        basePage.open(AVITO_HOME_PAGE);

        avitoHomePage
                .enterProductCategory()
                .clickFind();

        avitoListingPage.checkCountOfCards();
    }

    @Test (
            dataProvider = "provider",
            dataProviderClass = data.SimpleDataProviderTestNG.class,
            groups = { "smoke", "regress" }
    )
    public void checkSearchResultsHaveDescription(String description) {
        basePage.open(AVITO_HOME_PAGE);

        avitoHomePage
                .enterProductDescription(description)
                .clickFind();

        avitoListingPage.checkContentHasDescription(description);
    }
}

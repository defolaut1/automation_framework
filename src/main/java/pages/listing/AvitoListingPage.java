package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class AvitoListingPage extends BasePage {
    public AvitoListingPage(WebDriver driver) {
        super(driver);
    }

    private By card = By.xpath("//div[contains(@class, 'iva-item-root')]");

    public AvitoListingPage checkCountOfCards() {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 56);

        return this;
    }

    public AvitoListingPage checkContentHasDescription(String description) {
        int webElementsCount = driver.findElements(
                By.xpath(
                        "//div[contains(@class, 'iva-item-root')]//*[contains(text(), '"
                                + description + "" +
                                "')]"
                )
        ).size();

        Assert.assertTrue(webElementsCount > 0);

        return this;
    }
}

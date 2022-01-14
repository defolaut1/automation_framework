package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class AvitoHomePage extends BasePage {

    public AvitoHomePage(WebDriver driver) {
        super(driver);
    }

    private final By productCategory = By.id("category");
    private final By optionHobby = By.xpath("//select[@id='category']//option[contains(text(), 'Хобби')]");
    private final By textField = By.xpath("//input[@type='text'][1]");
    private final By findButton = By.xpath("//button[contains(@class, 'form-part-button')]");

    /**
     * Do you need to put wait everywhere?
     * Do you need to check atPage every time?
     */
    public AvitoHomePage enterProductDescription(String description) {
        driver.findElement(textField).sendKeys(description);

        return this;
    }

    public AvitoHomePage enterProductCategory() {
        driver.findElement(productCategory).click();
        driver.findElement(optionHobby).click();

        return this;
    }

    public AvitoHomePage clickFind() {
        WebElement btn = driver.findElement(findButton);
        waitElementIsVisible(btn).click();

        return this;
    }
}

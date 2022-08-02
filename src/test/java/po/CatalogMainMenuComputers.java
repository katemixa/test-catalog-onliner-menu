package po;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CatalogMainMenuComputers {
    private final WebDriver driver;
    private final By computersItemLocator = By.xpath("//span[contains(text(), 'Компьютеры и')]");
    private final By computersSubmenuLocator = By.xpath("//div[@data-id='2']");
    private final By computersSubmenuItemLocator = By.xpath("//div[contains(text(), ' Ноутбуки, компьютеры, мониторы ')]");
    private final By compAccessoriesSubSubmenuItemLocator = By.xpath("//div[contains(text(), ' Комплектующие ')]");
    private final By storageSubmenuItemLocator = By.xpath("//div[contains(text(), ' Хранение данных ')]");
    private final By networkHardwareSubmenuItemLocator = By.xpath("//div[contains(text(), ' Сетевое оборудование ')]");

    public CatalogMainMenuComputers(WebDriver driver) {
        this.driver = driver;
    }

    public boolean IsSubmenuItemsComputersDisplayed() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)", "");
        driver.findElement(computersItemLocator).click();
        return StringUtils.contains("display: block;", driver.findElement(computersSubmenuLocator).getAttribute("style"));
    }

    public boolean isSubmenuItemNotebooksDisplayed() {
        return driver.findElement(computersSubmenuItemLocator).isDisplayed();
    }

    public boolean isSubmenuItemCompAccessoriesDisplayed() {
        return driver.findElement(compAccessoriesSubSubmenuItemLocator).isDisplayed();
    }

    public boolean isSubmenuItemStorageDisplayed() {
        return driver.findElement(storageSubmenuItemLocator).isDisplayed();
    }

    public boolean isSubmenuItemNetworkHardwareDisplayed() {
        return driver.findElement(networkHardwareSubmenuItemLocator).isDisplayed();
    }

}

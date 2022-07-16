package catalog_main_page_object;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CatalogMainMenuComputers {
    private final WebDriver driver;
    By computersItemLocator = By.xpath("//span[contains(text(), 'Компьютеры и')]");
    By computersSubmenuLocator = By.xpath("//div[@data-id='2']");
    By computersSubmenuItemLocator = By.xpath("//div[contains(text(), ' Ноутбуки, компьютеры, мониторы ')]");
    By compAccessoriesSubSubmenuItemLocator = By.xpath("//div[contains(text(), ' Комплектующие ')]");
    By storageSubmenuItemLocator = By.xpath("//div[contains(text(), ' Хранение данных ')]");
    By networkHardwareSubmenuItemLocator = By.xpath("//div[contains(text(), ' Сетевое оборудование ')]");

    public CatalogMainMenuComputers(WebDriver driver) {
        this.driver = driver;
    }

    public boolean computersSubmenuIsDisplayed() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)", "");
        driver.findElement(computersItemLocator).click();
        return StringUtils.contains("display: block;", driver.findElement(computersSubmenuLocator).getAttribute("style"));
    }

    public boolean computersSubmenuItemIsDisplayed() {
        return driver.findElement(computersSubmenuItemLocator).isDisplayed();
    }

    public boolean compAccessoriesSubSubmenuItemIsDisplayed() {
        return driver.findElement(compAccessoriesSubSubmenuItemLocator).isDisplayed();
    }

    public boolean storageSubmenuItemIsDisplayed() {
        return driver.findElement(storageSubmenuItemLocator).isDisplayed();
    }

    public boolean networkHardwareSubmenuItemIsDisplayed() {
        return driver.findElement(networkHardwareSubmenuItemLocator).isDisplayed();
    }

}

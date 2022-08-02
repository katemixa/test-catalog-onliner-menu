package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogMainPage {
    private final WebDriver driver;
    private final By electronicsItemLocator = By.xpath("//span[contains(text(), 'Электроника')]");
    private final By computersItemLocator = By.xpath("//span[contains(text(), 'Компьютеры и')]");
    private final By householdAppliancesItemLocator = By.xpath("//span[contains(text(), 'Бытовая техника')]");
    private final By buildsItemLocator = By.xpath("//span[contains(text(), 'Стройка и')]");
    private final By homeAndGardenItemLocator = By.xpath("//span[contains(text(), 'Дом и')]");
    private final By autoAndMotoItemLocator = By.xpath("//span[contains(text(), 'Авто и')]");
    private final By beautyAndSportItemLocator = By.xpath("//span[contains(text(), 'Красота и')]");
    private final By childrenItemLocator = By.xpath("//span[contains(text(), 'Детям и')]");
    private final By workAndOfficeItemLocator = By.xpath("//span[contains(text(), 'Работа и')]");
    private final By foodItemLocator = By.xpath("//span[contains(text(), 'Еда')]");

    public CatalogMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElectronicsMenuItemDisplayed(){
        return driver.findElement(electronicsItemLocator).isDisplayed();
    }

    public boolean isComputersMenuItemDisplayed(){
        return driver.findElement(computersItemLocator).isDisplayed();
    }

    public boolean isHouseholdAppliancesMenuItemDisplayed(){
        return driver.findElement(householdAppliancesItemLocator).isDisplayed();
    }

    public boolean isBuildsMenuItemDisplayed(){
        return driver.findElement(buildsItemLocator).isDisplayed();
    }

    public boolean isHomeAndGardenMenuItemDisplayed(){
        return driver.findElement(homeAndGardenItemLocator).isDisplayed();
    }

    public boolean isAutoAndMotoMenuItemDisplayed(){
        return driver.findElement(autoAndMotoItemLocator).isDisplayed();
    }

    public boolean isBeautyAndSportMenuItemDisplayed(){
        return driver.findElement(beautyAndSportItemLocator).isDisplayed();
    }

    public boolean isChildrenMenuItemDisplayed(){
        return driver.findElement(childrenItemLocator).isDisplayed();
    }

    public boolean isWorkAndOfficeMenuItemDisplayed(){
        return driver.findElement(workAndOfficeItemLocator).isDisplayed();
    }

    public boolean isFoodMenuItemDisplayed(){
        return driver.findElement(foodItemLocator).isDisplayed();
    }

}

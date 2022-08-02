package catalog_main_page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogMainPage {
    private final WebDriver driver;
    By electronicsItemLocator = By.xpath("//span[contains(text(), 'Электроника')]");
    By computersItemLocator = By.xpath("//span[contains(text(), 'Компьютеры и')]");
    By householdAppliancesItemLocator = By.xpath("//span[contains(text(), 'Бытовая техника')]");
    By buildsItemLocator = By.xpath("//span[contains(text(), 'Стройка и')]");
    By homeAndGardenItemLocator = By.xpath("//span[contains(text(), 'Дом и')]");
    By autoAndMotoItemLocator = By.xpath("//span[contains(text(), 'Авто и')]");
    By beautyAndSportItemLocator = By.xpath("//span[contains(text(), 'Красота и')]");
    By childrenItemLocator = By.xpath("//span[contains(text(), 'Детям и')]");
    By workAndOfficeItemLocator = By.xpath("//span[contains(text(), 'Работа и')]");
    By foodItemLocator = By.xpath("//span[contains(text(), 'Еда')]");

    public CatalogMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean electronicsMenuItemIsDisplayed(){
        return driver.findElement(electronicsItemLocator).isDisplayed();
    }

    public boolean computersMenuItemIsDisplayed(){
        return driver.findElement(computersItemLocator).isDisplayed();
    }

    public boolean householdAppliancesMenuItemIsDisplayed(){
        return driver.findElement(householdAppliancesItemLocator).isDisplayed();
    }

    public boolean buildsMenuItemIsDisplayed(){
        return driver.findElement(buildsItemLocator).isDisplayed();
    }

    public boolean homeAndGardenMenuItemIsDisplayed(){
        return driver.findElement(homeAndGardenItemLocator).isDisplayed();
    }

    public boolean autoAndMotoMenuItemIsDisplayed(){
        return driver.findElement(autoAndMotoItemLocator).isDisplayed();
    }

    public boolean beautyAndSportMenuItemIsDisplayed(){
        return driver.findElement(beautyAndSportItemLocator).isDisplayed();
    }

    public boolean childrenMenuItemIsDisplayed(){
        return driver.findElement(childrenItemLocator).isDisplayed();
    }

    public boolean workAndOfficeMenuItemIsDisplayed(){
        return driver.findElement(workAndOfficeItemLocator).isDisplayed();
    }

    public boolean foodMenuItemIsDisplayed(){
        return driver.findElement(foodItemLocator).isDisplayed();
    }




}

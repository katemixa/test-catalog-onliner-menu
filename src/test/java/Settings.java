import catalog_main_page_object.CatalogMainMenuComputers;
import catalog_main_page_object.CompAccessoriesSubmenu;
import io.github.bonigarcia.wdm.WebDriverManager;
import catalog_main_page_object.CatalogMainPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
    public final static String URL_CONNECTION = "https://www.onliner.by/";
    public static ChromeDriver driver;
    public static CatalogMainPage catalogMainPage;
    public static CatalogMainMenuComputers catalogMainMenuComputers;
    public static CompAccessoriesSubmenu compAccessoriesSubmenu;

    @BeforeClass
    public static void openConnection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_CONNECTION);
        catalogMainPage = new CatalogMainPage(driver);
        catalogMainMenuComputers = new CatalogMainMenuComputers(driver);
        compAccessoriesSubmenu = new CompAccessoriesSubmenu(driver);
        driver.findElement(By.linkText("Каталог")).click();
    }

    @AfterClass
    public static void closeConnection() {
        driver.quit();
    }

}

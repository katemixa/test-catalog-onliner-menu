import catalog_main_page_object.CatalogMainPage;
import org.junit.Assert;
import org.junit.Test;

public class CatalogMainPageTest extends Settings {

    @Test
    public void testElectronicsMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainPage.electronicsMenuItemIsDisplayed());
    }

    @Test
    public void testComputersMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainPage.computersMenuItemIsDisplayed());
    }

    @Test
    public void testHouseholdAppliancesMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainPage.householdAppliancesMenuItemIsDisplayed());
    }

    @Test
    public void testBuildsMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainPage.buildsMenuItemIsDisplayed());
    }

    @Test
    public void testHomeAndGardenMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainPage.homeAndGardenMenuItemIsDisplayed());
    }

    @Test
    public void testAutoAndMotoMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainPage.autoAndMotoMenuItemIsDisplayed());
    }

    @Test
    public void testBeautyAndSportMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainPage.beautyAndSportMenuItemIsDisplayed());
    }

    @Test
    public void testChildrenMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainPage.childrenMenuItemIsDisplayed());
    }

    @Test
    public void testWorkAndOfficeMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainPage.workAndOfficeMenuItemIsDisplayed());
    }

    @Test
    public void testFoodMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainPage.foodMenuItemIsDisplayed());
    }
}

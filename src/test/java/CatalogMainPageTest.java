import org.junit.Assert;
import org.junit.Test;

public class CatalogMainPageTest extends Settings {

    @Test
    public void isMenuItemElectronicsDisplayed() {
        Assert.assertTrue(catalogMainPage.isElectronicsMenuItemDisplayed());
    }

    @Test
    public void isMenuItemComputersDisplayed() {
        Assert.assertTrue(catalogMainPage.isComputersMenuItemDisplayed());
    }

    @Test
    public void isMenuItemHouseholdAppliancesDisplayed() {
        Assert.assertTrue(catalogMainPage.isHouseholdAppliancesMenuItemDisplayed());
    }

    @Test
    public void isMenuItemBuildsDisplayed() {
        Assert.assertTrue(catalogMainPage.isBuildsMenuItemDisplayed());
    }

    @Test
    public void isMenuItemHomeAndGardenDisplayed() {
        Assert.assertTrue(catalogMainPage.isHomeAndGardenMenuItemDisplayed());
    }

    @Test
    public void isMenuItemAutoAndMotoDisplayed() {
        Assert.assertTrue(catalogMainPage.isAutoAndMotoMenuItemDisplayed());
    }

    @Test
    public void isMenuItemBeautyAndSportDisplayed() {
        Assert.assertTrue(catalogMainPage.isBeautyAndSportMenuItemDisplayed());
    }

    @Test
    public void isMenuItemChildrenDisplayed() {
        Assert.assertTrue(catalogMainPage.isChildrenMenuItemDisplayed());
    }

    @Test
    public void isMenuItemWorkAndOfficeDisplayed() {
        Assert.assertTrue(catalogMainPage.isWorkAndOfficeMenuItemDisplayed());
    }

    @Test
    public void isMenuItemFoodDisplayed() {
        Assert.assertTrue(catalogMainPage.isFoodMenuItemDisplayed());
    }
}

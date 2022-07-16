import org.junit.Assert;
import org.junit.Test;

public class CatalogMainMenuComputersTest extends Settings {

    @Test
    public void testComputersSubmenuIsDisplayed() {
        Assert.assertTrue(catalogMainMenuComputers.computersSubmenuIsDisplayed());
    }

    @Test
    public void testComputersMenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainMenuComputers.computersSubmenuItemIsDisplayed());
    }

    @Test
    public void testCompAccessoriesSubSubmenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainMenuComputers.compAccessoriesSubSubmenuItemIsDisplayed());
    }

    @Test
    public void testStorageSubmenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainMenuComputers.storageSubmenuItemIsDisplayed());
    }

    @Test
    public void testNetworkHardwareSubmenuItemIsDisplayed() {
        Assert.assertTrue(catalogMainMenuComputers.networkHardwareSubmenuItemIsDisplayed());
    }



}

import org.junit.Assert;
import org.junit.Test;

public class CatalogMainMenuComputersTest extends Settings {

    @Test
    public void isSubmenuComputersDisplayed() {
        Assert.assertTrue(catalogMainMenuComputers.IsSubmenuItemsComputersDisplayed());
    }

    @Test
    public void isSubmenuItemNotebooksDisplayed() {
        Assert.assertTrue(catalogMainMenuComputers.isSubmenuItemNotebooksDisplayed());
    }

    @Test
    public void isSubmenuItemCompAccessoriesDisplayed() {
        Assert.assertTrue(catalogMainMenuComputers.isSubmenuItemCompAccessoriesDisplayed());
    }

    @Test
    public void isSubmenuItemStorageDisplayed() {
        Assert.assertTrue(catalogMainMenuComputers.isSubmenuItemStorageDisplayed());
    }

    @Test
    public void isSubmenuItemNetworkHardwareDisplayed() {
        Assert.assertTrue(catalogMainMenuComputers.isSubmenuItemNetworkHardwareDisplayed());
    }



}

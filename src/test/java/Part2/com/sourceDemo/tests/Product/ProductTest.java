package Part2.com.sourceDemo.tests.Product;

import Part2.com.sourceDemo.base.BaseTest;
import com.sourceDemo.pages.ProductPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;


public class ProductTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed() {
      ProductPage productPage = loginPage.
              loginIntoApplication("standard_user", "secret_sauce");
      assertTrue("\n Product Header Is Not Displayed \n", productPage.isProductsDisplayed());
    }
}

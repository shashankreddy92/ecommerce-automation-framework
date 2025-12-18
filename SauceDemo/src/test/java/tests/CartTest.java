package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest() {
        LoginPage login = new LoginPage(driver);
        ProductsPage products = new ProductsPage(driver);

        login.login("standard_user", "secret_sauce");
        products.addProductToCart();
        products.openCart();
    }
}

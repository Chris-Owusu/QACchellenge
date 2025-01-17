import org.testng.annotations.Test;
import org.week3.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void loginTest() {
        loginPage.clickRecapture().click();

        loginPage.changeCurrency().selectOption("Euro");
        loginPage.searchBox("Desktop");
        loginPage.searchSubmitBtn().click();

        loginPage.sortProduct().selectOption("Price: Low to High");

        loginPage.secondItem().click();
        loginPage.thirdItem().click();
        loginPage.selectRAM().selectOption("2 GB");
        loginPage.selectHDD().click();
        loginPage.comparePageAddToCart().click();

        loginPage.cartBtn().click();
        loginPage.closeAddToCartBtn().click();

        loginPage.addGiftWrapping().selectOption("Yes [+$10.00]");
        loginPage.agreementBtn().click();
        loginPage.checkoutBtn().click();

        loginPage.guestCheckout().click();
    }
}

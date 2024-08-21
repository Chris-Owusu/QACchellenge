import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Setup..............");


        // Configure browser settings
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://www.saucedemo.com";
//        Configuration.headless = true;



        // Open the base URL before each test
        open("/");
        // Assert the current URL
        assertEquals(WebDriverRunner.url(), "https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Teardown..............");

        // Clear browser history
        clearBrowserCookies();
        clearBrowserLocalStorage();
        closeWebDriver();
    }
}

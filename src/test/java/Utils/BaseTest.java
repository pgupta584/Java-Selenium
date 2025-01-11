package Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize the WebDriver
        driver = new SafariDriver();
        driver.get("https://www.saucedemo.com"); // Replace with your practice website URL
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after test execution
        if (driver != null) {
            driver.quit();
        }
    }
}

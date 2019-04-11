import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest  {

    @Test

    public void loginTest() {

        System.setProperty("webdriver.chrome.driver", "D:\\# Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        loginPage login = new loginPage(driver);
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();

        driver.quit();

    }
}

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectCategoryAndProduct {

    @Test

    public void loginTest() {

        System.setProperty("webdriver.chrome.driver", "D:\\# Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        selectCategoryAndProduct select = new selectCategoryAndProduct();
        select.clickOnCategory();
        select.clickOnProduct();

        driver.quit();

    }
}

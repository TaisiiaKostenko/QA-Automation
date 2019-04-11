import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;

    By username = By.id("email");
    By password = By.id("passwd");
    By loginButton = By.xpath("//*[@id=\"SubmitLogin\"]/span");

    public loginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void typeUserName() {

        driver.findElement(username).sendKeys("tae4ka2008@ukr.net");
    }

    public void typePassword() {

        driver.findElement(password).sendKeys("1234567890");
    }

    public void clickOnLoginButton() {

        driver.findElement(loginButton).click();
    }


}

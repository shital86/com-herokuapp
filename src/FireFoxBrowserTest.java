import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        System.out.println("The Page Resource: " + driver.getPageSource());
        String title = driver.getTitle();
        System.out.println("Page Title:" + title);
        System.out.println("Current Url:" + driver.getCurrentUrl());
        System.out.println("Current Url:" +driver.getCurrentUrl());
        WebElement usernameField = driver.findElement(By.id("username"));
        System.out.println(usernameField);
        usernameField.sendKeys("tomsmith");
        // driver.close();//Close the browser
        WebElement passwordField = driver.findElement(By.name("password"));//sending password to password field element
        System.out.println(passwordField);
        passwordField.sendKeys("SuperSecretPassword!");
    }
}

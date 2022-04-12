import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(baseUrl);
        String title= driver.getTitle();
        System.out.println(title);
        System.out.println("Current Url:" +driver.getCurrentUrl());
        WebElement usernameField= driver.findElement(By.id("username"));
        System.out.println(usernameField);
        usernameField.sendKeys("tomsmith");
        WebElement passwordField= driver.findElement(By.name("password"));
        System.out.println(passwordField);
        passwordField.sendKeys("SuperSecretPassword!");
        System.out.println(driver.getPageSource());

    }
}

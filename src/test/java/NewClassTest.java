import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewClassTest {

    @Test
    public void company () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

    }

    @Test

    public void spectreMethod() {
        System.out.println("This is the Spectre branch");
        Assert.assertEquals("spectre","spectre");

    }

}

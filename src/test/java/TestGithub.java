import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGithub {

    @Test
    public void testGithub() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.close();

    }
@Test
    public void methodYaneth() {

        Assert.assertEquals("Actual", "Actual");
        System.out.println("second test");
    }

}

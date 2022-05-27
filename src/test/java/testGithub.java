import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testGithub {

    @Test
    public void testGithub() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


    }
}

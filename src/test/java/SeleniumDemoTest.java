import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SeleniumDemoTest {
    static WebDriver driver;

    @BeforeClass
    public static void webDriverGetUrlOpensite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/");
    }

    @Test
  public  void getTitleInOpenedsiteVerifyWithText() {

        System.out.println("In verify title test case");
        String title = driver.getTitle();
        assertTrue(title.contains("Online Tutorials Library"));

    }
        @Test
        public void getHeadingVerifyWithText () {
            System.out.println("In verify Heading Text Above Search Test Case");
            String expectedSearchHeading = "Simply Easy Learning at your fingertips";
            String actualHeading = driver.findElement(By.xpath("//h1")).getText();
assertEquals(expectedSearchHeading,actualHeading);

        }
        @AfterClass
        public static void afterWorkCloseDriver() {
            driver.quit();
        }

    }


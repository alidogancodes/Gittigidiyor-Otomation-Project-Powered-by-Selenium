import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class TestBasics {

    protected WebDriver driver;
    MethodsPool methodsPool;
    String homePageUrl = "https://www.gittigidiyor.com/";

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homePageUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        methodsPool = new MethodsPool(driver);
        System.out.println("Test starting...");
    }

    @After
    public void finish(){
        System.out.println("Test finished.");
        driver.quit();
    }
}

package Find_The_Fake_Gold_Bar_Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class Fake_Gold_Bar_Test_Parent {
    public static WebDriver driver;
    public static ExtentTest logger;
    public static ExtentReports reports;

    @BeforeSuite
    public void setup_reports() {
        reports = new ExtentReports("src/main.java/HTML_Report.AutomationReport.html", true);
    }

    @BeforeTest
    public void setupWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-maximized");
        options.addArguments("Incognito");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://sdetchallenge.fetch.com/");
    }

    @BeforeMethod
    public void settingTestName(Method methodName) {
        logger = reports.startTest(methodName.getName());
    }

    @AfterMethod
    public void endingTestName(Method methodName) {
        reports.endTest(logger);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

        @AfterSuite
        public void flushReport() {
            reports.flush();
        }//end of aftersuite

    }


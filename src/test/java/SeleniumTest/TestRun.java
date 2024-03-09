package SeleniumTest;

import Pages.HomePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestRun {
    public static WebDriver driver;

    @BeforeMethod
    public static void setUp() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    public static void allFruit_item() {
        HomePages.product_list_fruit();
        HomePages.reviewProduct();
        HomePages.compare_card_view_items();

    }


  /*  @AfterMethod
    public static void closeUp(){
        driver.close();
    }*/
}

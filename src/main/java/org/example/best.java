package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class best {
    public static WebDriver driver;

    @Test
    public static void lung() {
        day d = new day();
        d.lunch();


    }

    @AfterMethod
    public static void closed() {
        driver.close();
    }

    @BeforeMethod
    public void webLnch() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }


}









      /*  Properties prop;
        prop = new Properties();
        FileInputStream fls;
        fls = new FileInputStream(System.getProperty("usr.dir")+"//src//main//java//org//example//best.java");
        prop.load(fls);


        String browseName = prop.getProperty("browser");
        if (browseName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();


        }
        else if (browseName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();


        }
        else if (browseName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();


        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;

    }
    public WebDriver kok() throws IOException {
        driver = iniWeb();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        return driver;




    }*/


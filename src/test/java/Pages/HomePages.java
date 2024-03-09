package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static SeleniumTest.TestRun.driver;

public class HomePages {

    public static String product_list_fruits_xpath = "//div[@class='products'] //h4";
    public static String add_toCard_fruits_xpath = "//div[@class='products'] //button";
    public static String click_on_shopBox_css = ".cart-icon";
    public static String[] product = {"Onion", "Tomato", "Mango", "Almonds"};
    public static String compare_cardItem_xpath = "//*[@class='cart-item'] //p[@class='product-name']";


    public static void product_list_fruit() {
        List<WebElement> nameAllProducts = driver.findElements(By.xpath(product_list_fruits_xpath));
        int j = 0;
        for (int i = 0; i < nameAllProducts.size(); i++) {
            String newProduct = nameAllProducts.get(i).getText().split("-")[0].trim();

            List productArray = Arrays.asList(product);

            if (productArray.contains(newProduct)) {
                j++;
                driver.findElements(By.xpath(add_toCard_fruits_xpath)).get(i).click();
            }
            if (j == product.length) {
                break;
            }
        }

    }

    public static void reviewProduct() {
        driver.findElement(By.cssSelector(click_on_shopBox_css)).click();

    }

    public static void compare_card_view_items() {
        List<String> collect = driver.findElements(By.xpath(compare_cardItem_xpath)).stream().map(s -> s.getText().split("-")[0].trim()).collect(Collectors.toList());
        collect.forEach(s -> System.out.println(s));
        List<String> collectNew = Arrays.stream(product).sorted().collect(Collectors.toList());
        collectNew.forEach(s -> System.out.println(s));
        if (collect.equals(collectNew)) {
            Assert.assertTrue(true);

        }


    }


}

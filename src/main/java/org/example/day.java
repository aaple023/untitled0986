package org.example;

import org.openqa.selenium.By;

import static org.example.best.driver;

public class day {
    public void lunch() {

        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("neha");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();


    }


}

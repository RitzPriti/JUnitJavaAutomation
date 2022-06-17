package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationJUnit {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void OpnUrl(){
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Ritz");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.id("Email")).sendKeys("ritz3579@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();
        System.out.println("Registration complete");
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}


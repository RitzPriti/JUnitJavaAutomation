package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsiteMainMethod {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.bbc.co.uk/");
        driver.manage().window().maximize();
        driver.close();

    }
}

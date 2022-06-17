package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInJUnit {
      WebDriver driver;
  @Before
     public void OpnUrl(){
      driver.get("https://demo.nopcommerce.com/");
      driver.findElement(By.className("ico-login")).click();
      driver.findElement(By.id("Email")).sendKeys("ritz3579@gmail.com");
      driver.findElement((By.id("Password"))).sendKeys("123456");
      driver.findElement((By.className("login-button"))).click();
      System.out.println("Logged in");
  }
  @After
    public void LogOut() throws InterruptedException {
      driver.findElement(By.className("ico-logout")).click();
      System.out.println("Logged Out");
      Thread.sleep(5000);
      driver.close();

  }
}

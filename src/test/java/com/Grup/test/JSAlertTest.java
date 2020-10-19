package com.Grup.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JSAlertTest {

    /* driver.switchTo.alert()getText()
   ->Alertin icineki mesaji aliyor
   driver.switchTo.alert().sendKeys()->alertin icerisine mesaj gonderiyoruz
  driver.switchTo.alert().acccept()-> tamam. kabul et
   driver.switchTo.alert().dismiss()->vazgec/reddet
     */
    WebDriver driver;
    @BeforeClass
    //@Test
    public void sweetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement buton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        buton.click();

        String mesaj =driver.switchTo().alert().getText();

        System.out.println(mesaj);


        driver.switchTo().alert().sendKeys("selamlar");
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();



    }
}

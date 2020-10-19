package com.Grup.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Malzemeler {

   // https://the-internet.herokuapp.com/windows

//    SENARYO - JournalsGlobal.com'un içerisindeki, iframe ile eklenmiş olan wikipedia.org sayfasındaki
//          <div id="logo" /> webelementini locate edelim.
//            journalsglobal.com
//            <a href="/register.php">Register</a>
//         wikipedia.org
//            <div id="logo" />
//->driver.findElement(By.id("logo"))   BU HATALI KULLANIM OLUR, ÇÜNKÜ IFRAME'E GEÇİŞ YAPMAK ZORUNDAYIZ !
//          1. ADIM iframe'e geçiş yapmamız gerekir.
//            2. ADIM 	driver.findElement(By.id("logo"))
//
//            3. ADIM driver.switchTo().defaultContent()



// https://the-internet.herokuapp.com/iframe
    // 1. Adım : Sayfadaki iframe'i bulacağız.
    // 2. Adım : O iframe'in içerisindeki "p" tag name'ine sahip webelementi bulacağız.
    // 3. Adım : İçerisine "Selamlar IFRAME" yazdıracağız.
    // 4. Adım : Iframe'den çıkış yapıp, sayfamıza döneceğiz (defaultContent)
    // 5. Adım : "Elemental Selenium" linkini bulup, tıklayacağız.


 /*
    1. Adım : the-internet.herokuapp.com/windows bu sayfaya gittiğimizde,
              sayfanın WindowHandle'ını alalım.
    2. Adım : Click Here linkine tıklayalım.
    3. Adım : Gittiğimiz sayfadan, the-internet.herokuapp.com/windows sayfasına
              window handle'ını kullanarak geçiş yapalım.
 */



    @Test
    public void test01() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");


    }

}

package com.Grup.test;

import com.Grup.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle extends TestBase {
    public WindowHandle() {
    }

    @Test
    public void test() throws InterruptedException {
        this.driver.get("https://the-internet.herokuapp.com/windows");
        String anaSayfaWindowHandle = this.driver.getWindowHandle();
        System.out.println(anaSayfaWindowHandle);
        this.driver.findElement(By.partialLinkText("Click Here")).click();
        Thread.sleep(5000L);
        this.driver.switchTo().window(anaSayfaWindowHandle);
        Set<String> tumWindowHanlelar = this.driver.getWindowHandles();
        Iterator var3 = tumWindowHanlelar.iterator();

        while(var3.hasNext()) {
            String handle = (String)var3.next();
            System.out.println(handle);
        }

    }
}

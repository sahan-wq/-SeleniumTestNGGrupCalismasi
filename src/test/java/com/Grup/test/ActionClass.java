package com.Grup.test;

import com.Grup.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


    public class ActionClass extends TestBase {
        public ActionClass() {
        }

        @Test
        public void sagTiklama() {
            this.driver.get("http://demo.guru99.com/test/simple_context_menu.html");
            Actions actions = new Actions(this.driver);
            WebElement rightClicMe = this.driver.findElement(By.xpath("//*[.='right click me']"));
            actions.contextClick(rightClicMe).perform();
        }

        @Test
        public void ciftTiklama() {
            this.driver.get("http://demo.guru99.com/test/simple_context_menu.html");
            Actions actions = new Actions(this.driver);
            WebElement doubleClick = this.driver.findElement(By.tagName("button"));
            actions.doubleClick(doubleClick).perform();
        }

        @Test
        public void hoverOver() {
            this.driver.get("http://amazon.com");
            Actions actions = new Actions(this.driver);
            WebElement accountList = this.driver.findElement(By.id("nav-link-accountList"));
            actions.moveToElement(accountList).perform();
        }
    }



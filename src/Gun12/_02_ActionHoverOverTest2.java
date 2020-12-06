package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _02_ActionHoverOverTest2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get("https://www.etsy.com/");

        WebElement clothingMenu=driver.findElement(By.id("catnav-primary-link-10923"));
        WebElement kidsMenu=driver.findElement(By.id("side-nav-category-link-10941"));

        Actions builder=new Actions(driver);
        Action build=builder.moveToElement(clothingMenu).build();
        build.perform();

        Thread.sleep(1000);

        build=builder.moveToElement(kidsMenu).build();
        build.perform();

        Thread.sleep(6000);
        driver.quit();
    }
}
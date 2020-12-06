package Gun09;

/*
boolean isSelected();   checkbox, radiobutton
boolean isEnabled();
boolean isDisplayed();

isEnabled
Monday -> true
Sunday -> false

isSelected();
Tuesday -> true
Thursday -> false


isDisplayed();
Monday -> true
Sunday -> true

 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _02_ElemaninStatusu extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox"); // siteyi açtım

        Thread.sleep(1000);
        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println(sali.isDisplayed());
        System.out.println(sali.isEnabled());
        System.out.println(sali.isSelected());
        Thread.sleep(2000);
        sali.click();
        System.out.println(sali.isSelected());

        WebElement pazar=driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
        System.out.println(pazar.isEnabled());

        Thread.sleep(6000);
        driver.quit();

        // isDisplayed() özelliği bir önceki günün facebook sayfasındaki 2.emailde gösterildi.
    }
}

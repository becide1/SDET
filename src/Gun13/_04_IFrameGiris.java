package Gun13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _04_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://chercher.tech/practice/frames");

        //driver.switchTo().frame(0);  indexle de bulunabilir  (1)
        driver.switchTo().frame("frame1"); // id veya name le de bulunabilir  (2)
        //WebElement cerceve1=driver.findElement(By.id("frame1")); // element olarak bulunup
        //driver.switchTo().frame(cerceve1); // bu şekilde de diğer sayfaya geçilebilir. (3)

        WebElement input=driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("Türkiye");

        Thread.sleep(6000);
        driver.quit();
    }
}

package Gun12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _04_AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clickMe2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Thread.sleep(1000);
        clickMe2.click();
        Thread.sleep(1000);

        driver.switchTo().alert().dismiss(); // Cancel

        WebElement textActual=driver.findElement(By.id("confirm-demo"));
        Assert.assertEquals("You pressed Cancel!", textActual.getText());

        Thread.sleep(6000);
        driver.quit();
    }
}

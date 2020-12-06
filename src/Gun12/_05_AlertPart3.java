package Gun12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _05_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement buttonPrompt=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        WebElement textActual=driver.findElement(By.id("prompt-demo"));
        Thread.sleep(1000);
        buttonPrompt.click();

        driver.switchTo().alert().sendKeys("ismet");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        Assert.assertTrue(textActual.getText().contains("ismet"));

        Thread.sleep(6000);
        driver.quit();
    }
}

package Gun09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;


public class _03_IsDisplayed extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies(); // sitelerin bizim bilgilerimizi tutarak
        // bazen engel çıkardığı cookies leri sildik.

        //yeni hesap butonuna tıklattım
        WebElement btnYeniHesap=driver.findElement(By.cssSelector("a[id^='u_'][id$='_2']"));
        btnYeniHesap.click();
        Thread.sleep(3000);

        WebElement email=driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']"));
        WebElement tEmail=driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']"));


        System.out.println(tEmail.isDisplayed());
        email.sendKeys("ismet@hotmail.com");
        System.out.println(tEmail.isDisplayed());
        tEmail.sendKeys("ismet@hotmail.com");


        Thread.sleep(6000);
        driver.quit();
    }
}


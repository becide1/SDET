package Gun13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;
/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Çıkan alerte accept yapınız.

     wait.until(ExpectedConditions.alertIsPresent());
 */

public class _03_WaitExample extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement samsung = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsung.click();

        WebElement addToCart = driver.findElement(By.partialLinkText("Add to"));
        addToCart.click();

        WebDriverWait wait=new WebDriverWait(driver, 65);
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        Thread.sleep(6000);
        driver.quit();
    }
}
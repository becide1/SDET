package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
 /*
     Interview sorusu
        - Alertleri nasıl kullanırsın (handle edersin)

          driver.switchTo().alert()   bununla kullanılır.
          komutları:
          accept -> OK, TAMAM yani olumlu butona basmak
          dismiss -> CANCEL, HAYIR yani olumsuz butona basmak
          getText -> Alertin mesaj alınır.
          SendKeys -> Alertin inputuna mesaj göndermek için kullanılır.
 */
public class _03_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clickMe1=driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]"));
        clickMe1.click();
        Thread.sleep(2000);
         driver.switchTo().alert().accept(); // Alert kutucuğuna geçildi ve Tamam butonuna basıldı.
         // web sayfasından Alert kutucuğuna geçildi.  switchTo

        Thread.sleep(6000);
        driver.quit();
    }
}

package Gun16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _02_RobotOrnek2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

        WebDriverWait bekle=new WebDriverWait(driver, 20);

        /*    Aşağıdaki bölüm açılan reklamı kapatıyor... */
        //bekle.until(ExpectedConditions.visibilityOf()) bu kullanılamadı çünkü WebElement istiyor, halbuki zaten element yok.
        // o yüzden yukarıda locator dan yola çıktık.
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.id("flow_close_btn_iframe")));

        driver.switchTo().frame("flow_close_btn_iframe");
        WebElement kapatButonu = driver.findElement(By.id("closeBtn"));
        kapatButonu.click();
        driver.switchTo().defaultContent();
         /********/

        WebElement btnUpload=driver.findElement(By.id("file_wraper0"));
        btnUpload.click();
        Thread.sleep(2000);

        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\TechnoStudy\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.

        Robot rbt=new Robot();
        // ctrl+v ile hazfızadaki kopyalanan yazıyı yapıştırıyor.
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        Thread.sleep(2000);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);
        driver.quit();
    }
}

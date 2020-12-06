package Gun16;
/*
    Senaryo
    1- https://www.yogaalliance.org/ sitesine gidiniz.
    2- Become a Member menüsünden  Teachers  a tıklatınız.
    3- Çıkan sayfanın title ının "Teachers | Yoga Alliance"  olup olmadığını assert ile kontrol ediniz.
 */


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class _05_Ornek1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.yogaalliance.org/");

        WebElement member=driver.findElement(By.xpath("//a[text()='Become a Member']"));

        Actions builder=new Actions(driver);

        Action build=builder.moveToElement(member).build();
        build.perform();

        WebElement teacher = driver.findElement(By.xpath("(//a[text()='Teachers'])[2]"));
        teacher.click();

        String beklenen="Teachers | Yoga Alliance";


        //yeni sayfanın açılmasını burada bekliyoruz.
        WebDriverWait bekle=new WebDriverWait(driver, 15);
        bekle.until(ExpectedConditions.titleContains(beklenen));
        // yeni açılan sayfanın title ı beklenen olana kadar bekle.

        Assert.assertEquals(beklenen, driver.getTitle());

        Thread.sleep(5000);
        driver.quit();
    }
}

package Gun14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class _02_SwitchingToWindow extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.selenium.dev/");
        String anaSayfaIDsi= driver.getWindowHandle();
        System.out.println("Ana Sayfa ID="+anaSayfaIDsi);

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for(WebElement link: linkler)
        {
            link.click();
        }

        Set<String> windowIDler=driver.getWindowHandles();
        for(String ID : windowIDler)
        {
            if (ID.equals(anaSayfaIDsi)) continue;

            System.out.println(ID);

            driver.switchTo().window(ID); // diğer ID li sayfaya geçiş yaptı, şu an driver onu temsil ediyor.
            // Framlerden farklı olarak; framelerde diğer frame geçmeden önce ana sayfaya dönmek zorundaydık,
            // windowlarda buna gerek yok, direk istediğimiz windowdan istediğimize geçiş yapabiliyoruz.

            System.out.println("Window Title="+driver.getTitle());
        }

        Thread.sleep(5000);
        driver.quit();
    }
}

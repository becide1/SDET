package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;
/*
  Senaryo :
  1- https://www.ebay.com/ sitesini açın
  2- Arama seçim menüsünden 2984  değerli elemanı seçtiriniz.
  3- Arama işlemini yaptırınız.

 */
public class _04_SelectEBay extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.ebay.com/");
        driver.manage().deleteAllCookies(); // sitelerin bizim bilgilerimizi tutarak
        // bazen engel çıkardığı cookies leri sildik.

        WebElement dropDownMenu=driver.findElement(By.id("gh-cat"));
        Select menu=new Select(dropDownMenu);
        menu.selectByValue("2984");

        WebElement btnAra=driver.findElement(By.id("gh-btn"));
        btnAra.click();

        Thread.sleep(3000);
        driver.quit();
    }
}

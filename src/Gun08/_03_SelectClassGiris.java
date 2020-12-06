package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _03_SelectClassGiris   extends BaseStaticDriver {
    /*
            select  class ı
            görünen text ile seçim:  selectByVisibleText
            value si ile seçim    :  selectByValue
            indexi ile seçim      :  selectByIndex

            seçim yaptırılabilir.

            WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

            Select menu = new Select(dropDownMenu);

            menu.selectByVisibleText("Automotive");
            menu.selectByValue("search-alias=automotive-intl-ship");
            menu.selectByIndex(2);
     */

    /*
      Senaryo :
      1- https://www.amazon.com/ sitesine gidin.
      2- "Books" i seçin
      3- Arama butpnuna tıklatarak sonuçları gösterin.

     */

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.amazon.com/"); // siteyi açtım

        WebElement menuDropDown= driver.findElement(By.id("searchDropdownBox"));
        Select menu= new Select(menuDropDown);
        menu.selectByVisibleText("Books");

        WebElement ara= driver.findElement(By.id("nav-search-submit-text"));
        ara.click();

        Thread.sleep(6000);
        driver.quit();
    }
}

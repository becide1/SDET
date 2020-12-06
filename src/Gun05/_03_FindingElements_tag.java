package Gun05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class _03_FindingElements_tag extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("http://www.practiceselenium.com"); // siteyi açtım

        //WebElement e=driver.findElement()
        List<WebElement> liste=driver.findElements(By.tagName("li")); // tagname yani etiketi li olan bütün elemalar
        for(WebElement e: liste){
            System.out.println(e.getText());
        }

        Thread.sleep(3000);
        driver.quit();
    }

}

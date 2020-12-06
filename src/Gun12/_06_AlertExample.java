package Gun12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;


public class _06_AlertExample extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        WebElement text=driver.findElement(By.name("cusid"));
        text.sendKeys("123");

        WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

        String alertMesaj=driver.switchTo().alert().getText();
        System.out.println(alertMesaj);

        driver.switchTo().alert().accept(); // 1.alert için
        driver.switchTo().alert().accept(); // 2.alert için

        Thread.sleep(6000);
        driver.quit();
    }
}

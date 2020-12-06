package Gun13;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import utils.BaseStaticDriver;

        import java.sql.Driver;

public class _05_IFrameOrnek extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        driver.switchTo().frame("flow_close_btn_iframe");
        WebElement kapatButonu= driver.findElement(By.id("closeBtn"));
        kapatButonu.click();


        Thread.sleep(6000);
        driver.quit();
    }
}
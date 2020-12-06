package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

/*
   Senaryo
   1- https://www.facebook.com/ sitesine giriniz.
   2- Yeni hesap oluştura tıklayınız.
   3- Formdaki tüm bilgileri giriniz.

   İnterview larda dinamik eleman nedir ? ne nasıl bulursunuz ?
   Sayfa yenilendiğinde id ler veya locator lar değişiyorsa buna dinamik eleman denir.
   Aşağıdaki fonksiyonlar ile bulunur.

   Özet Bilgi
u_0_2
u_1_2
u_2_2
u_3_2
u_4_2
u_6_2

u_ başlıyor
_2 bitiyor

a[id^='u_'][id$='_2']

CSS de
^ -> ile başlayan
$ -> ile biten
* -> içinde geçen

Xpath
//a[starts-with(@id,'u_')] -> ile başlayan
//a[ends-with(@id,'_2')]    -> ile biten
//a[contains(@id,'u_')]    -> içinde geçen

(//a[starts-with(@id,'u_')])[3]  -> parantez içindeki locator a göre
3 tane bulundu.köşeli parantez  ile 3.alındı

firstname -> u_16_b
lastname -> u_16_d
cep-email -> u_16_g
tekrar email -> u_16_j

yeniSifre -> password_step_input

gün -> day -> select
ay -> month -> select
yıl -> year -> select

kadın -> u_16_4
erkek -> u_16_5
özel -> u_16_6

*/

public class _05_FacebookSelect extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies(); // sitelerin bizim bilgilerimizi tutarak
        // bazen engel çıkardığı cookies leri sildik.

        WebElement btnYeniHesap=driver.findElement(By.cssSelector("a[id^='u_'][id$='_2']"));
        btnYeniHesap.click();

        Thread.sleep(3000);
        WebElement txtilkAd=driver.findElement(By.cssSelector("input[id^='u_'][id$='_b']"));
        txtilkAd.sendKeys("ismet");

        WebElement txtSoyad=driver.findElement(By.cssSelector("input[id^='u_'][id$='_d']"));
        txtSoyad.sendKeys("temur");

        WebElement email=driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']"));
        email.sendKeys("ismet@hotmail.com");

        WebElement tEmail=driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']"));
        tEmail.sendKeys("ismet@hotmail.com");

        WebElement yeniSifre=driver.findElement(By.id("password_step_input"));
        yeniSifre.sendKeys("1234");

        WebElement EGun=driver.findElement(By.id("day"));
        Select gun=new Select(EGun);
        gun.selectByValue("10");

        WebElement EAy=driver.findElement(By.id("month"));
        Select ay=new Select(EAy);
        ay.selectByValue("10");

        WebElement EYil=driver.findElement(By.id("year"));
        Select yil=new Select(EYil);
        yil.selectByVisibleText("1973");

        WebElement cinsiyet=driver.findElement(By.cssSelector("input[id^='u_'][id$='_4']"));
        cinsiyet.click();

        Thread.sleep(6000);
        driver.quit();
    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class Main {
    //private static final By CLOSE_BUTTON = By.xpath("/html/body/div[1]/div[1]");
    private static final By KABUL_ET = By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]");
    private static final By GIYIM_AKSESUAR = By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/a");
    private static final By KADIN_IC_GIYIM = By.xpath("/html/body/section/section[4]/div[3]/div[3]/div/div[1]/div[1]/div[1]/ul/li[6]/a");
    private static final By DIZ_ALTI_CORAP = By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[1]/ul/li[4]/a");
    private static final By CORAP = By.cssSelector("body > section > section.page-list.js-container > div:nth-child(3) > div.content > div > div.col-md-10.col-sm-9 > div.products-list > div > ul > li:nth-child(1) > article > a > div > header > hgroup > h3");
    private static final By SEPETE_EKLE = By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button");
    private static final By SEPETI_GOSTER = By.xpath("//*[@id=\"js-modal-basket\"]/div[3]/a[3]");
    private static final By SEPETI_ONAYLA = By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/div/a");
    private static final By UYE_OLMADAN = By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a");
    private static final By MAIL = By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input");
    private static final By DEVAM_ET = By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button");
    private static final By ADRES = By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a");
    private static final By ADRES_BASLIGI = By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[2]/div/div/label/input");
    private static final By AD = By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[1]/div/label/input");
    private static final By SOYAD = By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[2]/div/label/input");
    private static final By TEL = By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[4]/div/div/label/input");
    private static final By SEHIR =By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select");
    private static final By ILCE =By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[2]/div/label/div/select");
    private static final By MAHALLE =By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select");
    private static final By ADRES_GIR = By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[7]/label/textarea");
    private static final By KAYDET = By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/button[1]");
    private static final By KAYDET_VE_DEVAM = By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button");
    private static final By KART_AD_SOYAD = By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[1]/label/input");
    private static final By KART_NUMARASI = By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[2]/label/input[1]");
    private static final By KART_SKT_A = By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[2]/select");
    private static final By KART_SKT_Y = By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[3]/select");
    private static final By KART_CVC = By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[4]/label/input");
    private static final By ONAY = By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[3]/div/label");
    private static final By FINAL_KABUL =By.xpath("//*[@id=\"js-orders-complete-button\"]/button/span[2]");
    private static final By KARGO_ONAY = By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div[2]/ul/li/label/div[2]");


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\elifc\\\\Downloads\\\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.a101.com.tr/");
        WebDriverWait w = new WebDriverWait(driver, 60);
        w.until(ExpectedConditions.presenceOfElementLocated(KABUL_ET));
        driver.findElement(KABUL_ET).click();
        //w.until(ExpectedConditions.presenceOfElementLocated((CLOSE_BUTTON)));
        //driver.findElement(CLOSE_BUTTON).click();
        driver.findElement(GIYIM_AKSESUAR).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(KADIN_IC_GIYIM).click();
        w.until(ExpectedConditions.presenceOfElementLocated((DIZ_ALTI_CORAP)));

        driver.findElement(DIZ_ALTI_CORAP).click();
        //String s = driver.findElement(CORAP).getCssValue("color");
        //w.until(ExpectedConditions.presenceOfElementLocated((CORAP)));
        sleep(1000);
        driver.findElement(CORAP).click();
        sleep(1000);
        driver.findElement(SEPETE_EKLE).click();
        sleep(1000);
        driver.findElement(SEPETI_GOSTER).click();
        sleep(1000);
        driver.findElement(SEPETI_ONAYLA).click();
        sleep(1000);
        driver.findElement(UYE_OLMADAN).click();
        sleep(1000);
        String mail = "test@test.com";
        driver.findElement(MAIL).click();
        driver.findElement(MAIL).sendKeys(mail);
        sleep(1000);
        driver.findElement(DEVAM_ET).click();
        sleep(1000);
        driver.findElement(ADRES).click();
        sleep(1000);

        String adres_basligi = "Ev adresim";
        String ad = "Elif";
        String soyad ="Cakaloglu";
        String tel = "05343443434";
        String sehir = "ANKARA";
        String ilce = "ÇANKAYA";
        String mahalle = "AKPINAR MAH";
        String adres_gir = "Zarif Sokağı No:15";
        String kart_ad_soyad = "Elif Cakaloglu";
        String kart_no = "5157557026889542";
        String kart_skt_a = "9";
        String kart_skt_y = "2027";
        String kart_cvc ="641";

        driver.findElement(ADRES_BASLIGI).sendKeys(adres_basligi);
        sleep(1000);
        driver.findElement(AD).sendKeys(ad);
        sleep(1000);
        driver.findElement(SOYAD).sendKeys(soyad);
        sleep(1000);
        driver.findElement(TEL).sendKeys(tel);
        sleep(1000);
        driver.findElement(SEHIR).sendKeys(sehir);
        sleep(1000);
        driver.findElement(ILCE).sendKeys(ilce);
        sleep(1000);
        driver.findElement(MAHALLE).sendKeys(mahalle);
        sleep(1000);
        driver.findElement(ADRES_GIR).sendKeys(adres_gir);
        sleep(1000);
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(KAYDET).click();
        sleep(1000);
        w.until(ExpectedConditions.elementToBeClickable(KARGO_ONAY)).click();
        sleep(1000);
        driver.findElement(KAYDET_VE_DEVAM).click();
        sleep(1000);
        driver.findElement(KART_AD_SOYAD).sendKeys(kart_ad_soyad);
        sleep(1000);
        driver.findElement(KART_NUMARASI).sendKeys(kart_no);
        sleep(1000);
        driver.findElement(KART_SKT_A).click(); //aaa
        driver.findElement(KART_SKT_A).sendKeys(kart_skt_a);
        sleep(1000);
        driver.findElement(KART_SKT_Y).click(); //aaa
        driver.findElement(KART_SKT_Y).sendKeys(kart_skt_y);
        sleep(1000);
        driver.findElement(KART_CVC).sendKeys(kart_cvc);
        sleep(1000);
        w.until(ExpectedConditions.elementToBeClickable(ONAY)).click();
        sleep(1000);
        driver.findElement(FINAL_KABUL).click();


        try {
            sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}



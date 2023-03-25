import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import page.N11Page;
import utilities.ConfigReader;
import utilities.Driver;

public class N11_02 {
    @Test
    public void test01() throws InterruptedException {

        String n11_URL = ConfigReader.getProperty("n11_URL");
        Driver.getDriver().get(n11_URL);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        N11Page n11Page = new N11Page();

        n11Page.login.click();
        n11Page.okButon.click();
        Thread.sleep(2000);
        n11Page.pup01.click();
        n11Page.nameInput.sendKeys("Ali");
        jsExecutor.executeScript("window.scrollBy(0,100)");
        n11Page.lastnameInput.click();
        n11Page.lastnameInput.sendKeys("Can");
        jsExecutor.executeScript("window.scrollBy(0,100)");
        n11Page.eMailInput.click();
        n11Page.eMailInput.sendKeys("alican01@gmail.com");
        jsExecutor.executeScript("window.scrollBy(0,100)");
        n11Page.passwordInput.click();
        n11Page.passwordInput.sendKeys("Deneme123:)");
        jsExecutor.executeScript("window.scrollBy(0,100)");
        n11Page.rePasswordInput.click();
        n11Page.rePasswordInput.sendKeys("Deneme123:)");
        jsExecutor.executeScript("window.scrollBy(0,100)");
        n11Page.phoneInput.click();
        n11Page.phoneInput.sendKeys("551234567");// web sayfasında 5 rakamı olduğu için telefon numarası bir rakam eksik yazıldı
        jsExecutor.executeScript("window.scrollBy(0,100)");
        n11Page.gender.click();
        jsExecutor.executeScript("window.scrollBy(0,100)");
        n11Page.box.click();
        jsExecutor.executeScript("window.scrollBy(0,100)");
        n11Page.signUp.click();


    }
}
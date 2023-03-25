
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.N11Page;
import utilities.ConfigReader;
import utilities.Driver;

public class N11_01 {
    @Test
    public void test01() throws InterruptedException {

        String n11_URL = ConfigReader.getProperty("n11_URL");
        Driver.getDriver().get(n11_URL);
        Actions actions = new Actions(Driver.getDriver());

        N11Page n11Page = new N11Page();
        n11Page.login.click();
        n11Page.okButon.click();
        Thread.sleep(2000);
        n11Page.pup01.click();

        n11Page.nameInput.sendKeys("Ali");

        actions.sendKeys(Keys.TAB).sendKeys("Can")
                .sendKeys(Keys.TAB).sendKeys(Keys.PAGE_DOWN)
                .sendKeys("alican01@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Deneme123:)")
                .sendKeys(Keys.TAB).sendKeys(Keys.PAGE_DOWN)
                .sendKeys("Deneme123:)")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("551234567")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).perform();

        n11Page.signUp.click();
    }
}
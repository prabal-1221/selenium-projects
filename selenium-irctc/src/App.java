import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

  public static void main(String[] args) throws Exception {
    System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
    ChromeOptions ops = new ChromeOptions();
    ops.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(ops);
    driver.get("https://www.irctc.co.in/nget/train-search");

    WebElement src = driver.findElement(
      By.xpath(
        "/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"
      )
    );
    src.sendKeys("TADEPALLIGUDEM - TDD");
    src.sendKeys(Keys.TAB);
    WebElement dst = driver.findElement(
      By.xpath(
        "/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"
      )
    );
    dst.sendKeys("LOKMANYATILAK");
    dst.sendKeys(Keys.TAB);

    // select date
    String date = "07/06/2023";

    driver
      .findElement(
        By.xpath("//input[contains(@class,'ng-tns-c58-10 ui-inputtext')]")
      )
      .sendKeys("0");
    driver
      .findElement(
        By.xpath("//input[contains(@class,'ng-tns-c58-10 ui-inputtext')]")
      )
      .clear();
    driver
      .findElement(
        By.xpath("//input[contains(@class,'ng-tns-c58-10 ui-inputtext')]")
      )
      .sendKeys(date);

    // date selected
    System.out.println("date added");

    // select quota
    driver
      .findElement(
        By.xpath(
          "/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[3]/div/div/p-dropdown/div/div[3]/span"
        )
      )
      .click();
    driver
      .findElement(
        By.xpath(
          "/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[3]/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li"
        )
      )
      .click();
    // quota selected

    // select class
    driver
      .findElement(
        By.xpath(
          "/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[2]/p-dropdown/div/div[3]/span"
        )
      )
      .click();
    driver
      .findElement(
        By.xpath(
          "/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li"
        )
      )
      .click();
    // class selected

    // driver.findElement(By.xpath(
    //                 "/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button"))
    //                 .click();
  }
}

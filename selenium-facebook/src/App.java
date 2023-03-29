import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://www.facebook.com");

        //this code can be used for login in facebook
        // driver.findElement(By.id("email")).sendKeys("username");
        // driver.findElement(By.id("pass")).sendKeys("password");
        // driver.findElement(By.name("login")).click();

        //this code can be used for signing up
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("prabal");

        driver.findElement(By.name("lastname")).sendKeys("maurya");

        driver.findElement(By.name("reg_email__")).sendKeys("8080775276");
        Select day = new Select(driver.findElement(By.name("birthday_day")));
        day.selectByValue("1");
        driver.findElement(By.name("reg_passwd__")).sendKeys("qwe123rty456");

        Select month = new Select(driver.findElement(By.name("birthday_month")));
        month.selectByValue("1");

        Select year = new Select(driver.findElement(By.name("birthday_year")));
        year.selectByValue("2000");

        driver.findElement(By.cssSelector("input[value='2']")).click();
        // driver.findElement(By.name("websubmit")).click();
        // driver.quit();
    }
}

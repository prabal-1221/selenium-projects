import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

  public static void main(String[] args) throws Exception {
    //setting up chrome driver
    System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
    ChromeOptions ops = new ChromeOptions();
    ops.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(ops);
    // chrome driver setup successfull

    driver.manage().window().maximize();
    //for login
    driver.get("https://www.nitandhra.ac.in/student/auth/login");
    Thread.sleep(2000);
    driver.findElement(By.id("identity")).sendKeys("username");
    driver.findElement(By.id("password")).sendKeys("password");
    driver.findElement(By.tagName("button")).click();
    //login successfull

    //for browsing results
    Thread.sleep(5000);
    driver.findElement(By.linkText("Results")).click();
    // driver.findElement(By.xpath("//button[contains(@class,'btn btn-sm')]")).click();
    
    //for logout
    Thread.sleep(5000);
    driver.findElement(By.className("caret")).click();
    Thread.sleep(2500);
    driver.findElement(By.xpath("//a[@href='https://www.nitandhra.ac.in/student/auth/logout']")).click();
    //logout successfull

    driver.close();
  }
}

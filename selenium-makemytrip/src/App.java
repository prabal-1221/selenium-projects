import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

  public static void main(String[] args) throws Exception {
    System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
    ChromeOptions ops = new ChromeOptions();
    ops.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(ops);

    driver.manage().window().maximize();
    driver.get("https://www.makemytrip.com/");
    Thread.sleep(10000);
    //bus search

    driver.findElement(By.xpath("//span[text()='Buses']")).click();

    Thread.sleep(3000);
    driver.findElement(By.id("fromCity")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")).sendKeys("Hyderabad, Telangana");

    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@class='sr_city blackText']")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input")).sendKeys("Ongole, Andhra Pradesh");

    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@class='sr_city blackText']")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[text()='1'])[2]")).click();

    Thread.sleep(2000);
    driver.findElement(By.id("search_button")).click();

    Thread.sleep(10000);
    driver.navigate().back();
    //bus search successfull

    //train search
    driver.findElement(By.xpath("//span[text()='Trains']")).click();

    Thread.sleep(2000);
    driver.findElement(By.id("fromCity")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("Tadepalligudem");

    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class='makeFlex']")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("Chennai");
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class='makeFlex']")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[text()='1'])[2]")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[@data-cy='ALL']")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@data-cy='submit']")).click();

    Thread.sleep(10000);
    driver.navigate().back();
    driver.navigate().back();
    //train search successfull

    //flight search
    driver.findElement(By.xpath("//span[@class='chNavText darkGreyText']")).click();

    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity')]")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("Bengaluru");

    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='makeFlex hrtlCenter'])[3]")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchToCity')]")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("New Delhi");

    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='makeFlex hrtlCenter'])[3]")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[7]/div[1]")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24')]")).click();
    
    Thread.sleep(10000);
    driver.close();
  }
}

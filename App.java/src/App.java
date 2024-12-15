import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver", "C:\\Users\\rusto\\OneDrive//Desktop//selenium-java-4.26.0/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.get("https://demoqa.com/elements");

        Thread.sleep(3000);

        //locate text by xpath

   

        Thread.sleep(3000);

        WebElement clickFname = driver.findElement(By.id("userName"));
        clickFname.sendKeys("Rustom Liquigan");

        Thread.sleep(3000);

        WebElement clickEmail = driver.findElement(By.id("userEmail"));
        clickEmail.sendKeys("example@gmail.com");

        Thread.sleep(3000);
       WebElement clickTextBox = driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
        clickTextBox.click();
        WebElement clickCurrentAddress = driver.findElement(By.id("currentAddress"));
        clickCurrentAddress.sendKeys("Calapan Masipit");

        Thread.sleep(3000);

        WebElement clickPermanentAdress = driver.findElement(By.id("permanentAddress"));
        clickPermanentAdress.sendKeys("Puerto Galera");

        WebElement clickSubmit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        clickSubmit.click();

        //get current url

        String currentURL = driver.getCurrentUrl();

        //close the browser
        driver.quit();

        //check if current url contains the expected value

        String expectedURL = "https://demoqa.com/text-box";
        if(currentURL.contains(expectedURL)){
            System.out.println("Test PASSED!!");
        } else {
            System.out.println("Test FAILED!!");
            
        }

    }
}
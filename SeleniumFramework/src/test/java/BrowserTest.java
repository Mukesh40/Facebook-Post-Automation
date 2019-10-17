import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserTest {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		
		//System.out.println("Project Path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath +"\\Drivers\\Chromedriver\\chromedriver.exe");
		
		//driver = new FirefoxDriver();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testdata876@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mechlin_123");
		
		driver.findElement(By.xpath("//label[@id='loginbutton']")).submit();
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		Thread.sleep(5000);
		
		WebElement textBox = driver.findElement(By.name("xhpc_message"));
		
		textBox.click();
		
		textBox.sendKeys("Hello World");
		
		Thread.sleep(5000);
		
		WebElement button = driver.findElement(By.cssSelector("button[data-testid='react-composer-post-button']"));
		
		button.click();
		
		Thread.sleep(5000);
			
	}

}

package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//			
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findEle = driver.findElement(By.xpath("//input[contains(@placeholder,'Search AJIO')]"));
		findEle.sendKeys("bags");
		findEle.sendKeys(Keys.ENTER);
		//		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.findElement(By.xpath("//ul//label[contains(text(),'Men')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@for,'Men - Fashion Bags')]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.className("length")).getText();		
		System.out.println("The number of items " +text);
		

		System.out.println(" List of Brands");
		List<WebElement> BrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + BrandList.size());

		for (WebElement webElement : BrandList) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
	}
}


package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassAssignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> findList = driver.findElements(By.tagName("a"));
		findList.get(0).click();
		System.out.println("The title of the page is " +driver.getTitle());
		driver.navigate().back();
		List<WebElement> findList1 = driver.findElements(By.tagName("a"));
		System.out.println("No. of links in the page" +findList1.size());
		String hvalue = findList1.get(2).getAttribute("href");
		System.out.println("the value is "+hvalue);
		driver.close();
		
	}

}

package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Lgwindow {
	@Test(priority=-1, timeOut=2, alwaysRun=true)
	public static void textbox() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.id("menuform:j_idt40"));
		we.click();
		driver.findElement(By.id("menuform:m_input")).click();
		driver.findElement(By.name("j_idt88:name")).sendKeys("Ragaveni");
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys(" India");
		boolean enable=driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
		System.out.println(enable);
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)"," ");
		String attval=driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(attval);
		WebElement email=driver.findElement(By.id("j_idt88:j_idt99"));
		email.sendKeys("sefsdgdgs@gmail.com");
		email.sendKeys(Keys.TAB);
		driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("Hello, Welcome to Leafground");
		js.executeScript("window.scrollBy(0,200)", " ");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("fefsdsafasdfdsfd");
		driver.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement textbox=driver.findElement(By.id("j_idt106:float-input"));
		WebElement label=driver.findElement(By.id("j_idt106:j_idt113"));
		Point oldpos=label.getLocation();
		textbox.click();
		Point newpos=label.getLocation();
		if(oldpos!=newpos) {
			System.out.println("Position Changed");
		}
		else {
			System.out.println("Position not Changed");
		}
		driver.findElement(By.xpath("//div[@class='col-12 md:col-6'][2]/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//li[@data-item-label='3']")).click();
		driver.findElement(By.id("j_idt106:j_idt116")).click();
		driver.findElement(By.xpath("//div[@id='j_idt106:j_idt116_panel']/div/div[2]/table/tbody/tr[3]/td[2]")).click();
		js.executeScript("window.scrollBy(0,600)", " "); 
		WebElement drop=driver.findElement(By.id("j_idt106:j_idt118_input"));
		drop.sendKeys("1");
		Actions builder=new Actions(driver);
		builder.moveToElement(drop).perform();
		driver.findElement(By.id("j_idt106:slider")).sendKeys("45");
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='ql-italic'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='ql-underline'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='ql-strike'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[6]")).click();
		driver.findElement(By.xpath("(//span[@class='ql-picker-options'])[6]/span[3]")).click();
		WebElement text=driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[6]"));
		Actions build=new Actions(driver);
		build.moveToElement(text).click().perform();
		driver.findElement(By.xpath("(//span[@class='ql-picker-options'])[7]/span[3]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124']/div[2]/div[1]/p")).sendKeys("dfdjslkfsjdflkdsfds");
		js.executeScript("window.scrollBy(0,-800)", " "); 

	}	
	@Test(priority=0, invocationCount=3)
	public static void lgcheckbx() {
		WebDriver webdr=new ChromeDriver();
		webdr.get("https://www.leafground.com");
		webdr.manage().window().maximize();
		WebElement webel=webdr.findElement(By.id("menuform:j_idt40"));
		webel.click();
		webdr.findElement(By.id("menuform:m_checkbox")).click();
		webdr.findElement(By.id("j_idt87:j_idt89")).click();
		webdr.findElement(By.id("j_idt87:j_idt91")).click();
		webdr.findElement(By.xpath("//*[@for='j_idt87:basic:0']")).click(); 
		webdr.findElement(By.xpath("//label[@for='j_idt87:basic:1']")).click();
		webdr.findElement(By.xpath("//label[@for='j_idt87:basic:3']")).click();
		webdr.findElement(By.xpath("//div[@id=\'j_idt87:ajaxTriState\']")).click();
		webdr.findElement(By.xpath("//div[@id=\'j_idt87:ajaxTriState\']")).click();
		webdr.findElement(By.xpath("//div[@id=\'j_idt87:ajaxTriState\']")).click();
		webdr.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		boolean enable=webdr.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isSelected();
		System.out.println(enable);
		webdr.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
		WebElement sele=webdr.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div/ul/li[7]/label"));
		sele.click();
	}
	@Test(priority=1, enabled=false)
	public static void lgradiobt() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("menuform:j_idt40")).click();
		driver.findElement(By.id("menuform:m_radio")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:2']")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:city2:2']")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:console2:1']")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:age:2']")).click();

	}

}

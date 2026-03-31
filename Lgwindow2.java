package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lgwindow2 {
	@Test(priority=1, groups="Smoke")
	public static void dragdrop() {
		WebDriver webdr=new ChromeDriver();
		webdr.get("https://www.leafground.com");
		webdr.manage().window().maximize();
		webdr.findElement(By.id("menuform:j_idt39")).click();
		webdr.findElement(By.id("menuform:m_drag")).click();
		WebElement src=webdr.findElement(By.id("form:drag_content"));//form obj
		WebElement tar=webdr.findElement(By.id("form:drop_content"));//to obj
		Actions builder=new Actions(webdr);
		builder.dragAndDrop(src, tar).perform();
		WebElement src1=webdr.findElement(By.id("form:conpnl"));
		Actions builder1=new Actions(webdr);
		builder1.dragAndDropBy(src1, 300, 0).perform();
	}
	@Test(priority=2, groups="Sanity")
	public static void lgalert() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("menuform:j_idt39")).click();
		driver.findElement(By.id("menuform:m_overlay")).click();
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(500);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		driver.findElement(By.id("j_idt88:j_idt98")).click();
		driver.findElement(By.id("j_idt88:j_idt100")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Thread.sleep(500);
		driver.switchTo().alert().sendKeys("Welcome");
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("j_idt88:j_idt106")).click();
		Thread.sleep(500);
		//driver.findElement(By.id("j_idt88:j_idt108")).click(); //yes
		driver.findElement(By.id("j_idt88:j_idt109")).click(); //no
		driver.findElement(By.id("j_idt88:j_idt111")).click();
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']/div[1]/a[2]")).click(); //max
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click(); //-
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-plus']")).click(); //+
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']/div[1]/a[1]")).click(); //close
		
	}
	@Test(priority=-1, groups="Smoke")
	public static void iframe() {
		WebDriver  driver = new ChromeDriver(); 
		driver.get("https://www.leafground.com/"); 
		driver.manage().window().maximize();
		driver.findElement(By.id("menuform:j_idt39")).click();
		driver.findElement(By.id("menuform:m_frame")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		List<WebElement> frames =driver.findElements(By.tagName("iframe"));
		int count=frames.size(); 
		System.out.println(count);
		driver.switchTo().frame(2); 
		driver.switchTo().frame("frame2"); 
		driver.findElement(By.id("Click")).click();
	}

}

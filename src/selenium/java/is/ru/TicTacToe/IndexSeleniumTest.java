package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.net.URL;

public class IndexSeleniumTest{

	static WebDriver driver;
	static String baseUrl;
	static String port;
	
	@BeforeClass
		public static void before() {
			driver = new ChromeDriver();
			baseUrl = "https://littlebobbytablestttstaging.herokuapp.com/";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

	@AfterClass
		public static void after() {
			driver.close();
		}

	@Test
		public void testTitle(){
			driver = new ChromeDriver();
			driver.get(baseUrl);
			assertEquals("Tic Tac Toe", driver.getTitle());
			driver.close();
		}

	@Test
		public void testOneClick(){
			driver = new FirefoxDriver(capabilities);
			WebDriverWait webWait = new WebDriverWait(driver,20);
			driver.get(baseUrl);
			driver.findElement(By.id("1")).click();
			webWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("1")),"X"));
			assertEquals("X", driver.findElement(By.id("1")).getText());
			driver.close();
		}

	/*@Test
		public void testTwoClicks(){
			driver = new FirefoxDriver();
			WebDriverWait webWait = new WebDriverWait(driver,20);
			driver.get(baseUrl);
			driver.findElement(By.id("1")).click();
			webWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("1")),"X"));
			driver.findElement(By.id("2")).click();        
			webWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("2")),"O"));
			assertEquals("O", driver.findElement(By.id("2")).getText());
			driver.close();
		}

	@Test
		public void testFirstAsWinner(){
			driver = new FirefoxDriver();
			WebDriverWait webWait = new WebDriverWait(driver,20);
			driver.get(baseUrl);
			driver.findElement(By.id("1")).click();
			webWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("1")),"X"));
			driver.findElement(By.id("3")).click();        
			webWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("3")),"O"));
			driver.findElement(By.id("2")).click();        
			webWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("2")),"X"));
			driver.findElement(By.id("5")).click();        
			webWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("5")),"O"));
			driver.findElement(By.id("3")).click();        
			webWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("3")),"X"));
			webWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("whosTurn")),"X is the winner!"));
			assertEquals("X is the winner!", driver.findElement(By.id("whosTurn")).getText());
			driver.close();
		}*/
}

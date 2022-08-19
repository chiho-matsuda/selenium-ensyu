package selenim;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.channel.MessageSizeEstimator.Handle;

class ex03Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		try {
			System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
			WebDriver driver = new ChromeDriver(); //ChromeDriverの作成
			driver.get("https://www.e-procurement.metro.tokyo.lg.jp/"); 
			Thread.sleep(500); //処理を停止(動作確認の為)
			driver.findElement(By.cssSelector(".msg_style")).click();
			//driver.navigate();
			Thread.sleep(500);
			//ブラウザの要素を指定 メソッド名がわかりやすいですよね。
			//WebElement searchBox = driver.findElement(By.name("q"));
			driver.switchTo().window(driver.getWindowHandle());
			driver.get("https://www.e-procurement.metro.tokyo.lg.jp/SrvPublish");
			Thread.sleep(500);
			//driver.get("https://www.e-procurement.metro.tokyo.lg.jp/SrvPublish");
			Thread.sleep(500);
			//driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

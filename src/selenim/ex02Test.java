package selenim;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ex02Test {

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
			driver.get("http://www.google.com/xhtml"); 
			
			Thread.sleep(500); //処理を停止(動作確認の為)
			//ブラウザの要素を指定 メソッド名がわかりやすいですよね。
			WebElement searchBox = driver.findElement(By.name("q"));
			driver.get("https://rakuplus.jp/");
			driver.findElement(By.id("user_login")).sendKeys("chiho.matsuda@rakus-partners.co.jp");
			driver.findElement(By.id("user_pass")).sendKeys("chiho.matsuda@rakus-partners.co.jp");
			driver.findElement(By.id("wp-submit")).click();
			Thread.sleep(500);
			driver.get("https://rakuplus.jp/archives/category/member");
			
			Thread.sleep(5000);
			driver.get("https://rakuplus.jp/archives/10226");
			Thread.sleep(5000);
			List<WebElement> elemList = driver.findElements(By.cssSelector("section.entry-content > div"));
			int count = 0;
			for (WebElement div: elemList) {
				if(count > 0) {
					WebElement imgElem = div.findElement(By.tagName("img"));
					System.out.println(imgElem.getAttribute("outerHTML"));
					WebElement nameElem = div.findElement(By.cssSelector(".big"));
					System.out.println(nameElem.getText());
					WebElement nameElem2 = div.findElement(By.cssSelector("p.has-text-align-center.has-text-color"));
					System.out.println(nameElem2.getText());
				} 
				count++;
			}
			
			
			Thread.sleep(5000);
			driver.quit(); //ブラウザを閉じる。
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

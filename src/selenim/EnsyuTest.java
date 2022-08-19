package selenim;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class EnsyuTest {

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
			//driver.get(“http://www.google.com/xhtml”); //get()でブラウザ起動
			driver.get("http://www.google.com/xhtml");
			Thread.sleep(500); //処理を停止(動作確認の為)
			//ブラウザの要素を指定 メソッド名がわかりやすいですよね。
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("selenium");
			searchBox.submit();
			driver.get("https://www.selenium.dev/ja/documentation/");
			System.out.println(driver.getTitle());
			Thread.sleep(500);
			driver.quit(); //ブラウザを閉じる。
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

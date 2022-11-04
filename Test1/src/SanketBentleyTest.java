import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanketBentleyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Working On Selenium");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\Desktop\\Selenium\\ChromeBinary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.unipune.ac.in/");
		driver.manage().window().maximize();
		String actualPageTitle = "Savitribai Phule Pune University, One of the Premier Universities in India - Official Website.";
		String expectPageTitle = driver.getTitle();
		System.out.println("" + expectPageTitle);
		if (actualPageTitle.contentEquals(expectPageTitle)) {
			System.out.println("Home page title validated successfully!!");
		} else {
			System.out.println("Kindly relaunch");
		}

		driver.close();
		System.out.println("Testing Done");
	}

}

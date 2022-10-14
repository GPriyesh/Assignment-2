package Week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      
      ChromeDriver driver= new ChromeDriver();
      driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwi_rPnz7d_6AhWt2DgGHZQlDoIQPAgI");

	}

}


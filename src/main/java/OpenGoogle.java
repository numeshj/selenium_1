import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");

            driver.manage().window().maximize();

            // wait for 5 seconds to see the opened page
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            driver.quit();
        }

}

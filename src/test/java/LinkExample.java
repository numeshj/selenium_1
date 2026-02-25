import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class LinkExample {

    WebDriver driver;

    @BeforeMethod
    public  void openTestLink () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml");
    }

    @Test
    public  void LinkTest() {
        // 01) Take me to the Dashboard
        WebElement homeLink =  driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        driver.navigate().back();

        // 02) Find my destination.
        WebElement whereToGo = driver.findElement(By.partialLinkText("Find the"));
        String path = whereToGo .getAttribute("href");
        System.out.println("The destination URL is: " + path);

        // 03) Am I a broken link?
        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();

        String title = driver.getTitle();
        if (title.contains("404")) {
            System.out.println("The link is broken.");
        } else {
            System.out.println("The link is not broken.");
        }
        driver.navigate().back();

        // 04 Duplicate Link
        WebElement homeLink2 =  driver.findElement(By.linkText("Go to Dashboard"));
        homeLink2.click();

        // 05) How many links are available in this page?
        List<WebElement> linkCount = driver.findElements(By.tagName("a"));
        int pageLinkCount = linkCount.size();
         System.out.println(("Count of Links in full page is : " + pageLinkCount));

         // 06) Count layout links
        WebElement layOutElement = driver.findElement(By.className("layout-main-content"));
        List<WebElement> countofLayoutLink =   layOutElement.findElements(By.tagName("a"));
        System.out.println(" Count of layout Link is : " + countofLayoutLink.size());

         driver.quit();

    }

}

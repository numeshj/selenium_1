import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {

    WebDriver driver;

    @BeforeMethod
    public  void openTesBoxPage () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");
    }


    @Test
    public void textBoxTest() {
        // 01. Type the name
        WebElement typeName = driver.findElement(By.id("j_idt88:name"));
        typeName.sendKeys("Numesh Jayamanne");

        // 02. Append Country to the City
        WebElement appendCountry =  driver.findElement(By.id("j_idt88:j_idt91"));
        appendCountry.sendKeys(" Sri Lanka");

        // 03. Verify if text box is disabled
        WebElement isDissabled = driver.findElement(By.id("j_idt88:j_idt93"));
        if (isDissabled.isEnabled()) {
            System.out.println("The text box is disabled.");
        } else {
            System.out.println("The text box is enabled.");
        }

        // 04. Clear the typed text.
        WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
        clearText.clear();

        // 05. Retrieve the typed text.
        WebElement retrieveText = driver.findElement(By.id("j_idt88:j_idt97"));
        String text = retrieveText.getAttribute("value");
        System.out.println("The typed text is: " + text);

        // 06. Type email and Tab. Confirm control moved to next element.
        WebElement typeEmail = driver.findElement(By.id("j_idt88:j_idt99"));
        typeEmail.sendKeys("numeshjayamanne@gmail.com" + Keys.TAB + "Confirmed control moved to next element.");

        // 07. Type about yourself



        // This is done in the above test.

        // 08. Text Editor
        




        // 09. Just Press Enter and confirm error message*


        // 10. Type your name and choose the third option

        // 11. Type your DOB (mm/dd/yyyy) and confirm date chosen.

        // 12. Type number and spin to confirm value changed.

        // 13. Type random number (1-100) and confirm slider moves correctly.

        // 14. Click and Confirm Label Position Changes

        // 15. Type your name and choose the third option.

        // 16. Type your DOB (mm/dd/yyyy) and confirm date chosen.

        // 17. Type number and spin to confirm value changed.

        //  18. Type random number (1-100) and confirm slider moves correctly.

         // 19. Click and Confirm Keyboard appears

        // 20. Custom Toolbar


    }







}

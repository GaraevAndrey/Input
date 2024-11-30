import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;


import static org.testng.Assert.assertEquals;


public class InputRobot {
    @Test
    public static void inputNam() throws AWTException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");
        WebDriver browser = new EdgeDriver(options);
        Robot rbt = new Robot();
        browser.get("https://the-internet.herokuapp.com/inputs");
        browser.findElement(By.xpath("//input[@type='number']")).sendKeys("45");
        rbt.keyPress(KeyEvent.VK_UP);
        rbt.keyRelease(KeyEvent.VK_UP);
        assertEquals(browser.findElement(By.xpath("//input[@type='number']")).getAttribute("value"), "46");
    }
}

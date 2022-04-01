package Test;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Wait {
    public static void W(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}

package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Search {

    public static <Waiting> void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ImmanuelKP\\Downloads\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

            driver.manage().window().maximize();
            driver.get(ObjRepo.lnkGoogle);
            driver =Wait.W(driver);

            driver.findElement(By.xpath(ObjRepo.btnGoogleSearch)).sendKeys(ObjRepo.txtInputWebdriverIo);
            driver =Wait.W(driver);
            driver.findElement(By.name("btnK")).click();
            driver =Wait.W(driver);

            /*int size = driver.findElements(By.cssSelector("//*[@id='result-stats']/text()")).size();
            System.out.println(size);*/

            // To get the count of search results
            String heading = driver.findElement(By.xpath(ObjRepo.txtSearchResultCount)).getText();
            System.out.println("The total search result of WebdriverIO is "+heading);

            driver.findElement(By.id("rso")).findElements(By.xpath(" //a//h3")).get(0).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            driver =Wait.W(driver);


            js.executeScript("window.scrollBy(0,100)");
            driver.findElement(By.xpath("(//h3)[11]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();

            driver.findElement(By.xpath("(//h3)[12]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            driver =Wait.W(driver);

            driver.findElement(By.xpath("(//h3)[13]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            driver =Wait.W(driver);

            driver.findElement(By.xpath("(//h3)[14]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            driver =Wait.W(driver);

            driver.findElement(By.xpath("(//h3)[15]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            driver =Wait.W(driver);

            driver.findElement(By.xpath("(//h3)[16]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            driver =Wait.W(driver);

            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            driver.findElement(By.xpath("(//h3)[17]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            driver =Wait.W(driver);

            /*WebElement t=driver.findElement(By.className("v7W49e"));
            //identify child nodes with ./child::* expression in xpath
            List<WebElement> c = t.findElements(By.xpath("./child::*"));
            System.out.print(c);
            // iterate child nodes
            for ( WebElement i : c ) {
                //getText() to get text for child nodes
                System.out.println(i.getText());
            }*/
            driver.quit();
        }
        catch ( Exception e)
        {
            System.out.println(e);
        }
    }
}

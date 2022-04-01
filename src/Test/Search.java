package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", ObjRepo.lnkChromeDriverPath);
            WebDriver driver = new ChromeDriver();
            JavascriptExecutor js = (JavascriptExecutor) driver;

            driver.manage().window().maximize();
            driver.get(ObjRepo.lnkGoogle);
            Wait.W(driver);

            driver.findElement(By.xpath(ObjRepo.btnGoogleSearch)).sendKeys(ObjRepo.txtInputWebdriverIo);
            Wait.W(driver);
            driver.findElement(By.name("btnK")).click();
            Wait.W(driver);

            /*int size = driver.findElements(By.cssSelector("//*[@id='result-stats']/text()")).size();
            System.out.println(size);*/

            // To get the count of search results
            String heading = driver.findElement(By.xpath(ObjRepo.txtSearchResultCount)).getText();
            System.out.println("The total search result of WebdriverIO is "+heading);

            driver.findElement(By.id("rso")).findElements(By.xpath(" //a//h3")).get(0).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            Wait.W(driver);

            js.executeScript("window.scrollBy(0,100)");
            driver.findElement(By.xpath("(//h3)[11]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();

            driver.findElement(By.xpath("(//h3)[12]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            Wait.W(driver);

            driver.findElement(By.xpath("(//h3)[13]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            Wait.W(driver);

            driver.findElement(By.xpath("(//h3)[14]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            Wait.W(driver);

            driver.findElement(By.xpath("(//h3)[15]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            Wait.W(driver);

            driver.findElement(By.xpath("(//h3)[16]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            Wait.W(driver);

            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            driver.findElement(By.xpath("(//h3)[17]")).click();
            System.out.println("Page title is : " + driver.getTitle());
            driver.navigate().back();
            Wait.W(driver);

            driver.quit();
        }
        catch ( Exception e)
        {
            System.out.println(e);
        }
    }
}

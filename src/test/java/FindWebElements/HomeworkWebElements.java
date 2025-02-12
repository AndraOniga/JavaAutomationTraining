package FindWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;


public class HomeworkWebElements {

    public WebDriver driver;

    @Test
    public void letCode(){
        driver = new ChromeDriver();
        driver.get("https://letcode.in/forms");
        driver.manage().window().maximize();

        WebElement countryDropDown = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::div[@class='control']/div[@class='select']/select"));
        countryDropDown.click();
        Select select = new Select(countryDropDown);
        select.selectByVisibleText("Romania");
        countryDropDown.click();

    }

    @Test
    public void airBnbTest(){
        driver = new ChromeDriver();
        driver.get("https://www.airbnb.ie/");
        driver.manage().window().maximize();

        WebElement menuButton = driver.findElement(By.xpath("//button[@data-testid='cypress-headernav-profile']"));
        menuButton.click();


        WebElement dropdown = driver.findElement(By.xpath("dropdown-id"));
        WebElement option = driver.findElement(By.xpath("//li[text()='Option 1']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).pause(1).moveToElement(option).click().perform();


//        String expectedUrl = "https://www.airbnb.ie/giftcards";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Test
    public void barnesAndNobles(){
        driver = new ChromeDriver();
        driver.get("https://www.barnesandnoble.com");
        driver.manage().window().maximize();
        clickOnMenu("Nonfiction", "Humor", "Comedy & Humor Books");
    }

    public void clickOnMenu2(String menuOption, String subMenuOption){
        WebElement menuElement = driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/div/ul/li[a[contains(text(), '"+menuOption+"')]]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuElement).perform();
        WebElement subMenuElement = driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/div/ul/li[a[contains(text(), '"+menuOption+"')]]//div//dd[a[contains(text(),  '"+subMenuOption+"')]]"));
        subMenuElement.click();
    }

    public void clickOnMenu(String menuOption, String subMenuOption, String expectedPageTitle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions actions = new Actions(driver);

        // Locate the main menu and hover over it
        WebElement menuElement = driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/div/ul/li[a[contains(text(), '" + menuOption + "')]]"));
        actions.moveToElement(menuElement).perform();
        WebElement subMenuElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@id='navbarSupportedContent']/div/ul/li[a[contains(text(), '" + menuOption + "')]]//div//dd//a[contains(text(), '" + subMenuOption + "')]")));
        subMenuElement.click();
        WebElement pageTitle =driver.findElement(By.xpath("//div[@id='main-content']//h1"));
        Assert.assertEquals(pageTitle.getText(), expectedPageTitle);
    }


}

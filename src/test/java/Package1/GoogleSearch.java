package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("L2AGLb")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("gLFyf")).sendKeys("Automation Advantage");
        Thread.sleep(2000);
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
////        driver.findElement(By.name("q")).sendKeys("Automation Advantages");
////        driver.findElement(By.id("APjFqb")).sendKeys("Selenium Advantages for automation");
//        driver.findElement(By.id("APjFqb")).sendKeys("IT Talent Hub");
//        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
//        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
////        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
//        Thread.sleep(3000);
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());


//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();

//        driver.findElement(By.id("btnK")).click();
//        driver.findElement(By.xpath("//input[@class='gNO89b'][@name='btnK']")).click();
//        driver.findElement(By.id("nav-search-submit-button")).click();

//        driver.findElement(By.xpath("//input[@class='gNO89b'][@name='btnK']")).click();

//        WebDriver driver1 = new FirefoxDriver();
//        WebDriver driver = new SafariDriver();



//        driver.get("https://www.amazon.co.uk/");
//        driver.manage().window().maximize();
//        Thread.sleep(8000);
//
//        if (driver.findElement(By.id("L2AGLb")).isDisplayed()){
//            driver.findElement(By.id("L2AGLb")).click();
//        }
//        else
//        {
//            System.out.println("Accept All option is not displayed");
//        }

//
//        driver.findElement(By.name("field-keywords")).sendKeys("Selenium");
//        driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);
//        driver.findElement(By.id("APjFqb")).sendKeys("Java");
//        Thread.sleep(2000);
//      driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
//        driver.findElement(By.name("btnK")).click();
//        driver.findElement(By.xpath("//input[@class='gNO89b'][@name='btnK']")).click();
////        driver.findElement(By.id("nav-search-submit-button")).click();
//        Thread.sleep(5000);
//
//        driver.navigate().back();
//        Thread.sleep(5000);
//        driver.navigate().forward();
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        System.out.println(driver.getCurrentUrl());;
//        System.out.println(driver.getTitle());



        //        WebElement search = driver.findElement(By.name("q"));
////        driver.findElement(By.className("QS5gu sy4vM")).click();
//        driver.findElement(By.id("L2AGLb")).click();
//
////
////        Thread.sleep(2000);
//         Actions act = new Actions(driver);
//		act.keyDown(search, Keys.SHIFT).sendKeys("Testing")
//		.keyUp(search, Keys.SHIFT).build().perform();
//
//        act.keyDown(search, Keys.ENTER).click()
//                .keyUp(search, Keys.ENTER).build().perform();
//
////        act.keyDown(search, Keys.SHIFT).sendKeys("Testing")
////                .keyUp(search, Keys.SHIFT).keyDown(search, Keys.CONTROL).sendKeys("a")
////                .keyUp(search, Keys.CONTROL).build().perform();



    }
}

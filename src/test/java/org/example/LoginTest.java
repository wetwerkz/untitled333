package org.example;
import org.junit.AfterClass;import org.junit.Assert;
import org.junit.BeforeClass;import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class LoginTest {
    public static LoginPage loginPage;
    public static WebDriver driver;
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver",
                ConfProperties.getProperties("chromedriver"));
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        driver.get(ConfProperties.getProperties("loginpage"));
    }
    @Test    public void loginTest(){
        loginPage.inputLogin(ConfProperties.getProperties("login"));        loginPage.inputPassword(ConfProperties.getProperties("password"));
        loginPage.clickSignIn();        Assert.assertEquals("Test", "Test");
    }
    @AfterClass    public static void tearDown(){
        driver.quit();    }
}
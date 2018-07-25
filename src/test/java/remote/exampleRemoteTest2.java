package remote;

import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class exampleRemoteTest2 {
    private TrueAutomationDriver driver;
    private By loginBtn = By.cssSelector(ta("loginBtn", "a.login-btn"));
    private By signupBtn = By.cssSelector(ta("signupBt", "div.sign-up-container > a"));
    private By emailFl = By.name(ta("emailF", "email"));


    @BeforeTest
    public void beforeTest(){
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setBrowserName("firefox");
        cap.setPlatform(Platform.ANY);
        cap.setCapability("taRemoteUrl", "http://localhost:4444/wd/hub");
        driver = new TrueAutomationDriver(cap);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() {

        driver.get("https://trueautomation.io");
        driver.findElement(loginBtn).click();
        driver.findElement(signupBtn).click();
        driver.findElement(emailFl).sendKeys("your@mail.com");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
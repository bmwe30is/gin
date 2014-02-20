import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: jchan
 * Date: 2/20/14
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(JUnit4.class)
public class boilerPlateTest {

    public WebDriver driver;
    public String seleniumHub = System.getProperty("seleniumHub");
    public int timeoutInSeconds = Integer.parseInt(System.getProperty("timeOutInSeconds"));

    @Test
    public void TestExample() throws Exception{

        DesiredCapabilities capability = new DesiredCapabilities().chrome();

        driver = new RemoteWebDriver(new URL(seleniumHub), capability);
        driver.manage().timeouts().implicitlyWait(timeoutInSeconds, TimeUnit.SECONDS);

        driver.get("http://www.google.com");

        Thread.sleep(5000);
        driver.quit();

    }
}

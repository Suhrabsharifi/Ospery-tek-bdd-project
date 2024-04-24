package tek.bdd.base;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {
    private  static ChromeDriver driver;
    public void OpenBrowser(){
        //Implement opening chrome browser
        //and navigate to retail app
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));

    }
    public ChromeDriver getDriver(){
        return driver;
    }
}

package com.tryCloud.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Driver {
    /*
Creating a private constructor, so we are closing
access to the object of this class from outside the class
*/
    private Driver() {
    }

    /*
    We make WebDriver private, because we want to close access from outside the class.
    We make it static because we will use it in a static method.
    */
    //  private static WebDriver driver;
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
          /*
            We read our browserType from configuration.properties.
            This way, we can control which browser is opened from outside our code, from configuration.properties.
             */
            String browserType = ConfigurationReader.getProperty("browser");


            /*
                Depending on the browserType that will be return from configuration.properties file
                switch statement will determine the case, and open the matching browser
            */
            switch (browserType) {
                case "chrome":

                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("disable-notifications");
                    HashMap<String,Integer> contentSetting=new HashMap<String,Integer>();
                    HashMap<String,Object> profile=new HashMap<String, Object>();
                    HashMap<String,Object> prefs=new HashMap<String, Object>();
                    contentSetting.put("media_stream",1);
                    profile.put("managed_default_content_settings",contentSetting);
                    prefs.put("profile",profile);
                    options.setExperimentalOption("prefs",prefs);

                    WebDriverManager.chromedriver().setup();

                    driverPool.set(new ChromeDriver(options));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }

        }
        return driverPool.get();
    }

    /*
   This method will make sure our driver value is always null after using quit() method
    */
    public static void closeDriver() {

        if (driverPool.get() != null) {
           driverPool.get().quit(); // this line will terminate the existing session. value will not even be null
           driverPool.remove();
        }


    }




}

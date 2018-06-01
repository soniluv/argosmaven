package com.demonstration.bdd.drivers;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class DriversFactory {

    private String browser="";
    public static WebDriver driver;

    public void openBrowser(){

        switch (browser){
            case "chrome":
            {
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            }
            case "ie":
            {
             driver= new InternetExplorerDriver();
             break;
            }
            case "opera":
            {
                driver= new OperaDriver();
                break;
            }
            default:
            {
                driver= new FirefoxDriver();
                break;
            }
        }
    }
    public void navigate(String url){
        driver.get(url);
    }
    public void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public void implWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void closeBroswer(){
        driver.close();
        driver.quit();
    }
    public void sleepBrowser(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void embedScreenshot(Scenario scenario) {
        try {
            byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenShot, "image/png");
        } catch (WebDriverException e) {
            System.out.println("took screen shot. ");
        }

    }


}

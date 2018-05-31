package com.demonstration.bdd.drivers;

import org.openqa.selenium.WebDriver;
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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

}

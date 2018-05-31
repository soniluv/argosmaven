package com.demonstration.bdd.page_objects;

import com.demonstration.bdd.drivers.DriversFactory;
import org.openqa.selenium.By;

public class HeaderPage extends DriversFactory {

    public void doSearch(String product){
        driver.findElement(By.id("searchTerm")).sendKeys(product);
        driver.findElement(By.cssSelector(".argos-header__search-button")).click();
        sleepBrowser(3000);
    }
}

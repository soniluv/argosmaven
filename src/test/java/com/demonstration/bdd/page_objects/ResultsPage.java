package com.demonstration.bdd.page_objects;

import com.demonstration.bdd.drivers.DriversFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriversFactory {
    public void selectFilter(String filterValue){
        List<WebElement> allFilters= driver.findElements(By.cssSelector(".ac-facet__label"));
        for(WebElement filter : allFilters){
           if(filter.getText().equalsIgnoreCase(filterValue)){
               filter.click();
               break;
           }
        }
        sleepBrowser(5000);
    }
    public List<Double> getAllReviewRatings(){
        List<Double> collectedRatings= new ArrayList<>();
       List<WebElement> ratings= driver.findElements(By.cssSelector(".ac-star-rating"));
       for(WebElement rating : ratings){
           String ratingInString= rating.getAttribute("data-star-rating");
           Double ratingInDouble= Double.parseDouble(ratingInString);
           collectedRatings.add(ratingInDouble);
       }
       return collectedRatings;
    }
}

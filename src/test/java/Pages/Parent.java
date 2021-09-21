package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Parent {

    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element)
    {
       waitUntilVisible(element);
       waitUntilClickable(element);
       scrollToElement(element);
       element.click();
    }

    public static void waitUntilVisible(WebElement element){
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilInvisibility(WebElement element){
        WebDriverWait wait =new WebDriverWait(BaseDriver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollToUpElement(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'top:0px')", element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element){
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void delay(int second)
    {
        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyContainsText(WebElement element, String msg)
    {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(msg.toLowerCase()));
    }

    public void waitnumberOfElementsToBeLessThan(By selector, int number)
    {
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),20);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(selector,number));
    }

    public void waitnumberOfElementsmoreThan(By selector, int number)
    {
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),20);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(selector,number));
    }


    public void listSelectOption(List<WebElement> list, String option)
    {

        for(WebElement e: list)
        {
            if (e.getText().contains(option)) {
                e.click();
                break;
            }
        }
    }

    public void ESCClick()
    {
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ESCAPE);
            r.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void moveSliderAction(WebElement surgu, int number1, int number2)
    {
        Actions aksiyonlar=new Actions(BaseDriver.getDriver());
        Action aksiyon=aksiyonlar.moveToElement(surgu).dragAndDropBy(surgu,number1,number2).build();aksiyon.perform();
    }



    public void moveElementAction(WebElement element)
    {
        Actions aksiyonlar=new Actions(BaseDriver.getDriver());
        Action aksiyon=aksiyonlar.moveToElement(element).build(); aksiyon.perform();
    }

    public void waitStalenessofElement(WebElement element)
    {
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),20);
        wait.until(ExpectedConditions.stalenessOf(element));
    }
    public void waitUrlContains(String text)
    {
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),20);
        wait.until(ExpectedConditions.urlContains(text));
    }
}

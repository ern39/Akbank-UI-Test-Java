package pageModels;

import driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BaseModel extends Driver {

    Actions actions;

    public  BaseModel() {
        PageFactory.initElements(webDriver, this);
        actions = new Actions(webDriver);
    }

    public void scrollInToView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void setText(WebElement element, String text) {
        element.sendKeys(text);
        element.sendKeys(Keys.TAB);
    }

    public void clear(WebElement element) {
        element.clear();
    }
}

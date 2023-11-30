package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Hooks;

public class AnimationPage extends Hooks{

    public AnimationPage(){
        PageFactory.initElements(androidDriver,this);
    }

    // findElementAccessibilityId(String id)
    // methodunu android driver uzerinden findElementAccessibilityId locator larini
    // okumak icin olusturduk

    public WebElement getAnimationButton(){
        return androidDriver.findElementByAccessibilityId("Animation");
    }

    public void clickElement(WebElement element){
        element.click();
    }




}
package day01;

import org.testng.annotations.Test;
import page.ContentPage;
import utils.Hooks;

public class C03_ContentPageTest extends Hooks {

    // Content >> Resources >> Styled Text
    ContentPage contentPage = new ContentPage();

    @Test
    public void isStyledTextButtonVisible(){
        contentPage.clickElement(contentPage.getContentButton());
        contentPage.clickElement(contentPage.getResourcesButton());
        contentPage.isDisplayedElement(contentPage.getStyledTextButton());
    }



}

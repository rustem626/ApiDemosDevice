package day01;

import org.testng.annotations.Test;
import page.AnimationPage;
import utils.Hooks;

public class C02_AnimationPageTest extends Hooks {

    AnimationPage animationPage ;

    @Test
    public void test01(){

        animationPage.clickElement(animationPage.getAnimationButton());

    }

}
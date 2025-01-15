package pageObjects;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class AAATestElement {

    By FullHeader = By.cssSelector("section.row.region.region-top-header");
    By GamesAndCompButton = By.cssSelector("#block-logosheadermenu > ul > li:nth-child(1) > a");
    By DiffahButton = By.cssSelector("#block-logosheadermenu > ul > li:nth-child(2) > a");
    By NewArabButton = By.cssSelector("#block-logosheadermenu > ul > li:nth-child(3) > a");
    By PrintedArchiveButton = By.cssSelector("#block-logosheadermenu > ul > li:nth-child(4) > a");
    By HomeButton = By.cssSelector("a[rel=home] > img.img-fluid.d-inline-block.align-top") ;
    By LocationButton = By.cssSelector("div.middle-menu > div > div > div.left.col.d-flex.align-items-center.justify-content-end.header-serch > section > div > div > div > div > a > p") ;
    By SearchField = By.cssSelector("div.middle-menu > div > div > div.left.col.d-flex.align-items-center.justify-content-end.header-serch > section >#block-exposedformsearch-2content-search-page > div > form > div>fieldset:nth-child(1) > input") ;
    By ViewAllButton = By.cssSelector("section > i[data-related=\"block-mega-main-menu\" ") ;
    By CloseAllButton = By.cssSelector("i.fa.fa-bars.show-related.current.is-open ");
    By Investigations = By.cssSelector("section > div > div > ul > li:nth-child(4)");
    private static int MegaMenuColumnIndex = 5;
    private static int MegaMenuRowIndex = 2 ;
    private static By MegaMenuColumn = By.cssSelector("nav.block.block-menu.navigation.menu--main.is-open > ul > li:nth-child("+MegaMenuColumnIndex+")");
    private static By MegaMenuCell = By.cssSelector("nav.block.block-menu.navigation.menu--main.is-open > ul > li:nth-child("+MegaMenuColumnIndex+") > ul > li:nth-child("+MegaMenuRowIndex+")");
    private static By BreakingNewsLink = By.cssSelector("#break-news > div > div > div > div.title");
    private static By BreakingNewsShareButton = By.cssSelector("#break-news > div > div > div > div.share");

    private SHAFT.GUI.WebDriver driver;
   // private int MaxColumnLength = new HomePage(driver).GetMaxColumnLength();

    @BeforeMethod
    public void OpenHomePage(){
        driver = new SHAFT.GUI.WebDriver();
        new HomePage(driver).OpenHomePage();

    }


    @Test
    public void testElement(){

        new HomePage(driver).ClickOnViewAllMenuButton().CheckMegaMenuItems();



    }



}

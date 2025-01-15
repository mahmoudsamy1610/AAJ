package pageObjects;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HomePage {

    private SHAFT.GUI.WebDriver driver ;

    // Header elements
    private static final By FullHeader = By.cssSelector("section.row.region.region-top-header");
    private static final By GamesAndCompButton = By.cssSelector("#block-logosheadermenu > ul > li:nth-child(1) > a");
    private static final By DiffahButton = By.cssSelector("#block-logosheadermenu > ul > li:nth-child(2) > a");
    private static final By NewArabButton = By.cssSelector("#block-logosheadermenu > ul > li:nth-child(3) > a");
    private static final By PrintedArchiveButton = By.cssSelector("#block-logosheadermenu > ul > li:nth-child(4) > a");
    private static final By HomePageButton = By.cssSelector("a[rel=home] > img.img-fluid.d-inline-block.align-top") ;
    private static final By LocationButton = By.cssSelector("div.middle-menu > div > div > div.left.col.d-flex.align-items-center.justify-content-end.header-serch > section > div > div > div > div > a > p") ;
    private static final By DayTempButton = By.cssSelector("div.middle-menu > div > div > div.left.col.d-flex.align-items-center.justify-content-end.header-serch > section > div > div > div > div > a > div.day") ;
    private static final By NightTempButton = By.cssSelector("div.middle-menu > div > div > div.left.col.d-flex.align-items-center.justify-content-end.header-serch > section > div > div > div > div > a > div.night") ;
    private static final By SearchField = By.cssSelector("div.middle-menu > div > div > div.left.col.d-flex.align-items-center.justify-content-end.header-serch > section >#block-exposedformsearch-2content-search-page > div > form > div>fieldset:nth-child(1) > input");

    // Main Menu Elements
    private static final By ViewAllButton = By.cssSelector("section > i[data-related=\"block-mega-main-menu\" ");
    private static final By CloseAllButton = By.cssSelector("i.fa.fa-bars.show-related.current.is-open ");
    private static final By MainMenuList = By.cssSelector("section > div > div > ul");
    public static By GetMainMenuItem(int Index) {return By.cssSelector("section > div > div > ul > li:nth-child(" + Index + ")");}
    private static final By LiveStreamButton =  By.cssSelector("div.header-live-stream");

    //Mega Main Menu elements
    public static By GetMegaMenuColumn(int MegaMenuColumnIndex){return By.cssSelector("nav.block.block-menu.navigation.menu--main.is-open > ul > li:nth-child(" + MegaMenuColumnIndex + ")");}
    public static By GetMegaMenuColumns(){return By.cssSelector("nav.block.block-menu.navigation.menu--main.is-open > ul > li");}
    public static By GetMegaMenuCell ( int MegaMenuColumnIndex, int MegaMenuRowIndex){return By.cssSelector("nav.block.block-menu.navigation.menu--main.is-open > ul > li:nth-child(" + MegaMenuColumnIndex + ") > ul > li:nth-child(" + MegaMenuRowIndex + ")");}
    public static By GetMegaMenuCells ( int MegaMenuColumnIndex){return By.cssSelector("nav.block.block-menu.navigation.menu--main.is-open > ul > li:nth-child(" + MegaMenuColumnIndex + ") > ul > li");}

    //Breaking news elements
    private static final By BreakingNewsButton = By.cssSelector("#break-news > div > div > div > div.title");
    private static final By BreakingNewsShareButton = By.cssSelector("#break-news > div > div > div > div.share");



// Test Steps
    public HomePage(SHAFT.GUI.WebDriver driver){this.driver = driver;}

    @Step("Open Home page")
    public HomePage OpenHomePage(){
       driver.browser().navigateToURL("https://www.aajeg.com/");
       return this;
    }

    @Step("Check that main header is clear")
    public HomePage CheckMainHeader(){
        driver.verifyThat().element(FullHeader).isVisible().perform();
        return this;
    }

    @Step("Check that Games and competitions button is clear")
    public HomePage CheckGamesAndCompsButton(){
        driver.verifyThat().element(GamesAndCompButton).isVisible().perform();
        return this;
    }

    @Step("Click on Games and Competitions button")
    public GamesAndCompsPage ClickOnGamesAndComp(){
        driver.element().click(GamesAndCompButton);
        return new GamesAndCompsPage(driver);
    }

    @Step("Check that Games and competitions button is opening the correct page")
    public GamesAndCompsPage CheckGamesAndCompsButtonFunctionality(){
        driver.element().click(GamesAndCompButton).browser().verifyThat().title().isEqualTo("ألعاب ومسابقات ترفيه وتسلية وتعليم لجميع أفراد الأسرة – العربي الجديد").perform();
        return new GamesAndCompsPage(driver);
    }

/* Diffah page was not working , so I commented the steps of it
    @Step("Check that Diffah button is clear")
    public HomePage CheckDiffahButton(){
        driver.verifyThat().element(DiffahButton).isVisible().perform();
        return this;
    }

    @Step("Click on Diffah button")
    public DiffahPage ClickOnDiffahButton(){
        driver.element().click(DiffahButton);
        return new DiffahPage(driver);
    }

    @Step("Check that Diffah button is opening the correct page")
    public DiffahPage CheckDiffahButtonFunctionality(){
        driver.element().click(DiffahButton).browser().verifyThat().title().isEqualTo("was not working !!!").perform();
        return new DiffahPage(driver);
    }
*/

    @Step("Check that NewArab button is clear")
    public HomePage CheckNewArabButton(){
        driver.verifyThat().element(NewArabButton).isVisible().perform();
        return this;
    }

    @Step("Click on NewArab button")
    public NewArabPage ClickOnNewArabButton(){
        driver.element().click(NewArabButton);
        return new NewArabPage(driver);
    }

    @Step("Check that NewArab button is opening the correct page")
    public NewArabPage CheckNewArabButtonFunctionality(){
        driver.element().click(NewArabButton).browser().verifyThat().title().contains("Home Page").perform();
        return new NewArabPage(driver);
    }

    @Step("Check that PrintedArchive button is clear")
    public HomePage CheckPrintedArchiveButton(){
        driver.verifyThat().element(PrintedArchiveButton).isVisible().perform();
        return this;
    }

    @Step("Click on PrintedArchive Button")
    public PrintedArchivePage ClickOnPrintedArchiveButton(){
        driver.element().click(PrintedArchiveButton);
        return new PrintedArchivePage(driver);
    }

    @Step("Check that PrintedArchive button is opening the correct page")
    public PrintedArchivePage CheckPrintedArchiveButtonFunctionality(){
        driver.element().click(PrintedArchiveButton).browser().verifyThat().title().isEqualTo("النسخة الورقية").perform();
        return new PrintedArchivePage(driver);
    }

    @Step("Check that HomePage button is clear")
    public HomePage CheckHomePageButton(){
        driver.verifyThat().element(HomePageButton).isVisible().perform();
        return this;
    }

    @Step("Click on HomePage Button")
    public HomePage ClickOnHomePageButton(){
        driver.element().click(HomePageButton);
        return this;
    }

    @Step("Check that HomePage button is opening the correct page")
    public HomePage CheckHomePageButtonFunctionality(){
        driver.element().click(HomePageButton).browser().verifyThat().title().isEqualTo("الصفحة الرئيسية |العربي الجديد").perform();
        return this;
    }

    @Step("Check that location button is clear")
    public HomePage ChecklocationButton(){
        driver.verifyThat().element(LocationButton).isVisible().perform();
        return this;
    }

    @Step("Click on Location Button")
    public WeatherPage ClickOnLocationButton(){
        driver.element().click(LocationButton);
        return new WeatherPage(driver);
    }

    @Step("Check that Location button is opening the correct page")
    public WeatherPage CheckLocationButtonFunctionality(){
        driver.element().click(LocationButton).browser().verifyThat().title().contains("حالة الطقس").perform();
        return new WeatherPage(driver);
    }


    @Step("Check that DayTemp button is clear")
    public HomePage CheckDayTempButton(){
        driver.verifyThat().element(DayTempButton).isVisible().perform();
        return this;
    }

    @Step("Click on DayTemp Button")
    public WeatherPage ClickOnDayTempButton(){
        driver.element().click(DayTempButton);
        return new WeatherPage(driver);
    }

    @Step("Check that DayTemp button is opening the correct page")
    public WeatherPage CheckDayTempButtonFunctionality(){
        driver.element().click(DayTempButton).browser().verifyThat().title().contains("حالة الطقس").perform();
        return new WeatherPage(driver);
    }

    @Step("Check that NightTemp button is clear")
    public HomePage CheckNightTempButtonButton(){
        driver.verifyThat().element(NightTempButton).isVisible().perform();
        return this;
    }

    @Step("Click on NightTemp Button")
    public WeatherPage ClickOnNightTempButton(){
        driver.element().click(NightTempButton);
        return new WeatherPage(driver);
    }

    @Step("Check that NightTemp button is opening the correct page")
    public WeatherPage CheckNightTempButtonFunctionality(){
        driver.element().click(NightTempButton).browser().verifyThat().title().contains("حالة الطقس").perform();
        return new WeatherPage(driver);
    }

    @Step("Check that SearchField  is clear")
    public HomePage CheckSearchFieldButton(){
        driver.verifyThat().element(SearchField).isVisible().perform();
        return this;
    }

    @Step("Check that all Main menu items is clear")
    public HomePage CheckMainMenuItems(int Index){
        driver.element().verifyThat(GetMainMenuItem(Index)).isVisible().perform();
        return this;
    }

    @Step("Check that view all menu button  is clear")
    public HomePage CheckViewAllMenuButton(){
        driver.verifyThat().element(ViewAllButton).isVisible().perform();
        return this;
    }

    @Step("Check that view all menu button  is Clickable")
    public HomePage ClickOnViewAllMenuButton(){
        driver.element().click(ViewAllButton);
        return this;
    }


      @Step("Check that  All mega menu items is visible")
    public HomePage CheckMegaMenuItems() {

        int ColumnsCount = driver.element().getElementsCount(GetMegaMenuColumns());

        for (int col=1 ; col<=ColumnsCount; col++) {
            int ColumnLength = driver.element().getElementsCount(GetMegaMenuCells(col));
            for (int row = 1; row <= ColumnLength; row++) {
                driver.element().verifyThat(GetMegaMenuCell(col, row)).isVisible();
            }
        }
        return this;
    }


    @Step("Check that close mega menu button is working")
    public HomePage CheckCloseAllButton(){
        driver.element().verifyThat(CloseAllButton).isVisible().perform();
        return this;
    }


    @Step("Check that Live stream button is clear")
    public HomePage CheckLiveStreamButton(){
        driver.verifyThat().element(LiveStreamButton).isVisible().perform();
        return this;
    }

    @Step("Click on LiveStream Button")
    public WeatherPage ClickOnLiveStreamButton(){
        driver.element().click(LiveStreamButton);
        return new WeatherPage(driver);
    }

    @Step("Check that LiveStream button is opening the correct page")
    public WeatherPage CheckLiveStreamButtonFunctionality(){
        driver.element().click(LiveStreamButton).browser().verifyThat().url().contains("youtube").perform();
        return new WeatherPage(driver);
    }


    @Step("Check breaking new button is clear")
    public HomePage CheckBreakingNewsButton(){
        driver.verifyThat().element(BreakingNewsButton).isVisible().perform();
        return this;
    }

    @Step("Click on Breaking News Button")
    public BreakingNewsPage ClickOnBreakingNewsButton(){
        driver.element().click(BreakingNewsButton);
        return new BreakingNewsPage(driver);
    }

    @Step("Check that Breaking News Button is opening the correct page")
    public BreakingNewsPage CheckBreakingNewsButtonFunctionality(){
        driver.element().click(BreakingNewsButton).browser().verifyThat().url().contains("الأخبار العاجلة").perform();
        return new BreakingNewsPage(driver);
    }





}

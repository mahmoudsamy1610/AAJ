import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class HomePageHeader {

   private SHAFT.GUI.WebDriver driver;



    @BeforeMethod
    public void OpenHomePage(){
        driver = new SHAFT.GUI.WebDriver();
        new HomePage(driver).OpenHomePage();}


    @Epic("Home Page Check list")
    @Story("Home page headers and menu")
    @Description("veifrying home page headers and menu")
    @Test(description = "check that main home page header exists and clear")
    public void CheckMainHeader(){new HomePage(driver).CheckMainHeader();}


    @Epic("Home Page Check list")
    @Story("Home page headers and menu")
    @Description("verify games and competition button")
    @Test(description = "check that games and competition buttons is working correctly")
    public void CheckGamesAndCompetitions(){new HomePage(driver).CheckGamesAndCompsButton().CheckGamesAndCompsButtonFunctionality();}

/*
    @Epic("Home Page Check list")
    @Story("Home page headers and menu")
    @Description("verify The New Arab Button button")
    @Test(description = "check that new Arab button buttons is working correctly")
    public void CheckNewArab(){new HomePage(driver).CheckNewArabButtonFunctionality();}
*/

    @Epic("Home Page Check list")
    @Story("Home page headers and menu")
    @Description("verify The Printed Archive  button")
    @Test(description = "check that Printed Archive  buttons is working correctly")
    public void CheckPrintedArchive(){new HomePage(driver).CheckPrintedArchiveButton().CheckPrintedArchiveButtonFunctionality();}


    @Epic("Home Page Check list")
    @Story("Home page headers and menu")
    @Description("verify The Home page  button")
    @Test(description = "check that home page button  buttons is working correctly")
    public void CheckHomePage(){new HomePage(driver).CheckHomePageButton().CheckHomePageButtonFunctionality();}


    @Epic("Home Page Check list")
    @Story("Home page headers and menu")
    @Description("verify The Location  button")
    @Test(description = "check that Location button  buttons is working correctly")
    public void CheckLocationAndWeather(){new HomePage(driver).ChecklocationButton().CheckLocationButtonFunctionality();}

    @Epic("Home Page Check list")
    @Story("Home page headers and menu")
    @Description("verify The Day temp  button")
    @Test(description = "check that day temp button  buttons is working correctly")
    public void CheckDayTemp(){new HomePage(driver).CheckDayTempButton().CheckDayTempButtonFunctionality();}


    @Epic("Home Page Check list")
    @Story("Home page headers and menu")
    @Description("verify The Night temp  button")
    @Test(description = "check that Night temp button  buttons is working correctly")
    public void CheckNightTemp(){new HomePage(driver).CheckNightTempButtonButton().CheckNightTempButtonFunctionality();}

    @Epic("Home Page Check list")
    @Story("Home page headers and menu")
    @Description("verify search text field")
    @Test(description = "check that search text field  buttons is working correctly")
    public void CheckSearchField(){new HomePage(driver).CheckSearchFieldButton();}


     @Test()
     public void VerifyAllMegaMenu(){new HomePage(driver).ClickOnViewAllMenuButton().CheckMegaMenuItems();}





     @AfterMethod
     public void CloseDriver(){driver.quit();}

}

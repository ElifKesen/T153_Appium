package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KiwiPage {
    public KiwiPage(){
        PageFactory.initElements((WebDriver)Driver.getAndroidDriver(),this);
    }
    @FindBy(xpath = "(//*[@class='android.widget.Button'])[4]")
    public WebElement ContinueAsButton;

    @FindBy(xpath = "//*[@text='Return']")
    public WebElement returnButton;

    @FindBy(xpath = "//*[@text='One way']")
    public WebElement OneWayButton;

    @FindBy(xpath = "//*[@text='From:']")
    public WebElement FromButton;

    @FindBy(xpath = "//*[@content-desc='Clear All']")
    public WebElement ClearButton;

    @FindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement KalkisVarisYeriYazmaKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.Button'])[2]")
    public WebElement sehirSecmeButonu;

    @FindBy(xpath = "//*[@text='Choose']")
    public WebElement ChooseButonu;

    @FindBy(xpath = "//*[@text='To:']")
    public WebElement ToButonu;

    @FindBy(xpath = "//*[@text='Departure:']")
    public WebElement DepartureButonu;

    @FindBy(xpath="//*[@text='Set date']")
    public WebElement setDatebutonu;


}

package Pages;

import Utilities.BaseDriver;
import io.github.bonigarcia.wdm.managers.SeleniumServerStandaloneManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    public WebElement dashboard;

    @FindBy(xpath = "//ms-add-button//button[contains(@class,'mat-button')]")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'error')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//div[contains(text(),'deleted')]")
    private WebElement cannotDeletedMsg;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//mat-form-field//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "(//mat-form-field//input)[2] ")
    private WebElement searchCodeInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(css = "div>mat-option>span")
    private List<WebElement> userTypeAllOptions;

    @FindBy(xpath = "//mat-chip-list[@formcontrolname='roles']//input")
    private WebElement userType;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rightScroll;

    @FindBy(xpath = "//input[@id='ms-integer-field-0']")
    private WebElement priorityInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement integrationCode;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//ms-edit-button//button[contains(@class,'mat-focus-indicator')]")
    private WebElement editBtn;

    @FindBy(css = "div>mat-option")
    private List<WebElement> countryAllOptions;

    @FindBy(xpath = "//mat-select[contains(@aria-labelledby,'mat-form-field')]")
    private WebElement countrySelect;

    @FindBy(xpath = "(//mat-select[contains(@aria-labelledby,'mat-form-field')])[2]")
    private WebElement countrySelectDialog;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement cityName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']//input")
    private WebElement editName;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement salConstName;

    @FindBy(xpath = "//input[@data-placeholder='Valid From']")
    private WebElement validFrom;

    @FindBy(xpath = "(//ms-custom-header//div//button)[5]")
    private WebElement nextYear;

    @FindBy(xpath = "(//tbody//td[@role='gridcell'])[1]")
    private WebElement firstJuly;

    @FindBy(xpath = "//ms-text-field[@name='key']//input")
    private WebElement keyInput;

    @FindBy(xpath = "//input[@inputmode='numeric']")
    private WebElement vaLue;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement salConsName;

    @FindBy(xpath = "//button[contains(@class,'mat-accent')]")
    private WebElement salsearchBtn;

    @FindBy(xpath = "//ms-delete-button//button")
    private List<WebElement> delButtons;

    @FindBy(xpath = "/ms-edit-button//button[contains(@class,'mat-focus-indicator')]")
    private List<WebElement> editButtons;

    WebElement myElement;
    List<WebElement> myElements;


    public void findAndSend(String elementName,String value)
    {
          switch (elementName) {
              case "username":myElement = username; break;
              case "password":myElement = password;break;
              case "nameInput": myElement = nameInput; break;
              case "codeInput":myElement = codeInput;break;
              case "shortName": myElement = shortName; break;
              case "searchInput":myElement = searchInput; break;
              case "priorityCode": myElement = priorityCode; break;
              case "integrationCode":myElement = integrationCode; break;
              case "cityName":myElement = cityName; break;
              case "editName":myElement = editName; break;
              case "salConstName":myElement = salConstName; break;
              case "keyInput":myElement = keyInput; break;
              case "vaLue":myElement = vaLue; break;
              case "salConsName":myElement = salConsName; break;
          }

          sendKeysFunction(myElement, value);
    }

    public void findAndClick(String elementName)
    {
        switch (elementName) {
            case "loginButton": myElement = loginButton; break;
            case "addButton": myElement = addButton; break;
            case "saveButton":myElement = saveButton; break;
            case "closeDialog":myElement = closeDialog; break;
            case "searchButton":myElement = searchButton;break;
            case "deleteButton":myElement = deleteButton;break;
            case "deleteDialogBtn":myElement = deleteDialogBtn;break;
            case "rightScroll":myElement = rightScroll; break;
            case "acceptCookies":myElement= acceptCookies;break;
            case "editBtn":myElement= editBtn; break;
            case "countrySelect":myElement= countrySelect; break;
            case "countrySelectDialog":myElement= countrySelectDialog; break;
            case "validFrom":myElement= validFrom; break;
            case "nextYear":myElement= nextYear; break;
            case "firstJuly":myElement= firstJuly; break;
            case "salsearchBtn":myElement= salsearchBtn; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String elementName, String msg)
    {
        switch (elementName) {
            case "successMessage":myElement = successMessage;break;
            case "errorMessage":myElement = errorMessage;break;
            case "alreadyExist":myElement = alreadyExist;break;
            case "cannotDeletedMsg":myElement = cannotDeletedMsg;break;

        }

        verifyContainsText(myElement, msg);
    }
    public void invisibilityOfElement(String elementName)
    {
        switch (elementName) {
            case "successMessage": myElement = successMessage; break;

        }
        waitUntilInvisibility(myElement);
    }
    public void listElementsSituation(String listName,By selector)
    {
        switch (listName) {
            case "delButtons":myElements = delButtons; break;
            case "editButtons":myElements = editButtons; break;
        }
        if (myElements.size()>1)
            waitnumberOfElementsToBeLessThan(selector,2);

    }

    public void findAndDelete(String deleteString)
    {
       scrollToUpElement(rightScroll);
       findAndSend("searchInput", deleteString);
       findAndClick("searchButton");
       listElementsSituation("delButtons",By.xpath("//ms-delete-button//button"));
       findAndClick("deleteButton");
       findAndClick("deleteDialogBtn");
    }

    List<WebElement> myList;
    public void ChooseListElement(String listName, String option)
    {
        switch (listName) {
            case "userTypeAllOptions":myList = userTypeAllOptions; break;
            case "countryAllOptions":myList = countryAllOptions; break;
        }
        listSelectOption(myList, option);
    }

    public void findAndEdit(String oldWord, String newWord)
    {
        scrollToUpElement(rightScroll);
        findAndSend("searchInput", oldWord);
        findAndClick("searchButton");
        listElementsSituation("editButtons",By.xpath("//ms-edit-button//button[contains(@class,'mat-focus-indicator')]"));
        findAndClick("editBtn");
        findAndSend("editName", newWord);
        findAndClick("saveButton");
    }

}

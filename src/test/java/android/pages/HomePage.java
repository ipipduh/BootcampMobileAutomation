package android.pages;

import com.pnt.bootcampmobile.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountsButtonHP;

    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement productButtonHP;


    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc='Checking Accounts']")
    private WebElement buttonForChecking;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Show Menu']")
    private WebElement homePageMenuButton;

    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    private WebElement homePageTransferButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement homePageProductsBtn;

    @FindBy(xpath = "//android.widget.Button[@text='PAY A BILL']")
    private WebElement payABillButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Contact us']")
    private WebElement contactUsLink;

    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    private WebElement homePageDepositButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Locations']")
    private WebElement locationButton;

    @FindBy(xpath = "//android.widget.Button[@text='Allow only while using the app']")
    private WebElement permissionClick;

    @FindBy(xpath = "//android.widget.EditText[@text='Enter zip or city/state']")
    private WebElement zipcodeButton;


    public void userCanClickOnAccountButton(){
        accountsButtonHP.click();
        ExtentTestManager.log("User clicks account button");
    }

    public void userCanClickOnCheckingAcctButton() {
        buttonForChecking.click();
        ExtentTestManager.log("User clicks checking account button");
    }

    public void userCanClickOnTheMenu() {
        homePageMenuButton.click();
        ExtentTestManager.log("Menu button is clicked");
    }

    public void userCanClickOnTransferButton() {
        homePageTransferButton.click();
        ExtentTestManager.log("Transfer button is clicked");
    }

    public void userCanClickOnProductsLink() {
        homePageProductsBtn.click();
        ExtentTestManager.log("User clicks on Products link");
    }

    public void userCanClickPayABill() {
        payABillButton.click();
        ExtentTestManager.log("Pay A Bill button is clicked");
    }

    public void userAbleToClickContactUs() {
        contactUsLink.click();
        ExtentTestManager.log("Contact Us button is clicked");
    }

    public void userAbleToClickOnDepositButton() {
        homePageDepositButton.click();
        ExtentTestManager.log("Deposit button is clicked");
    }

    public void userAbleToEnterZipcode() {
        locationButton.click();
        ExtentTestManager.log("Locations button is clicked");
        permissionClick.click();
        ExtentTestManager.log("Clicked to provide permission for use");
        zipcodeButton.sendKeys("02476", Keys.RETURN);
        ExtentTestManager.log("Zipcode is entered");
    }


}

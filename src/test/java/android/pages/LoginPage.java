package android.pages;

import com.pnt.bootcampmobile.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountsButton;

    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    private WebElement usernameField;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//android.widget.Button[@text='Log in']")
    private WebElement loginButton;



    public void userUnableToLoginWithInvalidCredentials() {
        accountsButton.click();
        ExtentTestManager.log("Account button is clicked");
        usernameField.sendKeys("chanelandlerbong@gmail.com");
        ExtentTestManager.log("Invalid username is entered");
        passwordField.sendKeys("Nobodyknowsthatweknowthattheyknow");
        ExtentTestManager.log("Invalid password entered");
        loginButton.click();
        ExtentTestManager.log("Login button is clicked");
    }
}

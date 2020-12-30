package android.tests;

import android.pages.HomePage;
import android.pages.LoginPage;
import com.pnt.bootcampmobile.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegressionTesting extends TestBase {

    private HomePage homePage;
    private LoginPage loginPage;

    @BeforeMethod
    public void pageFactorySetup() {

        homePage = PageFactory.initElements(getDriver(), HomePage.class);
        loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    }

    @Test(enabled = false)
    public void validateUserCanClickOnAccountsButton() {
        homePage.userCanClickOnAccountButton();
    }

    @Test(enabled = false)
    public void validateUserCanClickOnCheckingAcctButton() {
        homePage.userCanClickOnCheckingAcctButton();
    }

    @Test(enabled = false)
    public void validateUserCanClickOnTheMenu() {
        homePage.userCanClickOnTheMenu();
    }

    @Test(enabled = false)
    public void validateUserCanClickOnTransferButton() {
        homePage.userCanClickOnTransferButton();
    }

    @Test(enabled = false)
    public void validateUserCanClickOnProductsLink() {
        homePage.userCanClickOnProductsLink();
    }

    @Test(enabled = false)
    public void validateUserCanClickPayABill() {
        homePage.userCanClickPayABill();
    }

    @Test(enabled = false)
    public void validateUserCanClickContactUs() {
        homePage.userAbleToClickContactUs();
    }

    @Test(enabled = false)
    public void validateUserCanClickOnDepositButton() {
        homePage.userAbleToClickOnDepositButton();
    }

    @Test(enabled = false)
    public void validateUserAbleToEnterZipcode() {
        homePage.userAbleToEnterZipcode();
    }

    @Test(enabled = false)
    public void validateUserUnableToLoginWithInvalidCredentials() {
        loginPage.userUnableToLoginWithInvalidCredentials();
    }



}

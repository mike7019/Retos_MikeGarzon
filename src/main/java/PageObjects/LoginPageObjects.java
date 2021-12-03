package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;



@DefaultUrl("https://demoqa.com/automation-practice-form")
public class LoginPageObjects extends PageObject {


    By llbFirstName = By.cssSelector("#firstName");
    By txtLastName = By.cssSelector("#lastName");
    By txtEmail = By.cssSelector("#userEmail");
    By rdoButtons = By.cssSelector("label[for='gender-radio-1']");
    By txtMobile = By.cssSelector("#userNumber");
    By txtDate = By.cssSelector("#dateOfBirthInput");
    By lstDay = By.cssSelector("div[aria-label='Choose Wednesday, December 1st, 2021']");
    By chkHobbies = By.className("custom-control-label");
    By btnSel_Pic = By.cssSelector("#uploadPicture");
    By txtCurrentAdd = By.cssSelector("#currentAddress");
    By lstState = By.xpath("//*[@class=' css-1wa3eu0-placeholder' and contains(.,'Select State')]");
    By lstCity = By.cssSelector("div[class=' css-1pahdxg-control'] div[class=' css-1hwfws3']");
    By lblThanks = By.cssSelector("#example-modal-sizes-title-lg");


    public By getLlbFirstName() {
        return llbFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getRdoButtons() {
        return rdoButtons;
    }

    public By getTxtMobile() {
        return txtMobile;
    }

    public By getTxtDate() {
        return txtDate;
    }

    public By getLstDay() {
        return lstDay;
    }

    public By getChkHobbies() {
        return chkHobbies;
    }

    public By getBtnSel_Pic() {
        return btnSel_Pic;
    }

    public By getTxtCurrentAdd() {
        return txtCurrentAdd;
    }

    public By getLstState() {
        return lstState;
    }

    public By getLstCity() {
        return lstCity;
    }

    public By getLblThanks() {
        return lblThanks;
    }
}

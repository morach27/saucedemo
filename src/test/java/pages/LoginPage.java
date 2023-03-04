package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@id='user-name']")
    WebElement loginField;

    @FindBy(xpath = "//*[@id='password']")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id='login-button']")
    WebElement button;

    public void fillLoginField(String text) {
        loginField.clear();
        loginField.sendKeys(text);
    }

    public void fillPasswordField(String text) {
        passwordField.clear();
        passwordField.sendKeys(text);
    }

    public void clickButton() {
        button.click();
    }
}

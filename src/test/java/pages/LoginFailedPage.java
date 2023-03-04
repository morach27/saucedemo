package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

public class LoginFailedPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    WebElement divRed;

    @FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")
    WebElement productsPage;

    public void assertThatUserDivAbsent() {
        try {
            productsPage.isEnabled();
            fail();
        } catch (Exception e) {}

    }

    public void assertThatErrorDivPresent() {
        assertThat(divRed.isDisplayed()).isTrue();
    }
}


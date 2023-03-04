package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSuccessPage extends BasePage {

    @FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")
    WebElement productsPage;

    public void assertThatUserDivPresent() {
        assertThat(productsPage.isDisplayed()).isTrue();
    }
}

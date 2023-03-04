package steps;

import pages.LoginSuccessPage;

public class LoginSuccessSteps {

    LoginSuccessPage page = new LoginSuccessPage();

    public void verifyThatOk() {
        page.assertThatUserDivPresent();
    }
}
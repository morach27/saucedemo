package steps;

import pages.LoginFailedPage;
import pages.LoginSuccessPage;

public class LoginFailedSteps {

    LoginFailedPage page = new LoginFailedPage();

    public void verifyThatFailedPageVisible() {
        page.assertThatUserDivAbsent();
        page.assertThatErrorDivPresent();

    }


}


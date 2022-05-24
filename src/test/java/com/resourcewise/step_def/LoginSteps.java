package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.LoginPage;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class LoginSteps extends DriverManager {
    LoginPage loginPage = new LoginPage();
    DriverManager driverManager = new DriverManager();

    @Then("^I should see \"([^\"]*)\" text on login page$")
    public void i_should_see_text_on_login_page(String expectedMessage) throws Throwable {
    String myActualWelcomeMessage = loginPage.getWelcomeMessageOnLoginPage();
    assertThat(myActualWelcomeMessage,is(equalToIgnoringCase(expectedMessage)));
    }

    @Then("^the url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String expectedUrl) throws Throwable {

         String actualUrl = driverManager.getUrl();
        assertThat(actualUrl, containsString(expectedUrl));

    }

}

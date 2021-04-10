package githubAssignment.tests;

import githubAssignment.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import utilities.Driver;

public class LoginPageTest {

    LoginPage loginPage = new LoginPage();
    @Test
    public void logInSuccess(){

        //Login Success
        //
        //Page Object Model for the login page should be provided.
        //Test is able to login successfully.
        //Test uses an assertion to make sure User has logged in.

        Driver.getDriver().get("http://localhost:7080/login");
        loginPage.usernameBox.sendKeys("tomsmith");
        loginPage.passwordBox.sendKeys("SuperSecretPassword!");
        loginPage.loginButton.click();

        System.out.println(loginPage.message.getText());

        Assert.assertTrue(loginPage.message.getText().contains("You logged into a secure area!"));


    }

    @Test
    public void loginFailure(){
        //Login Failure
        //
        //Page Object Model for the login page should be used.
        //Test is not able to login with wrong credentials.
        //Test uses assertions to check Login failed for incorrect user and password.

        Driver.getDriver().get("http://localhost:7080/login");
        loginPage.usernameBox.sendKeys("tomsmit");
        loginPage.passwordBox.sendKeys("SuperSecretssword!");
        loginPage.loginButton.click();

        System.out.println(loginPage.message.getText());

        Assert.assertTrue(loginPage.message.getText().contains("Your username is invalid!"));

    }


}

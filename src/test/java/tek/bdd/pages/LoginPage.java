package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtilities;

public class LoginPage extends SeleniumUtilities {

    public static final By EMAIL_INPUT = By.name("email");
    public static final By PASSWORD_INPUT= By.name("password");
    public static final By LOGIN_BUTOON= By.id("loginBtn");
    public static final By ACOUNT_Link=By.linkText("ACCOUNT");
    public static final By ERROR_MESSAGE=By.cssSelector("div.error");

}


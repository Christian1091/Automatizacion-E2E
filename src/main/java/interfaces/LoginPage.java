package interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TXT_USERNAME = Target.the("campo usuario")
            .located(By.id("user-name"));

    public static final Target TXT_PASSWORD = Target.the("campo password")
            .located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("botón login")
            .located(By.id("login-button"));

}

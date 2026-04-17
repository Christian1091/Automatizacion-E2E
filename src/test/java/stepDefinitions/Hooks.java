package stepDefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Hooks {
    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }
}

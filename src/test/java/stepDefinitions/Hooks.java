package stepDefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Hooks {

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }
}

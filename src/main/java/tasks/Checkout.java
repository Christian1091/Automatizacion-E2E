package tasks;

import interfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Checkout implements Task {

    private String firstName;
    private String lastName;
    private String codePostal;

    public Checkout(String firstName, String lastName, String codePostal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.codePostal = codePostal;
    }

    public static Checkout complete(String firstName, String lastName, String codePostal){
        return Tasks.instrumented(Checkout.class, firstName, lastName, codePostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(CheckoutPage.TXT_FIRST_NAME),
                Enter.theValue(lastName).into(CheckoutPage.TXT_LAST_NAME),
                Enter.theValue(codePostal).into(CheckoutPage.TXT_POSTAL_CODE),
                Click.on(CheckoutPage.BTN_CONTINUE),
                Click.on(CheckoutPage.BTN_FINISH)
        );

    }
}

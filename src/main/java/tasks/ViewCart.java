package tasks;

import interfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ViewCart implements Task {

    public static ViewCart viewCart(){
        return Tasks.instrumented(ViewCart.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.BTN_VIEW_CART),

                WaitUntil.the(CheckoutPage.BTN_CHECKOUT, isVisible())
                                .forNoMoreThan(15).seconds(),

                Click.on(CheckoutPage.BTN_CHECKOUT)
        );

    }
}

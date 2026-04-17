package tasks;

import interfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ViewCart implements Task {

    public static ViewCart viewCart(){
        return Tasks.instrumented(ViewCart.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.BTN_VIEW_CART),
                Click.on(CheckoutPage.BTN_CHECKOUT)
        );

    }
}

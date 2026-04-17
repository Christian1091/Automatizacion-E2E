package tasks;

import interfaces.AddProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProducts implements Task {

    public static AddProducts toCart(){
        return Tasks.instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddProductPage.BTN_LABS_BIKE),
                Click.on(AddProductPage.BTN_LABS_PACK)
        );
    }
}

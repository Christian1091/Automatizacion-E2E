
package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderConfirmation implements Question<String> {

    private static final Target COMPLETE_HEADER =
            Target.the("mensaje de confirmación")
                    .located(By.className("complete-header"));

    public static OrderConfirmation text() {
        return new OrderConfirmation();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(COMPLETE_HEADER)
                .answeredBy(actor);
    }
}

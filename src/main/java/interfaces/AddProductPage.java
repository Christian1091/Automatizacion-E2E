package interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddProductPage {
    public static final Target BTN_LABS_PACK =
            Target.the("botón agregar Sauce Labs Backpack")
                    .locatedBy("[data-test='add-to-cart-sauce-labs-backpack']");

    public static final Target BTN_LABS_BIKE =
            Target.the("botón agregar Sauce Labs Bike Light")
                    .locatedBy("[data-test='add-to-cart-sauce-labs-bike-light']");
}

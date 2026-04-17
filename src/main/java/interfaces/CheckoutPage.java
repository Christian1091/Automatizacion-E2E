package interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target BTN_VIEW_CART =
            Target.the("botón ver carrito")
                    .locatedBy("[data-test='shopping-cart-link']");

    public static final Target BTN_CHECKOUT =
            Target.the("botón checkout")
                    .locatedBy("[data-test='checkout']");

    public static final Target TXT_FIRST_NAME =
            Target.the("campo nombre")
                    .locatedBy("[data-test='firstName']");

    public static final Target TXT_LAST_NAME =
            Target.the("campo apellido")
                    .locatedBy("[data-test='lastName']");

    public static final Target TXT_POSTAL_CODE =
            Target.the("campo código postal")
                    .locatedBy("[data-test='postalCode']");

    public static final Target BTN_CONTINUE =
            Target.the("botón continuar")
                    .locatedBy("[data-test='continue']");

    public static final Target BTN_FINISH =
            Target.the("botón finalizar compra")
                    .locatedBy("[data-test='finish']");
}

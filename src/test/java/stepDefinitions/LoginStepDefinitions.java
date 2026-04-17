package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import questions.OrderConfirmation;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {

    @Given("El usuario abre la pagina de Saucedemo")
    public void openPage() {
        theActorCalled("User").wasAbleTo(OpenWeb.openBrowser());
    }

    @When("Nos autenticamos en la pagina")
    public void login() {
        theActorCalled("User").attemptsTo(
                Login.credentials("standard_user","secret_sauce")
        );
    }

    @Then("Agregar dos productos al carrito")
    public void addProductCart() {
        theActorCalled("User").attemptsTo(
                AddProducts.toCart()
        );
    }

    @And("Visualizar el carrito")
    public void visualizeCart() {
        theActorCalled("User").attemptsTo(
                ViewCart.viewCart()
        );
    }

    @When("Completar formulario de compra")
    public void completeForm() {
        theActorCalled("User").attemptsTo(
                Checkout.complete("Juan", "Perez", "0101")
        );
    }

    @Then("Finalizar la compra y verificar confirmacion")
    public void confirmShopping() {
        theActorInTheSpotlight().should(
                seeThat(
                        OrderConfirmation.text(), equalTo("Thank you for your order!")
                )
        );
    }

}

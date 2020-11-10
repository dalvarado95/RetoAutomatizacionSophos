package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.RestService;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.sophossolutions.questions.ElResultado;
import com.sophossolutions.tasks.RechazarAl;
import com.sophossolutions.tasks.NavegarA;
import com.sophossolutions.tasks.AgregarElProducto;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class UsuarioDefinicionesDePasos {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Que Daniel entra en wong$")
    public void ingresa_a_wong() {
        OnStage.theActorCalled("Daniel").wasAbleTo(NavegarA.paginaPrincipalWong());
    }

    @When("^Daniel agrega un producto con los datos: Email (.*) Calle (.*) Numero (.*)$")
    public void agrega_nuevo_producto(String Email, String Calle, String Numero) throws InterruptedException {
        OnStage.theActorCalled("Daniel").wasAbleTo(RechazarAl.mostrarNoficaciones());
        OnStage.theActorCalled("Daniel").wasAbleTo(AgregarElProducto.AlmacenarCarrito());
        OnStage.theActorCalled("Daniel").wasAbleTo(AgregarElProducto.IngresarEmail(Email));
        OnStage.theActorCalled("Daniel").wasAbleTo(AgregarElProducto.SeleccionarServicioEntrega());
        OnStage.theActorCalled("Daniel").wasAbleTo(AgregarElProducto.SeleccionarDomicilio(Calle,Numero));
        Thread.sleep(5000);
        OnStage.theActorCalled("Daniel").wasAbleTo(AgregarElProducto.DesplegarCarrito());
    }

  @Then("^Daniel deberia ver un texto: (.*)$")
    public void validar_nombre_producto(String Mensaje) {
      OnStage.theActorCalled("Daniel").should(
              seeThat("Nombre Producto", ElResultado.nombreProducto(),equalTo(Mensaje))
      );

    }

    @Given("^Que Daniel crea un usuario con los datos$")
    public void llamar_metodo_post() {
        OnStage.theActorCalled("Daniel").wasAbleTo(RestService.InvocarApi());
    }

    @When("^Daniel valida la informacion del usuario$")
    public void llamar_metodo_get() {
        OnStage.theActorCalled("Daniel").wasAbleTo(RestService.ValidarRegistro());
    }

    @Then("^Daniel ve registro exitoso$")
    public void validar_registro() {

    }

}

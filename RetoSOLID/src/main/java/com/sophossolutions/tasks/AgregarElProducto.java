package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.WongPaginaPrincipal;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class AgregarElProducto {

    public static Performable AlmacenarCarrito() {
        return Task.where("{0} selecciona el producto a almacenar en el carrito \"Producto\"",
                Click.on(WongPaginaPrincipal.btnAgregar)
        );
    }

    public static Performable IngresarEmail(String Email) {
        return Task.where("{0} diligencia la información solicitada\"Correo electronico\"",
                Enter.theValue(Email).into(WongPaginaPrincipal.textEmail).thenHit(Keys.TAB),
                Click.on(WongPaginaPrincipal.btnAceptar)
        );
    }

    public static Performable SeleccionarServicioEntrega() {
        return Task.where("{0} diligencia toda la información solicitada\"Envio a Domicilio\"",
               Click.on(WongPaginaPrincipal.btnEnvioDomicilio)
        );
    }

    public static Performable SeleccionarDomicilio(String Calle, String Numero) {
        return Task.where("{0} diligencia toda la información solicitada\"Domicilio\"",
                Enter.theValue(Calle).into(WongPaginaPrincipal.textDomicilio).thenHit(Keys.ENTER),
                Hit.the(Keys.ENTER).keyIn(WongPaginaPrincipal.textDomicilio),
                Enter.theValue(Numero).into(WongPaginaPrincipal.textNumero).thenHit(Keys.TAB),
                Click.on(WongPaginaPrincipal.btnConfirmar)
        );
    }

    public static Performable DesplegarCarrito() {
        return Task.where("{0} selecciona la información solicitada\"Carrito\"",
                Click.on(WongPaginaPrincipal.btnCarrito),
                Click.on(WongPaginaPrincipal.btnVerCarrito)
        );
    }

}

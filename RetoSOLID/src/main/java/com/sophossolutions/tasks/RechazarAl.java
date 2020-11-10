package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.WongPaginaPrincipal;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class RechazarAl {

    public static Performable mostrarNoficaciones() {

        return Task.where("{0} realiza clic sobre el botón \"No Gracias\"",
                Click.on(WongPaginaPrincipal.btnNoGracias)
        );

    }

}

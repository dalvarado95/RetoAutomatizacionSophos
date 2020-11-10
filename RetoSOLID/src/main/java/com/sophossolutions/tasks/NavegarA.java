package com.sophossolutions.tasks;

import com.sophossolutions.utilities.Constantes;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarA {

    public static Performable paginaPrincipalWong() {

        return Task.where("{0} navega a la página de https://www.wong.pe/especiales/cyberwong",
                Open.url(Constantes.paginaSignIn)
        );
    }

}

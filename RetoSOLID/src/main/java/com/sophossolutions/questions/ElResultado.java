package com.sophossolutions.questions;

import com.sophossolutions.userinterfaces.WongPaginaCarrito;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElResultado {

    public static Question<String> nombreProducto(){
        return actor -> Text.of(WongPaginaCarrito.textNombreProducto)
                .viewedBy(actor).asString();
    }

}

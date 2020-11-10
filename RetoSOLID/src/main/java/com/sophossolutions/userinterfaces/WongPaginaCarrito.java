package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WongPaginaCarrito extends PageObject{

    public static final Target textNombreProducto = Target.the("Nombre Producto")
            .located(By.xpath("//a[@class='product-item__name']"));
}

package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WongPaginaPrincipal extends PageObject {

    public static final Target btnNoGracias = Target.the("Boton de No Gracias")
            .located(By.xpath("//button[@id='onesignal-slidedown-cancel-button']"));

    public static final Target btnAgregar = Target.the("Boton de Agregar Producto")
            .located(By.xpath("//button[@data-productid='14414']"));

    public static final Target textEmail = Target.the("Entrada de Email")
            .located(By.xpath("//input[@id='delivery-email']"));

    public static final Target btnAceptar = Target.the("Boton de Aceptar Email")
            .located(By.xpath("//button[contains(.,'Aceptar')]"));

    public static final Target btnEnvioDomicilio = Target.the("Boton de Envio Domicilio")
            .located(By.xpath("//button[contains(.,'Envío a Domicilio')]"));

    public static final Target textDomicilio = Target.the("Entrada de Domicilio")
            .located(By.xpath("//input[@class=' modal-address__input']"));

    public static final Target textNumero = Target.the("Entrada de Numero")
            .located(By.xpath("//input[@id='number']"));

    public static final Target btnConfirmar = Target.the("Boton de Confirmar Domicilio")
            .located(By.xpath("//button[contains(.,'Confirmar')]"));

    public static final Target btnCarrito = Target.the("Boton de Carrito")
            .located(By.xpath("//button[@class='btn red minicart__action--toggle-open food-site']"));

    public static final Target btnVerCarrito = Target.the("Boton de Ver Carrito")
            .located(By.xpath("(//span[@class='text'][contains(.,'Ver carrito')])[1]"));

}

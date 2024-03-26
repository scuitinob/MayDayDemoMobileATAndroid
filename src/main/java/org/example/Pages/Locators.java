package org.example.Pages;

import org.openqa.selenium.By;

public class Locators {

    public static By campoEmail = By.xpath("//android.widget.EditText[@text='tuemail@gmail.com']");
    public static By campoClave = By.xpath("//android.view.ViewGroup[@text='Escribe tu nombre']");
    public static By btnIniSesion = By.xpath("//android.widget.Button[@text='Iniciar sesión']");

    public static By btnRegistro = By.xpath("//android.widget.TextView");

    public static By campoNombre = By.xpath("//android.widget.EditText[@text='Escribe tu nombre']");
    public static By campoApellido = By.xpath("//android.widget.EditText[@text='Ingresa tus apellidos']");
    public static By campoEmailRegistro = By.xpath("//android.widget.EditText[@text='tuemail@gmail.com']");
    public static By btnSiguiente = By.xpath("//android.widget.Button[@content-desc='Siguiente']" );
    public static By btnVolver = By.xpath("//android.widget.Button[@text='Volver']");

}

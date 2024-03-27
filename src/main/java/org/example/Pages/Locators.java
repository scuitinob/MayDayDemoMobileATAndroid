package org.example.Pages;

import org.openqa.selenium.By;

public class Locators {

    public static By btnComenzar = By.xpath("//android.widget.TextView[@Text='Comenzar']");
    public static By permisoArchivos = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    public static By campoEmail = By.xpath("//android.widget.EditText[@text='tuemail@gmail.com']");
    public static By campoClave = By.xpath("//android.widget.EditText[@text='*******']");
    public static By btnIniSesion = By.xpath("//android.widget.Button[@content-desc='Iniciar sesión']");
    public static By btnRegistro = By.xpath("//android.widget.TextView");

    public static By campoNombre = By.xpath("//android.widget.EditText[@text='Escribe tu nombre']");
    public static By campoApellido = By.xpath("//android.widget.EditText[@text='Ingresa tus apellidos']");
    public static By campoEmailRegistro = By.xpath("//android.widget.EditText[@text='tuemail@gmail.com']");
    public static By btnSiguiente = By.xpath("//android.widget.Button[@content-desc='Siguiente']" );
    public static By btnVolver = By.xpath("//android.widget.Button[@text='Volver']");
  
  
    //References
    public static By clickBtncta = By.xpath("//android.widget.Button[@text='Ingresa a tu cuenta']");
    public static By campoRut = By.xpath("//android.widget.EditText[@text='Ej.:12.345.678–9']");
    public static By clickBtnIngresar = By.xpath("//android.widget.Button[@text='Ingresar']");
    public static By clickModal = By.xpath("//android.widget.Button[@text='Continuar']");
    public static By clickBtnFin = By.xpath("//android.widget.Button[@text='Finalizar']");
    public static By clickNoActualizar = By.xpath("//android.widget.Button[@text='No quiero actualizar ahora']");
    public static By clickCerrarModal = By.xpath("//android.widget.ImageView[@content-desc='Cerrar']");
    public static By clickBtnHamburguesa = By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']");
    public static By clickMenuMisCreditos = By.xpath("//android.view.ViewGroup/android.widget.TextView[@text='Mis créditos']");
    public static By clickSimularCredito = By.xpath("//android.widget.LinearLayout[@resource-id='cajalosandes.cla:id/layoutSimulateCredit']");

    public static By clickModalCrePreAprobado = By.xpath("//android.widget.Button[@resource-id='cajalosandes.cla:id/btn_bien_ok']");


    public static By ingresarMonto = By.xpath("//android.widget.EditText[@resource-id='cajalosandes.cla:id/editTextMonto']");
    public static By ingresarCuotas = By.xpath("//android.widget.EditText[@resource-id='cajalosandes.cla:id/editTextCuota']");
    public static By clickBtnSimularCredito = By.xpath("//android.widget.Button[@resource-id='cajalosandes.cla:id/botonSimular']");
    public static By clickBtnLoQuiero = By.xpath("//android.widget.Button[@resource-id='cajalosandes.cla:id/botonLoQuiero']");
    public static By ingresarTelefono = By.xpath("//android.widget.EditText[@resource-id='cajalosandes.cla:id/campoTelefono']");
    public static By ingresarMail = By.xpath("//android.widget.EditText[@resource-id='cajalosandes.cla:id/campoMail']");
    public static By clickEnviarDatos = By.xpath("//android.widget.Button[@resource-id='cajalosandes.cla:id/botonEnviarDatos']");

}

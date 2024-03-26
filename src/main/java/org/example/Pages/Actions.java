package org.example.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.example.Fixtures.Configuration.*;

public class Actions {
    public static String rut = "9233118-0";
    public static String clave = "123456789a";
    public static String montocredito = "100000";
    public static String cuotacredito= "12";
    public static String telefono= "45669368";
    public static String email= "avattar@avattar.com";
    public static String passwd = "123456";

    //Inicio Login Test
    public static void ingresarEmail(AndroidDriver driver, File path) throws IOException {
        //Escribiendo email en login
        if (waitForElement(driver, Locators.campoEmail)) {
            System.out.println("Despliegue txtEmail");
            driver.findElement(Locators.campoEmail).sendKeys(email);
            System.out.println("Ingresar email");
            Evidencia(driver, path, "snapshot");
        } else {
            System.out.println("ERROR - NO desplegó txtEmail");
            Evidencia(driver, path, "error");
            errorPrueba(driver);
        }
    }
    public static void ingresarClave(AndroidDriver driver, File path) throws IOException {
        //Escribiendo contraseña en login
        if (waitForElement(driver, Locators.campoClave)) {
            System.out.println("Despliegue txtClave");
            driver.findElement(Locators.campoClave).sendKeys(passwd);
            System.out.println("Ingresar Clave");
            Evidencia(driver, path, "snapshot");
        } else {
            System.out.println("ERROR - NO desplegó pwClave");
            Evidencia(driver, path, "error");
            errorPrueba(driver);
        }
    }
    public static void clickBtnIniSesion(AndroidDriver driver, File path) throws IOException {
        if
        (waitForElement(driver, Locators.btnIniSesion)){
            System.out.println("Despliegue btnIniSesion");
            driver.findElement(Locators.btnIniSesion).click();
            System.out.println("Presiono boton IniSesion");
            Evidencia(driver, path, "snapshot");
        } else {
            System.out.println("ERROR - No dio click IniSesion");
            Evidencia(driver, path, "error");
            errorPrueba(driver);
        }
    }
    //Fin Login Test






    //******References******//
    public static void clickBtnIngresaCta(AndroidDriver driver, File path) throws IOException {
        if

        (waitForElement(driver, Locators.clickBtncta)){
            System.out.println("Despliegue Login");
            driver.findElement(Locators.clickBtncta).click();
            System.out.println("Presiono boton click");
            Evidencia(driver, path, "captura");
        } else {
            System.out.println("ERROR - No dio click");
            Evidencia(driver, path, "error");
            errorPrueba(driver);
        }
    }
    public static void ingresarRut(AndroidDriver driver, File path) throws IOException {
        if (waitForElement(driver, Locators.campoRut)) {
            System.out.println("Despliegue campo Rut");
            driver.findElement(Locators.campoRut).sendKeys(rut);
            System.out.println("Ingresar Rut");
            Evidencia(driver, path, "captura");
        } else {
            System.out.println("ERROR - NO desplegó Campo Rut");
            Evidencia(driver, path, "error");
            errorPrueba(driver);
        }
    }

    public static void clickBtnIngresar(AndroidDriver driver, File path) throws IOException, InterruptedException {
        Thread.sleep(5000);
        driver.findElement(Locators.clickBtnIngresar).click();
        System.out.println("Presiono boton ingresar");
        Evidencia(driver, path, "captura");
    }

    public static void clickBtnContinue(AndroidDriver driver, File path) throws IOException, InterruptedException {
        Thread.sleep(5000);
        driver.findElement(Locators.clickModal).click();
        driver.findElement(Locators.clickModal).click();
        driver.findElement(Locators.clickModal).click();
        driver.findElement(Locators.clickModal).click();
        driver.findElement(Locators.clickModal).click();
        Evidencia(driver, path, "captura");
        System.out.println("Doy click a boton continuar");
    }

    public static void clickBtnFinalizar(AndroidDriver driver, File path) throws IOException, InterruptedException {
        Thread.sleep(1000);
        driver.findElement(Locators.clickBtnFin).click();
        System.out.println("Presiono boton finalizar");
        Evidencia(driver, path, "captura");
    }
    public static void clickBtnNoActualizar(AndroidDriver driver, File path) throws IOException, InterruptedException {
        Thread.sleep(5000);
        driver.findElement(Locators.clickNoActualizar).click();
        Thread.sleep(1000);
        System.out.println("click en no actualizar");
        Evidencia(driver, path, "captura");
    }
    public static void clickBtncerrarBienvenida(AndroidDriver driver, File path) throws IOException, InterruptedException {
        //Thread.sleep(5000);
        driver.findElement(Locators.clickCerrarModal).click();
        System.out.println("click modal bienvenida");
        Evidencia(driver, path, "captura");
    }
    public static void clickMenuHamburguesa(AndroidDriver driver, File path) throws IOException, InterruptedException {
        Thread.sleep(1000);
        driver.findElement(Locators.clickBtnHamburguesa).click();
        //Thread.sleep(20000);
        System.out.println("click menu hamburguesa");
        Evidencia(driver, path, "captura");
    }
    public static void ingresoSimularCreditos(AndroidDriver driver, File path) throws IOException, InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Locators.clickMenuMisCreditos).click();
        Thread.sleep(5000);
        System.out.println("click menu mis creditos");
        Thread.sleep(1000);
        driver.findElement(Locators.clickSimularCredito).click();
        Thread.sleep(1000);
        driver.findElement(Locators.clickModalCrePreAprobado).click();
        System.out.println("click simular creditos");
        Evidencia(driver, path, "captura");
    }

    public static void datosCredito(AndroidDriver driver, File path) throws IOException, InterruptedException {
        Thread.sleep(5000);
        Actions.scrollDown(driver);
        Thread.sleep(1000);
        driver.findElement(Locators.ingresarMonto).sendKeys(montocredito);
        driver.findElement(Locators.ingresarCuotas).sendKeys(cuotacredito);
        Thread.sleep(1000);
        driver.findElement(Locators.clickBtnSimularCredito).click();;
        Thread.sleep(5000);
        Actions.scrollDown(driver);
        Actions.scrollDown(driver);
        System.out.println("click monto credito y cuotas");
        Evidencia(driver, path, "captura");
    }

    public static void datosSolicitudCredito(AndroidDriver driver, File path) throws IOException, InterruptedException {
        driver.findElement(Locators.clickBtnLoQuiero).click();
        Thread.sleep(5000);
        driver.findElement(Locators.ingresarTelefono).sendKeys(telefono);
        driver.findElement(Locators.ingresarMail).sendKeys(email);
        Thread.sleep(1000);
        driver.findElement(Locators.clickEnviarDatos).click();
        Thread.sleep(10000);
        System.out.println("click boton envia datos");
        Evidencia(driver, path, "captura");
    }
    public static void scrollDown (AndroidDriver driver){
        Dimension dim = driver.manage() .window().getSize();
        int start_x = (int) (dim.width * 0.5);
        int start_y = (int) (dim.height * 0.8);

        int end_x = (int) (dim.width * 0.5);
        int end_y = (int) (dim.height * 0.5);

        TouchAction act = new TouchAction (driver);
        act.press(PointOption.point(start_x, start_y))
                .waitAction (WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo (PointOption.point(end_x, end_y)).release().perform();
    }
    public static void Evidencia(AppiumDriver driver, File path, String tipoEvidencia) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        int numFoto = 0;
        if (tipoEvidencia.contains("error")) {
            FileUtils.copyFile(src, new File(path + "/error" + numFoto + ".jpg"));
        } else {
            FileUtils.copyFile(src, new File(path + "/captura" + numFoto + ".jpg"));
        }
        numFoto += 1;
    }
}













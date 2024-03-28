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
    public static String clave = "Hola123*";
    public static String email= "maribellavmoreno@gmail.com";

    //Inicio Login Test
    public static void ingresarEmailLogin(AndroidDriver driver, File path) throws IOException {
        //Escribiendo email en login
        if (waitForElement(driver, Locators.campoEmail)) {
            System.out.println("Despliegue campoEmail");
            driver.findElement(Locators.campoEmail).sendKeys("");
            driver.findElement(Locators.campoEmail).sendKeys(email);
            System.out.println("Ingresar email");
            Evidencia(driver, path, "snapshot");
        } else {
            System.out.println("ERROR - NO desplegó campoEmail");
            Evidencia(driver, path, "error");
            errorPrueba(driver);
        }
    }
    public static void ingresarClaveLogin(AndroidDriver driver, File path) throws IOException {
        //Escribiendo contraseña en login
        if (waitForElement(driver, Locators.campoClave)) {
            System.out.println("Despliegue campoClave");
            driver.findElement(Locators.campoClave).sendKeys("");
            driver.findElement(Locators.campoClave).sendKeys(clave);
            System.out.println("Ingresar Clave");
            Evidencia(driver, path, "snapshot");
        } else {
            System.out.println("ERROR - NO desplegó campoClave");
            Evidencia(driver, path, "error");
            errorPrueba(driver);
        }
    }
    public static void clickBtnIniSesionLogin(AndroidDriver driver, File path) throws IOException, InterruptedException {
        //Haciendo click en boton iniciar sesion
        if (waitForElement(driver, Locators.btnIniSesion)){
            System.out.println("Despliegue btnIniSesion");
            driver.findElement(Locators.btnIniSesion).click();
            System.out.println("Presiono boton IniSesion");
            Evidencia(driver, path, "snapshot");
            Thread.sleep(10000);
        } else {
            System.out.println("ERROR - No dio click IniSesion");
            Evidencia(driver, path, "error");
            errorPrueba(driver);
        }
    }
    //Fin Login Test

    //Inicio Logout
    public static void clickMenuHamburguesa(AndroidDriver driver, File path) throws IOException, InterruptedException {
        //Haciendo click en boton hamburguesa
        if (waitForElement(driver, Locators.menuHamburguesa)){
            System.out.println("Despliegue menuHamburguesa");
            driver.findElement(Locators.menuHamburguesa).click();
            System.out.println("Presiono boton menuHamburguesa");
            Evidencia(driver, path, "snapshot");
        } else {
            System.out.println("ERROR - No dio click menuHamburguesa");
            Evidencia(driver, path, "error");
            errorPrueba(driver);
        }
    }
    public static void clickCerrarSesion(AndroidDriver driver, File path) throws IOException, InterruptedException {
        //Haciendo click en boton cerrar sesion
        if (waitForElement(driver, Locators.btnCerrarSesion)){
            System.out.println("Despliegue btnCerrarSesion");
            driver.findElement(Locators.btnCerrarSesion).click();
            System.out.println("Presiono boton btnCerrarSesion");
            Evidencia(driver, path, "snapshot");
            Thread.sleep(10000);
        } else {
            System.out.println("ERROR - No dio click btnCerrarSesion");
            Evidencia(driver, path, "error");
            errorPrueba(driver);
        }
    }
    //Fin Logout

    //Inicio Generales
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
    //Fin Generales
}













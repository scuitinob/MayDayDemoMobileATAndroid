package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.example.Fixtures.Configuration;
import org.example.Pages.Actions;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ModificarTel {

    public static void main(String[] args) throws IOException {

        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String historial = hourdateFormat.format(date);

        File path = new File("C:/Caja/Eviencias_" + historial);
        path.mkdirs();


        AndroidDriver driver = Configuration.capabilities();

        try {

            //Login
            Actions.clickBtnIngresaCta(driver, path);
            Actions.ingresarRut(driver, path);
            Actions.ingresarClave(driver, path);
            Actions.clickBtnIngresar(driver, path);

            //Popup Inicio
            Actions.clickBtnContinue(driver, path);
            Actions.clickBtnFinalizar(driver, path);
            Actions.clickBtnNoActualizar(driver, path);
            Actions.clickBtncerrarBienvenida(driver, path);

            //Menu Hamburguesa y menu mis creditos
            Actions.clickMenuHamburguesa(driver, path);
            Actions.ingresoSimularCreditos(driver, path);
            Actions.datosCredito(driver, path);
            Actions.datosSolicitudCredito(driver, path);

        } catch (Exception e) {

            Evidencia(driver, path, "error");
            System.out.println("Test failed");
            driver.closeApp();
            e.printStackTrace();

        } finally {

            //Release lock in all cases

            if (driver != null) {
                System.out.println("MC session closed.");
                driver.closeApp();
                driver.quit();
            }


        }

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

}



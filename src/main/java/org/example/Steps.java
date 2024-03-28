package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.example.Fixtures.Configuration;
import org.example.Pages.Actions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Steps {
    public static void main(String[] args) throws IOException{
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String historial = hourdateFormat.format(date);
        File path = new File("C:/Eviencias_" + historial);
        path.mkdirs();
        AndroidDriver driver = Configuration.capabilities();
        try{
            //Inicio Login Test
            Actions.ingresarEmailLogin(driver, path);
            Actions.ingresarClaveLogin(driver, path);
            Actions.clickBtnIniSesionLogin(driver, path);
            // Fin Login Test

            //Inicio Logout Test
            Actions.clickMenuHamburguesa(driver, path);
            Actions.clickCerrarSesion(driver, path);
            //Fin Logout Test

        }catch (Exception e){
            Actions.Evidencia(driver, path, "error");
            System.out.println("Test failed");
            driver.closeApp();
            e.printStackTrace();
        }finally {
            if (driver != null) {
                System.out.println("MC session closed.");
                driver.closeApp();
                driver.quit();
            }
        }
    }
}

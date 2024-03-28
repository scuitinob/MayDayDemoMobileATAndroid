package org.example.Pages;

import org.openqa.selenium.By;

public class Locators {

    public static By campoEmail = By.xpath("//android.widget.EditText[@resource-id='RNE__Input__text-input']");
    public static By campoClave = By.xpath("//android.widget.EditText[@text='*******']");
    public static By btnIniSesion = By.xpath("//android.widget.Button[@content-desc='Iniciar sesión']");
    public static By menuHamburguesa = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
    public static By btnCerrarSesion = By.xpath("//android.widget.Button[@content-desc='Cerrar sesión']");


}

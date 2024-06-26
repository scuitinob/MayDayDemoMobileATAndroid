package org.example.Fixtures;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Configuration {
    public static final String MC_SERVER = "https://192.168.100.208:8443";
    public static final String MC_SERVER_CLIENT_ID ="oauth2-eB03bOTq4dyhqlkDRmoM@microfocus.com";
    public static final String MC_SERVER_CLIENT_SECRET = "wbOb4viMmnk2KtcmAQCa";
    public static final String MC_SERVER_TENANT_ID = "999999999";
    public static final String MC_SERVER_WORKSPACE_NAME = "Default workspace";
    public static final String PLATFORM_NAME = "ANDROID";
    public static final String UDID = "RF8N20RL1JL";
    public static final String UDIDXIAOMI = "PBJBOBUCGAMRDARW";
    public static final String DEVICE_NAME = "Samsung SM-G980F";
    public static final String DEVICE_NAMEXIAOMI = "Xiaomi 23026RN54G";
    public static final String APP_PACKAGE = "com.meydey.meydey";
    public static final String APP_ACTIVITY = "com.meydey.meydey.MainActivity";
    public static int TIMEOUT = 30;
    public static int numFoto = 0;

    //xiaomi o samsung
    public static String dispositivo = "xiaomi";

    public static AndroidDriver capabilities() throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if(dispositivo.equals("xiaomi")){
            capabilities.setCapability("platformName", PLATFORM_NAME);
            capabilities.setCapability("udid", UDIDXIAOMI);
            capabilities.setCapability("deviceName", DEVICE_NAMEXIAOMI);
            capabilities.setCapability("appPackage", APP_PACKAGE);
            capabilities.setCapability("appActivity", APP_ACTIVITY);
            capabilities.setCapability("oauthClientId", MC_SERVER_CLIENT_ID);
            capabilities.setCapability("oauthClientSecret", MC_SERVER_CLIENT_SECRET);
            capabilities.setCapability("tenantId", MC_SERVER_TENANT_ID);
            capabilities.setCapability("mcWorkspaceName", MC_SERVER_WORKSPACE_NAME);
            capabilities.setCapability("noReset", true);
            AndroidDriver driver = new AndroidDriver(new URL(MC_SERVER + "/wd/hub"), capabilities);
            return driver;
        }else{
            capabilities.setCapability("platformName", PLATFORM_NAME);
            capabilities.setCapability("udid", UDID);
            capabilities.setCapability("deviceName", DEVICE_NAME);
            capabilities.setCapability("appPackage", APP_PACKAGE);
            capabilities.setCapability("appActivity", APP_ACTIVITY);
            capabilities.setCapability("oauthClientId", MC_SERVER_CLIENT_ID);
            capabilities.setCapability("oauthClientSecret", MC_SERVER_CLIENT_SECRET);
            capabilities.setCapability("tenantId", MC_SERVER_TENANT_ID);
            capabilities.setCapability("mcWorkspaceName", MC_SERVER_WORKSPACE_NAME);
            capabilities.setCapability("noReset", true);
            AndroidDriver driver = new AndroidDriver(new URL(MC_SERVER + "/wd/hub"), capabilities);
            return driver;
        }
    }
    public static void Evidencia(AndroidDriver driver, File path, String tipoEvidencia) throws IOException {

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        if(tipoEvidencia.contains("error")){
            FileUtils.copyFile(src, new File(path+"/error" + numFoto + ".jpg"));
        }
        else {
            FileUtils.copyFile(src, new File(path + "/captura" + numFoto + ".jpg"));
        }
        numFoto += 1;
    }

    public static boolean waitForElement(AndroidDriver driver, By elementLocator){
        try{
            WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
            wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
            return true;
        }catch(TimeoutException toe){
            return false;
        }
    }
    public static void errorPrueba(AndroidDriver driver) {
        driver.terminateApp(APP_PACKAGE);
        driver.quit();
        System.exit(0);
    }
}

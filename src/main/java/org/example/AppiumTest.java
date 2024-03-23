package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumTest {

    public static void main(String[] args) {

        // Definir las capacidades para la automatización

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "ZY32CXMFDB"); // Nombre de tu dispositivo virtual o físico
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage","com.google.android.calculator"); // Paquete de la aplicación que deseas automatizar
        caps.setCapability("appActivity", "com.android.calculator2.Calculator"); // Actividad principal de la aplicación
        URL url;
        try {
            url = new URL("http://127.0.0.1:4723"); // La URL del servidor Appium
        } catch (Exception e) {
            throw new RuntimeException("La URL del servidor Appium no es válida: " + e.getMessage());
        }
        // Inicializar el driver de Appium

        AppiumDriver<MobileElement> driver = new AndroidDriver<>(url, caps);

        // Tap Button 1
        driver.findElementById("com.google.android.calculator:id/digit_1").click();
        // Tap Button 9
        driver.findElementById("com.google.android.calculator:id/digit_9").click();
        // Tap Button 8
        driver.findElementById("com.google.android.calculator:id/digit_8").click();
        // Tap Button 7
        driver.findElementById("com.google.android.calculator:id/digit_7").click();
        // Tap Button X
        driver.findElementById("com.google.android.calculator:id/op_sub").click();
        // Tap Button 9
        driver.findElementById("com.google.android.calculator:id/digit_9").click();
        // Tap Button 8
        driver.findElementById("com.google.android.calculator:id/digit_8").click();
        // Tap Button 7
        driver.findElementById("com.google.android.calculator:id/digit_7").click();


       //driver.quit();

      // driver.closeApp();

    }
}
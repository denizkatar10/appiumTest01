package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class GestureApp01 {

    @Test
    public void test() throws InterruptedException, MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Mr Deniz\\IdeaProjects\\mobileTesting01\\src\\Apps\\GestureTool.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//*[@text='Add gesture'])")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("gesture_name")).sendKeys("testing");
        Thread.sleep(1000);
        driver.findElement(By.id("gestures_overlay")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("done")).click();
        Thread.sleep(1000);
        WebElement titleText = driver.findElement(By.id("android:id/title"));
        Assert.assertEquals("Gesture Tool",titleText.getText());
    }
}

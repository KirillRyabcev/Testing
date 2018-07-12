package com.testing.test;

import com.testing.driver.WebDriverSingleton;
import com.testing.web.page.EmailPage;
import com.testing.web.page.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

/**
 * Created by Acer on 12.07.2018.
 */
public class NumberOfLettersTest {
    private static WebDriver driver = WebDriverSingleton.getInstance();
    HomePage hp = new HomePage();
    EmailPage ep = new EmailPage();

    private void login(){
        hp.clickSignIn();
        hp.typeLogin("i.ivanov77@tut.by");
        hp.typePassword("qwerty123");
        hp.clickPopUpSignIn();
    }

    @Test
    public void testNumbersOfLetters() throws Exception{
        driver.get("https://www.tut.by/");
        login();
        Thread.sleep(3000);
        driver.get("https://mail.tut.by/");
        Thread.sleep(3000);
        Assert.assertEquals("2", driver.findElement(By.xpath("//*[@id=\"nb-1\"]/body/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[1]/a[1]/div/span")).getText());
    }

    @AfterMethod
    public void logout() throws Exception{
        ep.clickProfileButton();
        Thread.sleep(2000);
        ep.clickExitButton();
    }

}

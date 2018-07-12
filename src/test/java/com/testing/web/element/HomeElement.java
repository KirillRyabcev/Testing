package com.testing.web.element;

import com.testing.element.Element;
import org.openqa.selenium.By;

/**
 * Created by Acer on 12.07.2018.
 */
public class HomeElement {
    public static final Element SIGN_IN_BUTTON = new Element("Войти", By.xpath("/html/body/div[3]/div[1]/div[1]/div/div[2]/div/a"));
    public static final Element LOGIN_FIELD = new Element("Логин", By.xpath("/html/body/div[3]/div[1]/div[1]/div/div[2]/div/div/div/form/div[2]/div/input"));
    public static final Element PASSWORD_FIELD = new Element("Пароль", By.xpath("/html/body/div[3]/div[1]/div[1]/div/div[2]/div/div/div/form/div[3]/div/input"));
    public static final Element POP_UP_SIGN_IN_BUTTON = new Element("Войти", By.xpath("/html/body/div[3]/div[1]/div[1]/div/div[2]/div/div/div/form/div[4]/input"));
}

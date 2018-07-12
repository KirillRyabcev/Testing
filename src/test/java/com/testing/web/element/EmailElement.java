package com.testing.web.element;

import com.testing.element.Element;
import org.openqa.selenium.By;

/**
 * Created by Acer on 12.07.2018.
 */
public class EmailElement {
    public static final Element PROFILE_BUTTON = new Element("Профиль", By.xpath("//*[@id=\"recipient-1\"]"));
    public static final Element EXIT_BUTTON = new Element("Выйти", By.xpath("/html/body/div[6]/div/div/div/div[7]/a"));
}

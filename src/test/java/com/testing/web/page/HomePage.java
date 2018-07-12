package com.testing.web.page;

import com.testing.web.element.HomeElement;

/**
 * Created by Acer on 12.07.2018.
 */
public class HomePage {
    public void clickSignIn(){ HomeElement.SIGN_IN_BUTTON.click(); }
    public void typeLogin(String login){
        HomeElement.LOGIN_FIELD.type(login);
    }
    public void typePassword(String password){
        HomeElement.PASSWORD_FIELD.type(password);
    }
    public void clickPopUpSignIn(){ HomeElement.POP_UP_SIGN_IN_BUTTON.click(); }
}

package com.techandsolve.demo.app.iu;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginaLoginDemoQA extends PageObject {

    private static final String INPUT_USER_NAME = "userName";
    private static final String INPUT_PASSWORD = "password";

    private static final String BUTTON_LOGIN = "login";

    private static final String LABEL_TITULO_DESPUES_DEL_LOGIN = "userName-value";

    @FindBy(id = INPUT_USER_NAME)
    WebElement inputUserName;

    @FindBy(id = INPUT_PASSWORD)
    WebElement inputPassword;

    @FindBy(id = BUTTON_LOGIN)
    WebElement buttonLogin;

    @FindBy(id = LABEL_TITULO_DESPUES_DEL_LOGIN)
    WebElement labelTituloDespuesDelLogin;
    public void ingresarUserName(String userName)
    {
        inputUserName.sendKeys(userName);
        waitABit(3000);
    }

    public void ingresarPassword(String password){
        inputPassword.sendKeys(password);
        waitABit(3000);
    }
    public void darClicBotonLogin() {
        buttonLogin.click();
    }
    public String buscarTituloDespuesDeLogin() {
        return labelTituloDespuesDelLogin.getText();
    }


}


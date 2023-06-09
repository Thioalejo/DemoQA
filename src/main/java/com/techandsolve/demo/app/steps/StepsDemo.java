package com.techandsolve.demo.app.steps;


import com.techandsolve.demo.app.iu.PageHome;
import com.techandsolve.demo.app.iu.PaginaLoginDemoQA;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import static org.junit.Assert.assertEquals;

public class StepsDemo extends PageObject {

    PageHome pageHome;
    PaginaLoginDemoQA paginaLoginDemoQA;
    public void OpenPage() {
        pageHome.open();
    }

    @Step
    public void diligenciarFormularioLogin(String userName, String password) {
        paginaLoginDemoQA.ingresarUserName(userName);
        paginaLoginDemoQA.ingresarPassword(password);
        paginaLoginDemoQA.darClicBotonLogin();
    }

    @Step
    public void validarTituloDespuesDeLogin(String tituloLogin) {
        assertEquals(tituloLogin, paginaLoginDemoQA.buscarTituloDespuesDeLogin());
    }
}

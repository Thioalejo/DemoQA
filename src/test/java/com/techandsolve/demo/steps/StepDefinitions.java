package com.techandsolve.demo.steps;

import com.techandsolve.demo.app.steps.StepsDemo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {
    @Steps
    StepsDemo stepsDemo;

    @Dado("que yo me encuentre la pagina de inicio de sesion")
    public void que_yo_me_encuentre_la_pagina_de_inicio_de_sesion() {
        stepsDemo.OpenPage();
    }
    @Cuando("cuando logre iniciar sesion con el usuario {string} y clave {string}")
    public void cuando_logre_iniciar_sesion_con_el_usuario_y_clave(String userName, String password) {
        stepsDemo.diligenciarFormularioLogin(userName, password);
    }
    @Entonces("deberia ver mi usuario {string}")
    public void deberia_ver_mi_usuario(String tituloLogin) {
        stepsDemo.validarTituloDespuesDeLogin(tituloLogin);
    }
}

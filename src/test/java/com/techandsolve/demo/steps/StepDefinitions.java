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


}

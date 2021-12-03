package com.blaze.www.StepDefinitions;

import Steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {
    @Steps
    LoginSteps pasos;

    @Given("que el usuario se encuentre en la pagina principal")
    public void queElUsuarioSeEncuentreEnLaPaginaPrincipal() {
        pasos.abrirNavegador();
    }

    @When("ingrese usuario y clave")
    public void fillForm() {
        pasos.enterFirstName();
        pasos.enterLastName();
        pasos.enterEmail();
        pasos.selMale();
        pasos.enterPhone();
        pasos.clickBDate();
        pasos.enterBDate();
        pasos.chkHobbieSport();
        pasos.chooseFile();
        pasos.enterCurrentAdd();
        pasos.selState();
        pasos.selCity();
    }

    @Then("el usuario visualiza su nombre en la pagina")
    public void elUsuarioVisualizaSuNombreEnLaPagina() {
        pasos.validarUsuario();
    }

}

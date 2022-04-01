package co.com.client.webproject.test.stepdefinition.contactarse;

import co.com.client.webproject.test.controllers.ContactUsPageController;
import co.com.client.webproject.test.controllers.LoginPageController;
import co.com.client.webproject.test.controllers.openwebpage.NavegarAContactUs;
import co.com.client.webproject.test.controllers.openwebpage.StartBrowserWebController;
import co.com.client.webproject.test.data.objects.TestInfo;
import co.com.client.webproject.test.model.ContactUs;
import co.com.client.webproject.test.page.LandingContactUsPage;
import co.com.client.webproject.test.stepdefinition.setup.Setup;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Assert;
import co.com.sofka.test.evidence.reports.Report;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.client.webproject.test.helpers.Dictionary.MENSAJE_ENVIADO_EXITOSO;

public class contactarseStepDefinition extends Setup {
    private WebAction webAction;
    public String Mensaje;

    @Before
    public void setup(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }

    @Dado("que me encuentro en la pagina web")
    public void que_me_encuentro_en_la_pagina_web() {

        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();

    }
    @Cuando("lleno la informacion pertinente, sin adjuntar un archivo")
    public void lleno_la_informacion_pertinente_sin_adjuntar_un_archivo() {
        NavegarAContactUs navegarAContactUs = new NavegarAContactUs();
        navegarAContactUs.setWebAction(webAction);
        navegarAContactUs.irHaciaContactUs();


        ContactUsPageController contactUsPageController  = new ContactUsPageController();
        contactUsPageController.setWebAction(webAction);
        contactUsPageController.llenarInfo();
        Mensaje=contactUsPageController.Texto;

    }
    @Entonces("el sistema debe mostrar que mi mensaje fue enviado.")
    public void el_sistema_debe_mostrar_que_mi_mensaje_fue_enviado() {
        Assert.Hard.thatString(Mensaje).isEqualTo(MENSAJE_ENVIADO_EXITOSO);


    }


    @After
    public void cerrarDriver() throws InterruptedException {

        Thread.sleep(5000);

        if (webAction != null && webAction.getDriver() != null)
            webAction.closeBrowser();

        Report.reportInfo("***** HA FINALIZADO LA PRUEBA******"
                .concat(testInfo.getFeatureName())
                .concat("-")
                .concat(testInfo.getScenarioName()));
    }



}

package co.com.client.webproject.test.stepdefinition.comprar;

import co.com.client.webproject.test.controllers.BuyAnItemWebController;
import co.com.client.webproject.test.controllers.CreateAnAccountWebController;
import co.com.client.webproject.test.controllers.LoginPageController;
import co.com.client.webproject.test.controllers.openwebpage.StartBrowserWebController;
import co.com.client.webproject.test.data.objects.TestInfo;
import co.com.client.webproject.test.model.Customer;
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

import static co.com.client.webproject.test.helpers.Dictionary.MENSAJE_EXITOSO_BANKWIRE;
import static co.com.client.webproject.test.helpers.Dictionary.MENSAJE_EXITOSO_CHEQUE;

public class ComprarUnArticuloStepDefinition extends Setup {

    private WebAction webAction;
    private Customer customer;
    public String Mensaje;

    @Before
    public void setup(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }

    @Dado("que ya realice el proceso de registro")
    public void que_ya_realice_el_proceso_de_registro() {
        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();
        LoginPageController loginPageController = new LoginPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

        CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
        createAnAccountWebController.setWebAction(webAction);
        createAnAccountWebController.crearUnaCuenta();


    }

    @Cuando("cuando realice todos los pasos y seleccione pago por transferencia")
    public void cuando_realice_todos_los_pasos_y_seleccione_pago_por_transferencia() {

        BuyAnItemWebController buyAnItemWebController = new BuyAnItemWebController();
        buyAnItemWebController.setWebAction(webAction);
        buyAnItemWebController.buyAnItemWithBank();
        Mensaje = buyAnItemWebController.Texto;

    }

    @Entonces("deberia recibir un mensaje de confirmacion por parte de la pagina")
    public void deberia_recibir_un_mensaje_de_confirmacion_por_parte_de_la_pagina() {

        Assert.Hard.thatString(Mensaje).isEqualTo(MENSAJE_EXITOSO_BANKWIRE);



    }


    @Dado("que ya realice el proceso de registro previamente")
    public void que_ya_realice_el_proceso_de_registro_previamente() {
        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();
        LoginPageController loginPageController = new LoginPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

        CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
        createAnAccountWebController.setWebAction(webAction);
        createAnAccountWebController.crearUnaCuenta();


    }
    @Cuando("realice todos los pasos necesarios y selecciono el metodo de pago por cheque")
    public void realice_todos_los_pasos_necesarios_y_selecciono_el_metodo_de_pago_por_cheque() {

        BuyAnItemWebController buyAnItemWebController = new BuyAnItemWebController();
        buyAnItemWebController.setWebAction(webAction);
        buyAnItemWebController.buyAnItemWithCheck();
        Mensaje = buyAnItemWebController.Texto;


    }
    @Entonces("deberia  recibir un mensaje de que elegi el metodo de pago por cheque")
    public void deberia_recibir_un_mensaje_de_que_elegi_el_metodo_de_pago_por_cheque() {

        Assert.Hard.thatString(Mensaje).isEqualTo(MENSAJE_EXITOSO_CHEQUE);


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

package co.com.client.webproject.test.controllers.openwebpage;

import co.com.client.webproject.test.page.LandingContactUsPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

public class NavegarAContactUs {

    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void irHaciaContactUs(){


        try {
            LandingContactUsPage landingContactUsPage = new LandingContactUsPage(webAction.getDriver());

            webAction.click(landingContactUsPage.getContactUsButton(),3,true);


        }catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar abrir la tienda online", e);
        }
    }
}

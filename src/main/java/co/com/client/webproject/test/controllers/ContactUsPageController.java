package co.com.client.webproject.test.controllers;

import co.com.client.webproject.test.model.ContactUs;
import co.com.client.webproject.test.page.ContactUsPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.client.webproject.test.helpers.Dictionary.*;
import static co.com.client.webproject.test.helpers.Helper.generateContactUs;

public class ContactUsPageController {

    private WebAction webAction;
    private ContactUs contactUs;
    public String Texto ;

    public ContactUs getContactUs() {
        return contactUs;
    }

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void llenarInfo(){

        try {

            contactUs = generateContactUs(EMAIL_DOMAIN,SPANISH_CODE_LANGUAGE, COUNTRY_CODE);
            ContactUsPage contactUsPage = new ContactUsPage(webAction.getDriver());



            webAction.selectByText(contactUsPage.getSelectForm(),contactUs.getSubject(),3,true);
            webAction.sendText(contactUsPage.getEmail(),contactUs.getEmail(),3,true);
            webAction.sendText(contactUsPage.getIdOrder(),contactUs.getOrderReference(),3,true);
            webAction.sendText(contactUsPage.getMessage(),contactUs.getMessage(),3,true);
            webAction.click(contactUsPage.getSend(),3,true);
            Texto = webAction.getText(contactUsPage.getText(),3,true);

        }catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al llenar la informacion.", e);
        }
    }



    public void llenarInfoSin(){

        try {

            contactUs = generateContactUs(EMAIL_DOMAIN,SPANISH_CODE_LANGUAGE, COUNTRY_CODE);
            ContactUsPage contactUsPage = new ContactUsPage(webAction.getDriver());



            webAction.selectByText(contactUsPage.getSelectForm(),contactUs.getSubject(),3,true);
            webAction.sendText(contactUsPage.getEmail(),contactUs.getEmail(),3,true);
            webAction.sendText(contactUsPage.getMessage(),contactUs.getMessage(),3,true);
            webAction.click(contactUsPage.getSend(),3,true);
            Texto = webAction.getText(contactUsPage.getText(),3,true);

        }catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al llenar la informacion.", e);
        }




    }



}

package co.com.client.webproject.test.controllers;

import co.com.client.webproject.test.page.BuyAnItemPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;


public class BuyAnItemWebController {

    private WebAction webAction;
    public String Texto;



    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void buyAnItemWithBank(){


        try {
            BuyAnItemPage buyAnItemPage = new BuyAnItemPage(webAction.getDriver());
            webAction.click(buyAnItemPage.getTshirt(),5,true);
            webAction.moveTo(buyAnItemPage.getImageTshirt(),5,true);
            webAction.click(buyAnItemPage.getAddToCart(),5,true);
            webAction.click(buyAnItemPage.getProceed(),3, true);
            webAction.click(buyAnItemPage.getProceedToCheckOut(),3,true);
            webAction.click(buyAnItemPage.getProceedToCheckOutAddress(),3,true);
            webAction.moveTo(buyAnItemPage.getAccept(),3,true);
            webAction.click(buyAnItemPage.getAccept(),5,true);
            webAction.click(buyAnItemPage.getProceedToCheckOutShipping(),3, true);
            webAction.click(buyAnItemPage.getBankWireMethod(),3,true);
            Texto= webAction.getText(buyAnItemPage.getConfirmTextByBank(),3,true);
            webAction.click(buyAnItemPage.getConfirmOrder(),3,true);






        }catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar comprar el item.", e);
        }
    }


    public void buyAnItemWithCheck(){


        try {
            BuyAnItemPage buyAnItemPage = new BuyAnItemPage(webAction.getDriver());
            webAction.click(buyAnItemPage.getTshirt(),5,true);
            webAction.moveTo(buyAnItemPage.getImageTshirt(),5,true);
            webAction.click(buyAnItemPage.getAddToCart(),5,true);
            webAction.click(buyAnItemPage.getProceed(),3, true);
            webAction.click(buyAnItemPage.getProceedToCheckOut(),3,true);
            webAction.click(buyAnItemPage.getProceedToCheckOutAddress(),3,true);
            webAction.moveTo(buyAnItemPage.getAccept(),3,true);
            webAction.click(buyAnItemPage.getAccept(),5,true);
            webAction.click(buyAnItemPage.getProceedToCheckOutShipping(),3, true);
            webAction.click(buyAnItemPage.getByCheck(),3,true);
            Texto= webAction.getText(buyAnItemPage.getConfirmTextByCheck(),3,true);
            webAction.click(buyAnItemPage.getConfirmOrder(),3,true);






        }catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar comprar el item.", e);
        }
    }
}

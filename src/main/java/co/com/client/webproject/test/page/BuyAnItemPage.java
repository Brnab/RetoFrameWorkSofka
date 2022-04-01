package co.com.client.webproject.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyAnItemPage {
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement ImageTshirt;



    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement Tshirt;


    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
    WebElement addToCart;


    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
    WebElement proceed;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
    WebElement proceedToCheckOut;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement proceedToCheckOutAddress;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/p[2]/label[1]")
    WebElement accept;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement proceedToCheckOutShipping;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]")
    WebElement bankWireMethod;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")
    WebElement byCheck;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/p[1]/strong[1]")
    WebElement confirmTextByBank;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/p[1]/strong[1]")
    WebElement confirmTextByCheck;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement confirmOrder;





    public WebElement getImageTshirt() {
        return ImageTshirt;
    }

    public WebElement getTshirt() {
        return Tshirt;
    }


    public WebElement getAddToCart() {
        return addToCart;
    }
    public WebElement getProceed() {
        return proceed;
    }

    public WebElement getProceedToCheckOut() {
        return proceedToCheckOut;
    }

    public WebElement getProceedToCheckOutAddress() {
        return proceedToCheckOutAddress;
    }

    public WebElement getAccept() {
        return accept;
    }

    public WebElement getProceedToCheckOutShipping() {
        return proceedToCheckOutShipping;
    }

    public WebElement getBankWireMethod() {
        return bankWireMethod;
    }

    public WebElement getByCheck() {
        return byCheck;
    }


    public WebElement getConfirmOrder() {
        return confirmOrder;
    }


    public WebElement getConfirmTextByBank() {
        return confirmTextByBank;
    }


    public WebElement getConfirmTextByCheck() {
        return confirmTextByCheck;
    }

    public BuyAnItemPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }


}

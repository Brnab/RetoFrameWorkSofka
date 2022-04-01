package co.com.client.webproject.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {




    @CacheLookup
    @FindBy(xpath = "//select[@id='id_contact']")
    WebElement SelectForm;

    @CacheLookup
    @FindBy(id = "email")
    WebElement Email;


    @CacheLookup
    @FindBy(id = "id_order")
    WebElement IdOrder;


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'No file selected')]")
    WebElement AttachFile;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement Message;


    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]")
    WebElement Send;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Your message has been successfully sent to our tea')]")
    WebElement Text;




    public WebElement getSelectForm() {
        return SelectForm;
    }

    public WebElement getEmail() {
        return Email;
    }


    public WebElement getIdOrder() {
        return IdOrder;
    }


    public WebElement getAttachFile() {
        return AttachFile;
    }

    public WebElement getMessage() {
        return Message;
    }

    public WebElement getSend() {
        return Send;
    }


    public WebElement getText() {
        return Text;
    }

    public ContactUsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}

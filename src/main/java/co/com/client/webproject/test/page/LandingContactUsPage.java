package co.com.client.webproject.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingContactUsPage {

    @CacheLookup
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement ContactUsButton;

    public WebElement getContactUsButton() {
        return ContactUsButton;
    }

    public LandingContactUsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}

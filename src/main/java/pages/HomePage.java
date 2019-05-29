package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by Ardit Podrimaj
 */


@Getter
public class HomePage extends AbstractPage {

    @FindBy(css = "[href='https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F']")
    WebElementFacade registerButton;

    @FindBy(css = "[href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F']")
    WebElementFacade signInButton;

    @FindBy(css = ".carousel.hl-carousel.carousel--slides.carousel__autoplay")
    WebElementFacade slider;

}
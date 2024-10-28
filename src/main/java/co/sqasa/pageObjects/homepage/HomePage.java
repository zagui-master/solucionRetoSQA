package co.sqasa.pageObjects.homepage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy(id="menu-item-2806")
    protected WebElementFacade opcion_seecion_amor;

    @FindBy(id="menu-item-2799")
    protected WebElementFacade opcion_seecion_cumpleaños;
}

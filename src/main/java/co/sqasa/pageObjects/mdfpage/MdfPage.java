package co.sqasa.pageObjects.mdfpage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MdfPage {

    @FindBy(xpath = "//h1[@class='product_title entry-title' and text()='MDF 0001']")
    protected WebElementFacade producto_1;

    @FindBy(xpath = "//h1[@class='product_title entry-title' and text()='MDF 00010']")
    protected WebElementFacade producto_2;

    @FindBy(xpath = "   //button[@name='add-to-cart´']")
    protected WebElementFacade bnt_agregar;


}

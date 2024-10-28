package co.sqasa.pageObjects.productospage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductosPage extends PageObject {

    private String locator = "//div[@data-product-id='%s']";
    @FindBy(xpath = "//div[@data-product-id='4100']")
    protected WebElementFacade producto_1;

    @FindBy(xpath = "//div[@data-product-id='4084']")
    protected WebElementFacade producto_2;


}

package co.sqasa.pageObjects.carritopage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarritoPage {


    protected WebElementFacade producto;

    @FindBy(xpath = "//td[@class='product-name']//a[text()='MDF 0001']")
    protected WebElementFacade producto_1;
    @FindBy(xpath = "//td[@class='product-name']//a[text()='MDF 00010']")
    protected WebElementFacade producto_2;
}
//td[@class="product-name"]//a[text()='MDF 0001']
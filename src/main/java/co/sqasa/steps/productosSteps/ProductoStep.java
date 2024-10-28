package co.sqasa.steps.productosSteps;

import co.sqasa.pageObjects.productospage.ProductosPage;
import net.serenitybdd.annotations.Step;

public class ProductoStep extends ProductosPage {

    @Step("selecciona Producto 1")
    public void seleccionaProducto1() {
        producto_1.click();
    }

    @Step("selecciona Producto 2")
    public void seleccionaProducto2() {
        producto_2.click();
    }
}

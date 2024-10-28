package co.sqasa.StepDef;

import co.sqasa.steps.homeSteps.HomePageSteps;
import co.sqasa.steps.mdfSteps.MdfStep;
import co.sqasa.steps.productosSteps.ProductoStep;
import co.sqasa.utils.WebSite;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;

public class ValidarAgregarYEliminarProductosDelCarritoDeCompraStepDef {

    @Steps(shared = true)
    WebSite brower;
    @Steps(shared = true)
    HomePageSteps home;
    @Steps(shared = true)
    MdfStep mdf;
    @Steps(shared = true)
    ProductoStep productos;


}

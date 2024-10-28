package co.sqasa.steps.mdfSteps;

import co.sqasa.pageObjects.mdfpage.MdfPage;
import net.serenitybdd.annotations.Step;

public class MdfStep extends MdfPage {

    @Step("Agregar producto")
    public void agregarproducto() {
        bnt_agregar.click();
    }
}

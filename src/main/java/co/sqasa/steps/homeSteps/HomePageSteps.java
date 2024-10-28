package co.sqasa.steps.homeSteps;

import co.sqasa.pageObjects.homepage.HomePage;
import net.serenitybdd.annotations.Step;

public class HomePageSteps extends HomePage {

    @Step("seleccionar la Categoria Amor")
    public void seleccionarCategoriaAmor(){
        opcion_seecion_amor.click();
    }
    @Step("seleccionar la Categoria Cumpleaños")
    public void seleccionarCategoriaCunmpleaños(){
        opcion_seecion_cumpleaños.click();
    }
}

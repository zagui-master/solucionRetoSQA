package co.sqasa.utils;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {

    @Steps(shared = true)
    PageObject website;

    public void navigateTo(String url){
        website.setDefaultBaseUrl(url);
        website.open();
    }
}

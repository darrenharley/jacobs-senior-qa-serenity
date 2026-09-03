package pages;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

    public static final String URL = "https://www.jacobs.com";

    public void openHomePage() {
        openUrl(URL);
    }
}
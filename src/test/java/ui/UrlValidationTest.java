package ui;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.HomePage;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class UrlValidationTest {

    HomePage homePage;

    @Test
    void shouldValidateUrl() {

        homePage.openHomePage();

        assertThat(homePage.getDriver().getCurrentUrl())
                .contains("jacobs.com");
    }
}
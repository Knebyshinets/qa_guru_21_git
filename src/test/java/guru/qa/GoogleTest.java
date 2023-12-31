package guru.qa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GoogleTest {
    @Test
    void googleSearchTest() {
        Selenide.open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[#search]").shouldHave(text("https://selenide.org"));
    }
}

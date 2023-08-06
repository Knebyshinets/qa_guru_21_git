package guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void yandexSearchTest() {
        open("https://yandex.by/");
        $("#text").setValue("колонка Алиса").pressEnter();
        $(".HeaderDesktopNavigation-Cutted").$(byText("Картинки")).click();

    }
}

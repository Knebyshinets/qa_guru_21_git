package guru.qa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @Test
    void yandexSearchTest() {
        open("https://yandex.by/");
        $("#text").setValue("колонка Алиса").pressEnter();
    }
}

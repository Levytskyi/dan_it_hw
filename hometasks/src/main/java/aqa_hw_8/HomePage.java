package aqa_hw_8;

import java.time.Duration;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private final Duration TIMEOUT = Duration.ofSeconds(5);

    public void enterSearchText(String textToSearch) {
        $x("//input[@type='text']").
                shouldBe(visible, TIMEOUT).
                setValue(textToSearch);
    }

    public void searchButtonClick() {
        $x("//button[contains(@class, 'search__btn flex')]").
                shouldBe(clickable, TIMEOUT).
                click();
    }

    public void userPageClick() {
        $x("//div[@class='user-info']").
                shouldBe(clickable, TIMEOUT).
                click();
    }
}

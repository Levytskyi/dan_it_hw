package aqa_hw_8;

import java.time.Duration;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage {
    private final Duration TIMEOUT = Duration.ofSeconds(5);

    public void firstElementClick() {
        $x("(//a[contains(@class, 'item-title')])[1]").
                shouldBe(clickable, TIMEOUT).
                click();
    }
}

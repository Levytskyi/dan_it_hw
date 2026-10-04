package aqa_hw_8;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class ProductDetailPage {
    private final Duration TIMEOUT = Duration.ofSeconds(5);
    private final SelenideElement MAIN_TITLE = $x("//h1[@class='title__main']");
    private final SelenideElement ABOUT_PRODUCT_TAB = $x("//div[@data-tracking-id='product-19']");

    public void ssdCapacityOptionButtonClick() {
        $x("//div[@class='similar-colors-products__section']/span[contains(normalize-space(.), 'SSD')]").
                shouldBe(clickable, TIMEOUT).
                click();
    }

    public void selectSsd512Gb() {
        $x("//a[contains(@class, 'similar-series-products__item flex')]//b[contains(normalize-space(.), '512')]").
                shouldBe(clickable, TIMEOUT).
                click();
    }

    public String getMainTitleContain(String expectedPart) {
        return MAIN_TITLE.shouldHave(text(expectedPart), TIMEOUT).getText();
    }

    public void aboutProductTabClick() {
        ABOUT_PRODUCT_TAB.
                shouldBe(clickable, TIMEOUT).
                click();
    }

    public String getProductClassAttribute() {
        return ABOUT_PRODUCT_TAB.
                shouldBe(visible, TIMEOUT).
                getAttribute("class");
    }

    public String getAboutProductTitleText() {
        return $x("//h2[@class='text-x-lg']").
                shouldBe(visible, TIMEOUT).
                getText();
    }
}

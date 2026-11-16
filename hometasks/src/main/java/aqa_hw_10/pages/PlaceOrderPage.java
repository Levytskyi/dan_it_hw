package aqa_hw_10.pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class PlaceOrderPage {

    public int getOneProduct$Price() {
        String price = $("td.price>span.simple_usd").
                shouldBe(visible).
                getText().
                replace("$", "").
                trim();
        return Integer.parseInt(price);
    }

    public int getTotal$Price() {
        String total = $("td.total>span.simple_usd").
                shouldBe(visible).
                getText().
                replace("$", "").
                trim();
        return Integer.parseInt(total);
    }

    public int getTotal$Price(int oldTotal) {
        String total = $("td.total>span.simple_usd").
                shouldNotHave(exactText("$" + oldTotal)).
                getText().
                replace("$", "").
                trim();
        return Integer.parseInt(total);
    }

    public void increaseProductQuantity() {
        $("i[class='fa fa-plus']").shouldBe(clickable).click();
    }
}

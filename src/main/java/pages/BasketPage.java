package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class BasketPage {

    private SelenideElement basketButton = $x("//a[@class = 'shopping_cart_link']");

    @Step("Clicking the button of basket")
    public CartPage clickBasketButton() {
        basketButton.click();
        return new CartPage();
    }

}

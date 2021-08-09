package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasketPage {

    private SelenideElement basketButton = $x("//a[@class = 'shopping_cart_link']");

    public CartPage clickBasketButton() {
        basketButton.click();
        return new CartPage();
    }

}

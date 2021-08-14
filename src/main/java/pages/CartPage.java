package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage extends BasketPage {

    private SelenideElement checkoutButton = $x("//button[@data-test = 'checkout']");
    private ElementsCollection removeButton = $$x("//button[contains(@data-test, 'remove')]");
    private SelenideElement cartBadge = $x("//span[@class = 'shopping_cart_badge']");

    @Step("Clicking the button of checkout")
    public CheckoutStepOnePage clickCheckoutButton() {
        checkoutButton.click();
        return new CheckoutStepOnePage();
    }

    @Step("Clicking the button of remove")
    public CartPage removeAllProductsFromBasket() {
        removeButton.stream().forEach(a -> a.click());
        return this;
    }

    public boolean isCartBadgeNotExist() {
        return !cartBadge.isDisplayed();
    }

}

package pages;

import io.qameta.allure.Step;
import utils.Products;

import static com.codeborne.selenide.Selenide.$x;

public class InventoryPage extends BasketPage {

    public static String URL = "https://www.saucedemo.com/inventory.html";

    private String addButton = "//button[@data-test = 'add-to-cart-%s']";

    @Step("Clicking the button of add")
    public InventoryPage clickAddingButton(Products products) {
        $x(String.format(addButton, products.getName())).click();
        return this;
    }

}


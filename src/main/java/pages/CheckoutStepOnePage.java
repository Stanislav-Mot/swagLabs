package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class CheckoutStepOnePage extends BasketPage {

    private SelenideElement firstName = $x("//input[@data-test = 'firstName']");
    private SelenideElement lastName = $x("//input[@data-test = 'lastName']");
    private SelenideElement postalCode = $x("//input[@data-test = 'postalCode']");
    private SelenideElement continueButton = $x("//input[@data-test = 'continue']");

    @Step("Entering fields for buy")
    public CheckoutStepOnePage enterFieldForCheckout(String name, String surname, String zip) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/field.properties"));
        firstName.sendKeys(properties.getProperty(name));
        lastName.sendKeys(properties.getProperty(surname));
        postalCode.sendKeys(properties.getProperty(zip));
        return this;
    }

    @Step("Clicking the button of continue")
    public CheckoutStepTwoPage clickContinueButton() {
        continueButton.click();
        return new CheckoutStepTwoPage();
    }

}

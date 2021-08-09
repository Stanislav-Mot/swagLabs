package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class CheckoutStepOnePage extends BasketPage {

    private SelenideElement firstName = $x("//input[@data-test = 'firstName']");
    private SelenideElement lastName = $x("//input[@data-test = 'lastName']");
    private SelenideElement postalCode = $x("//input[@data-test = 'postalCode']");
    private SelenideElement continueButton = $x("//input[@data-test = 'continue']");

    public CheckoutStepOnePage enterFieldForCheckout() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/field.properties"));
        firstName.sendKeys(properties.getProperty("field.firstName"));
        lastName.sendKeys(properties.getProperty("field.lastName"));
        postalCode.sendKeys(properties.getProperty("field.zip"));
        return this;
    }

    public CheckoutStepTwoPage clickContinueButton() {
        continueButton.click();
        return new CheckoutStepTwoPage();
    }

}

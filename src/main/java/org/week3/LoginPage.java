package org.week3;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement clickRecapture() {
        return $(By.xpath("//input[@type='checkbox']"));
    }


    public SelenideElement changeCurrency() {
            return $("#customerCurrency");
        }

        public SelenideElement searchBox(String search) {
            return $("##small-searchterms").val(search);
        }

        public SelenideElement searchSubmitBtn() {
            return $("button[type='submit']");
        }

        public SelenideElement sortProduct() {
            return $("#products-orderby");
        }

    public SelenideElement secondItem() {
        return $("body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)");
    }

    public SelenideElement thirdItem() {
        return $("body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)");
    }

    public SelenideElement selectRAM() {
        return $("#product_attribute_2");
    }

    public SelenideElement selectHDD() {
        return $("label[for='product_attribute_3_6']");
    }

    public SelenideElement comparePageAddToCart() {
        return $("#add-to-cart-button-1");
    }

    public SelenideElement closeAddToCartBtn() {
        return $("span[title='Close']");
    }

    public SelenideElement cartBtn() {
        return $("#topcartlink");
    }

    public SelenideElement addGiftWrapping() {
        return $("#checkout_attribute_1");
    }

    public SelenideElement agreementBtn() {
        return $("#termsofservice");
    }

    public SelenideElement checkoutBtn() {
        return $("#checkout");
    }

    public SelenideElement guestCheckout() {
        return $(".button-1.checkout-as-guest-button");
    }

}

package com.hf.actions;

import com.hf.repo.OrderConfirmationPageRepo;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPageActions extends OrderConfirmationPageRepo {

    WebDriver driver;
    Logger logger = Logger.getLogger(OrderConfirmationPageActions.class);

    public OrderConfirmationPageActions(WebDriver driver) {
        this.driver = driver;
        setDriver(driver);
        PageFactory.initElements(driver, this);
    }

    /**
     * Validate Order Confirmation Header
     *
     * @return
     */
    public boolean validateOrderConfirmationHeader() {
        String s = "ORDER CONFIRMATION";
        return getText(title).equals(s);
    }

    /**
     * Verify order confirmation is the last step
     *
     * @return
     */
    public boolean verofyCurrentStepIsLate() {
        return isDisplayed(laststep);
    }

    /**
     * validate orderConfirmationTilte
     *
     * @return
     */
    public boolean orderConfirmationTitle() {
        String expected = "controller=order-confirmation";
        return getText(orderConfirmationTitle).equals(expected);
    }
}

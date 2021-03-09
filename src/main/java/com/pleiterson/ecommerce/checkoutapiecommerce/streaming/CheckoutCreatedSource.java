package com.pleiterson.ecommerce.checkoutapiecommerce.streaming;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public class CheckoutCreatedSource {
    String OUTPUT = "checkout-created-output";

    @Output(OUTPUT)
    MessageChannel output();
}

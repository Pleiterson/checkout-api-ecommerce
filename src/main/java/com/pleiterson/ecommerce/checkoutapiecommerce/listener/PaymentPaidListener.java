package com.pleiterson.ecommerce.checkoutapiecommerce.listener;

import com.pleiterson.ecommerce.checkoutapiecommerce.entity.CheckoutEntity;
import com.pleiterson.ecommerce.checkoutapiecommerce.service.CheckoutService;
import com.pleiterson.ecommerce.checkoutapiecommerce.streaming.PaymentPaidSink;
import com.pleiterson.ecommerce.checkoutpaymentecommerce.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {
    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}

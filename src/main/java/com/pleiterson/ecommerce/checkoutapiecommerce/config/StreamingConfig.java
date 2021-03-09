package com.pleiterson.ecommerce.checkoutapiecommerce.config;

import com.pleiterson.ecommerce.checkoutapiecommerce.streaming.CheckoutCreatedSource;
import com.pleiterson.ecommerce.checkoutapiecommerce.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
    
}

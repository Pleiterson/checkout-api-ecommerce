package com.pleiterson.ecommerce.checkoutapiecommerce.service;

import com.pleiterson.ecommerce.checkoutapiecommerce.entity.CheckoutEntity;
import com.pleiterson.ecommerce.checkoutapiecommerce.resource.checkout.CheckoutRequest;
import java.util.Optional;

public class CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}

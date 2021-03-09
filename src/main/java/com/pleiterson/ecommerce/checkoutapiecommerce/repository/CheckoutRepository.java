package com.pleiterson.ecommerce.checkoutapiecommerce.repository;

import com.pleiterson.ecommerce.checkoutapiecommerce.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {
    Optional<CheckoutEntity> findByCode(String code);
}

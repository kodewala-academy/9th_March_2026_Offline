package com.zepto.payment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.entity.PaymentEntity;

@Repository
public interface PaymentRepository extends CrudRepository<PaymentEntity, Long> 
{

}

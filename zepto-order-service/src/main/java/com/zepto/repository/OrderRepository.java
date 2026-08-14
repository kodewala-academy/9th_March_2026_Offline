package com.zepto.repository;

import org.springframework.data.repository.CrudRepository;

import com.zepto.entity.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Integer> 
{

}

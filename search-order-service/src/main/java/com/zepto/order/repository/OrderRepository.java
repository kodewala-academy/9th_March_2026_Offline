package com.zepto.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.order.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer> 
{
	   // Derived Method 
      public OrderEntity findOrdersByOrderId(int orderId); // select * from orders where order_id=?
}

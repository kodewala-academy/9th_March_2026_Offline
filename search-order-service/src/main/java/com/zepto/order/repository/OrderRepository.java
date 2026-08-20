package com.zepto.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zepto.order.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {
	// Derived Method
	public OrderEntity findOrdersByOrderId(int orderId); // select * from orders where order_id=?

//	@Query("select o from OrderEntity o where o.paymentMethod = :type and o.quantity <2 ") // JPQL
	@Query(value = "select * from orders where payment_method='UPI' and quantity < 2", nativeQuery = true) // SQL
	public List<OrderEntity> findOrdersByPaymentType(@Param("type") String paymentType);
}

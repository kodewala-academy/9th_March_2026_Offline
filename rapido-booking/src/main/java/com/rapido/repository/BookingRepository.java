package com.rapido.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.rapido.entity.BookingEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class BookingRepository {

	@PersistenceContext
    private EntityManager entityManager;

	@Transactional
	public int createBooking(String mobile, String src, String dest, String type, String amount) {
		System.out.println("BookingRepository.createBooking() ::::::::::::");

	//	Session session = sessionFactory.getCurrentSession();

		BookingEntity bookingEntity = new BookingEntity();

		bookingEntity.setAmount(amount);
		bookingEntity.setDestination(dest);
		bookingEntity.setRidetype(type);
		bookingEntity.setSource(src);
		bookingEntity.setMobile(mobile);

		entityManager.persist(bookingEntity); // Insert one record in db (ORM)

		if (bookingEntity.getId() > 0) 
		{
			return bookingEntity.getId();
		}

		return 0;
	}

}

package com.rapido.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rapido.entity.BookingEntity;

import jakarta.transaction.Transactional;

@Repository
public class BookingRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public int createBooking(String mobile, String src, String dest, String type, String amount) {

		System.out.println("BookingRepository.createBooking() ::::::::::::");

		Session session = sessionFactory.getCurrentSession();

		BookingEntity bookingEntity = new BookingEntity();

		bookingEntity.setAmount(amount);
		bookingEntity.setDestination(dest);
		bookingEntity.setRidetype(type);
		bookingEntity.setSource(src);
		bookingEntity.setMobile(mobile);

		session.persist(bookingEntity);// Insert one record in database

		if (bookingEntity.getId() > 0) {
			return bookingEntity.getId();
		}

		return 0;
	}
}
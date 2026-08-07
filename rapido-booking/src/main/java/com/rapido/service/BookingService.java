package com.rapido.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapido.repository.BookingRepository;
import com.rapido.request.BookingRequest;
import com.rapido.response.BookingResponse;

import jakarta.transaction.Transactional;

@Service
public class BookingService {

	@Autowired
	BookingRepository bookingRepository;


	public BookingResponse bookRide(BookingRequest bookingRequest) {
		System.out.println("BookingService.bookRide()::::::::::::::::::::");
		BookingResponse bookingResponse = null;
		String mobile = bookingRequest.getMobile();
		String source = bookingRequest.getSource();
		String destination = bookingRequest.getDestination();
		String ridetype = bookingRequest.getRidetype();
		String amount = bookingRequest.getAmount();

		int bookingId = bookingRepository.createBooking(mobile, source, destination, ridetype, amount);
		if (bookingId > 0) {
			bookingResponse = constructResponse();
		}
		return bookingResponse;
	}

	private BookingResponse constructResponse() {
		BookingResponse bookingResponse = new BookingResponse();

		Random random = new Random();

		int eta = random.nextInt(9) + 1;
		int otp = random.nextInt(9000) + 1000;

		bookingResponse.setCarNo("KA05 MX 4321");
		bookingResponse.setEta(eta);
		bookingResponse.setOtp(otp);
		bookingResponse.setRiderName("Kodewala");
		return bookingResponse;
	}

}

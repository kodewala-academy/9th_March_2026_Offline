package com.zepto.invoice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zepto.invoice.entity.InvoiceEntity;
import com.zepto.invoice.repository.InvoiceRespository;
import com.zepto.invoice.request.response.InvoiceRequest;
import com.zepto.invoice.request.response.InvoiceResponse;

@Service
public class InvoiceService {

	@Autowired
	InvoiceRespository invoiceRespository;

	public InvoiceResponse createInvoice(InvoiceRequest invoiceRequest) {

		InvoiceEntity entity = new InvoiceEntity();

		entity.setCutomerName(invoiceRequest.getCutomerName());
		entity.setGst(invoiceRequest.getGst());
		entity.setStatus("PAID");
		entity.setInvId("INV1234");

		entity = invoiceRespository.save(entity);

		InvoiceResponse invoiceResponse = new InvoiceResponse();

		if (entity.getId() > 0) {

			invoiceResponse.setCutomerName(entity.getCutomerName());

			invoiceResponse.setGst(entity.getGst());

			invoiceResponse.setStatus(entity.getStatus());

			invoiceResponse.setInvId(entity.getInvId());

			invoiceResponse.setId(entity.getId());
		}

		return invoiceResponse;
	}

	// Get Invoices with Pagination

	// Redis cache key example:

	// invoices::0-2 invoices::1-10 invoices::2-10

	// First request -> Database Subsequent request -> Redis

	@Cacheable(value = "invoices", key = "#page + '-' + #size")
	public List<InvoiceResponse> getInvoices(int page, int size) {

		System.out.println("Fetching invoices from DATABASE...");

		Pageable pageable = PageRequest.of(page, size);

		Page<InvoiceEntity> result = invoiceRespository.findAll(pageable);

		List<InvoiceResponse> response = new ArrayList<>();

		for (InvoiceEntity invoiceEntity : result) {

			InvoiceResponse invoiceResponse = new InvoiceResponse();

			invoiceResponse.setId(invoiceEntity.getId());

			invoiceResponse.setInvId(invoiceEntity.getInvId());

			invoiceResponse.setCutomerName(invoiceEntity.getCutomerName());

			invoiceResponse.setGst(invoiceEntity.getGst());

			invoiceResponse.setStatus(invoiceEntity.getStatus());

			response.add(invoiceResponse);
		}

		return response;
	}
}
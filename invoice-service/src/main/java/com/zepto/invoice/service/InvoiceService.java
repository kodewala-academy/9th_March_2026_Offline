package com.zepto.invoice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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

}

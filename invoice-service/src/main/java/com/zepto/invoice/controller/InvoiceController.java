package com.zepto.invoice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.invoice.request.response.InvoiceRequest;
import com.zepto.invoice.request.response.InvoiceResponse;
import com.zepto.invoice.service.InvoiceService;

@RestController
@RequestMapping("invoice")
public class InvoiceController {

	@Autowired
	InvoiceService invoiceService;

	private static final Logger log = LoggerFactory.getLogger(InvoiceController.class);

	@PostMapping("create")
	public ResponseEntity<InvoiceResponse> createInvoice(@RequestBody InvoiceRequest invoiceRequest) {

		log.info("Received request to create invoice for customer: {}", invoiceRequest.getCutomerName());

		InvoiceResponse respnse = invoiceService.createInvoice(invoiceRequest);

		log.info("Invoice creation request completed successfully for customer: {}", invoiceRequest.getCutomerName());

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(respnse);
	}

	@GetMapping("listInvoices")
	public ResponseEntity<List<InvoiceResponse>> getAllInvoices(@RequestParam int page, @RequestParam int size) {

		log.info("Received request to fetch invoices - page: {}, size: {}", page, size);

		List<InvoiceResponse> response = invoiceService.getInvoices(page, size);

		log.info("Invoice list request completed successfully - returned {} invoices", response.size());

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
	}

}
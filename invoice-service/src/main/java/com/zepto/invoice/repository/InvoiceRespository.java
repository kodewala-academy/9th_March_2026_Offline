package com.zepto.invoice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.invoice.entity.InvoiceEntity;

@Repository
public interface InvoiceRespository extends CrudRepository<InvoiceEntity, Integer> 
{

}

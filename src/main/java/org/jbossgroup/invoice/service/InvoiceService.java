package org.jbossgroup.invoice.service;

import java.util.List;

import org.jbossgroup.invoice.model.Invoice;

public interface InvoiceService {
	public List<Invoice> findAll();
	public Invoice findById(Long id);
    public Invoice  save(Invoice invoice);
	public void delete(Invoice invoice);
	public Invoice update(Invoice invoice);
	
}

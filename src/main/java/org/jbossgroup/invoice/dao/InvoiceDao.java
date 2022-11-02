package org.jbossgroup.invoice.dao;

import org.jbossgroup.invoice.model.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDao extends CrudRepository<Invoice, Long>  {

	
}

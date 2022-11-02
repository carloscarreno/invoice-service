package org.jbossgroup.invoice.service;

import java.util.List;

import org.jbossgroup.invoice.dao.InvoiceDao;
import org.jbossgroup.invoice.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    
	@Autowired
	private InvoiceDao invoiceDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Invoice> findAll() {
		return (List<Invoice>) invoiceDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Invoice findById(Long id) {
		return invoiceDao.findById(id).orElse(null);
	}

	@Override
	public Invoice save(Invoice invoice) {
		return invoiceDao.save(invoice);
	}

	@Override
	public void delete(Invoice invoice) {
		invoiceDao.delete(invoice);

	}

	@Override
	public Invoice update(Invoice invoice) {
		invoiceDao.deleteById(invoice.getId());
		return invoiceDao.save(invoice);	 
	}

}

package org.jbossgroup.invoice.controller;

import java.util.List;

import org.jbossgroup.invoice.model.Invoice;
import org.jbossgroup.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/invoice")
public class InvoiceController {
    
	@Autowired
	private InvoiceService invoiceService;
	
	@GetMapping("/list")
	public List<Invoice> listar(){
		return invoiceService.findAll();
	}
	
	@GetMapping("/show/{id}")
	public Invoice detalle(@PathVariable Long id) {
		return invoiceService.findById(id);
	}

	
	
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.billing.respository;

import com.paymentchain.billing.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sotobotero
 */
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    
}

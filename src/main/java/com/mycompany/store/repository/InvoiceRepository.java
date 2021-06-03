package com.mycompany.store.repository;
import com.mycompany.store.domain.Invoice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * Spring Data  repository for the Invoice entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    Page<Invoice> findAllByCustomerUserLogin(String s, Pageable pageable);

    Optional<Invoice> findOneByIdAndCustomerUserLogin(Long id, String s);
}

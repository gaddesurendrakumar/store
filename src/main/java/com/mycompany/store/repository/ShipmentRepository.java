package com.mycompany.store.repository;
import com.mycompany.store.domain.Shipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * Spring Data  repository for the Shipment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    Page<Shipment> findAllByInvoiceOrderCustomerUserLogin(String s, Pageable pageable);

    Optional<Shipment> findAllByIdAndInvoiceOrderCustomerUserLogin(Long id, String s);
}

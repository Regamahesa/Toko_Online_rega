package com.tugas.tokoonline.repository;

import com.tugas.tokoonline.model.Order;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findByPemilik(String pemilik);
}

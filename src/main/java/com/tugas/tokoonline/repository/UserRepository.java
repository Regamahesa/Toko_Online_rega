package com.tugas.tokoonline.repository;

import com.tugas.tokoonline.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional <User> findByEmail(String email);
}

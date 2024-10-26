package com.example.demo.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Integer> {

	// Auto generated users with CRUD DB operations.

	Optional<User> findByEmail(String email);
}

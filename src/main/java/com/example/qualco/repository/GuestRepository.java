package com.example.qualco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.qualco.model.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}

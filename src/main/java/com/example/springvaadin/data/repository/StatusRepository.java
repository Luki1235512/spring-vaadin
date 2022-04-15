package com.example.springvaadin.data.repository;

import com.example.springvaadin.data.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}

package com.example.springvaadin.data.repository;

import com.example.springvaadin.data.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

    @Query("select c from Contact c where lower(c.firstName) like lower(concat('%', :filterText, '%'))" +
            " or lower(c.lastName) like lower(concat('%', :filterText, '%'))")
    List<Contact> search(@Param("filterText") String filterText);
}

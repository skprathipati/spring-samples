package com.learning.sdr.repository;

import com.learning.sdr.model.Banks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "banks")
public interface BankRepository extends JpaRepository<Banks, Long> {
}

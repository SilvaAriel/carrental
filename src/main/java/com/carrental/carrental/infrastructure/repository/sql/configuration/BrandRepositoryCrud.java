package com.carrental.carrental.infrastructure.repository.sql.configuration;

import com.carrental.carrental.domain.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepositoryCrud extends CrudRepository<Brand, Integer> {

    Optional<Brand> findByName(String name);
}

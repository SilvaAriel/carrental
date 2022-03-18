package com.carrental.carrental.infrastructure.repository.sql;

import com.carrental.carrental.domain.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepositoryCrud extends CrudRepository<Brand, Integer> {
}

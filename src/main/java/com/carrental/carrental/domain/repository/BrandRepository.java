package com.carrental.carrental.domain.repository;

import com.carrental.carrental.domain.Brand;

import java.util.Optional;

public interface BrandRepository {
    Iterable<Brand> findAllBrands();
    Optional<Brand> findBrandByName(String name);
    Optional<Brand> findBrandById(int id);
}

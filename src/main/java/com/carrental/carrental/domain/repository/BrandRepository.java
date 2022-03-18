package com.carrental.carrental.domain.repository;

import com.carrental.carrental.domain.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> findAllBrands();
    Brand findBrandByName(String name);
    Brand findBrandById(int id);
}

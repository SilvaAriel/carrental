package com.carrental.carrental.infrastructure.repository.sql;

import com.carrental.carrental.domain.Brand;
import com.carrental.carrental.domain.repository.BrandRepository;
import com.carrental.carrental.infrastructure.repository.sql.configuration.BrandRepositoryCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SQLBrandRepository implements BrandRepository {

    private final BrandRepositoryCrud brandRepository;

    @Autowired
    public SQLBrandRepository(final BrandRepositoryCrud brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public Iterable<Brand> findAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Optional<Brand> findBrandByName(String name) {
        return brandRepository.findByName(name);
    }

    @Override
    public Optional<Brand> findBrandById(int id) {
        return brandRepository.findById(id);
    }
}

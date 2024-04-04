package com.smartbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartbudget.entity.Subcategory;

public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {

}

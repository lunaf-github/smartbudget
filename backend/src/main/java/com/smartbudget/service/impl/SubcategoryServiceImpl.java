package com.smartbudget.service.impl;

import org.springframework.stereotype.Service;

import com.smartbudget.dto.SubcategoryDto;
import com.smartbudget.entity.Subcategory;
import com.smartbudget.mapper.SubcategoryMapper;
import com.smartbudget.repository.SubcategoryRepository;
import com.smartbudget.service.SubcategoryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SubcategoryServiceImpl implements SubcategoryService {

    private SubcategoryRepository subcategoryRepository;

    @Override
    public SubcategoryDto createSubcategory(SubcategoryDto subcategoryDto) {
        Subcategory subcategory = SubcategoryMapper.mapToSubcategory(subcategoryDto);
        Subcategory savedSubcategory = subcategoryRepository.save(subcategory);
        return SubcategoryMapper.mapToSubcategoryDto(savedSubcategory);
    }

}

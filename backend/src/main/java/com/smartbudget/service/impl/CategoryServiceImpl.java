package com.smartbudget.service.impl;

import org.springframework.stereotype.Service;

import com.smartbudget.dto.CategoryDto;
import com.smartbudget.entity.Category;
import com.smartbudget.mapper.CategoryMapper;
import com.smartbudget.repository.CategoryRepository;
import com.smartbudget.service.CategoryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.mapToCategory(categoryDto);
        Category savedCategory = categoryRepository.save(category);

        return CategoryMapper.mapToCategoryDto(savedCategory);
    }

}

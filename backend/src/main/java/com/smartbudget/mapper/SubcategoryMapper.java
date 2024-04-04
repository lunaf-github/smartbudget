package com.smartbudget.mapper;

import com.smartbudget.dto.SubcategoryDto;
import com.smartbudget.entity.Subcategory;

public class SubcategoryMapper {
    public static Subcategory mapToSubcategory(SubcategoryDto subcategoryDto) {
        return new Subcategory(
                subcategoryDto.getSubcategoryId(),
                subcategoryDto.getName());
    }

    public static SubcategoryDto mapToSubcategoryDto(Subcategory subcategory) {
        return new SubcategoryDto(
                subcategory.getId(),
                subcategory.getName());
    }
}

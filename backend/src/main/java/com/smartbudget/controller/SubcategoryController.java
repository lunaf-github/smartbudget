package com.smartbudget.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.smartbudget.dto.SubcategoryDto;
import com.smartbudget.service.SubcategoryService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/subcategories")
public class SubcategoryController {

    private SubcategoryService subcategoryService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public SubcategoryDto addSubcategory(SubcategoryDto subcategoryDto) {
        return subcategoryService.createSubcategory(subcategoryDto);
    }

}

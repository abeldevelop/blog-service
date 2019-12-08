package com.abeldevelop.blog.service.service.v1.subcategories.impl;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abeldevelop.blog.service.domain.Subcategory;
import com.abeldevelop.blog.service.service.v1.subcategories.UpdateSubcategoryService;

@Service
public class UpdateSubcategoryServiceImpl implements UpdateSubcategoryService {

    @Override
    @Transactional
    public Subcategory executeUpdate(String code, Subcategory subcategory) {
        throw new NotImplementedException("Not Implemented yet!");
    }
    
}

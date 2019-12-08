package com.abeldevelop.blog.service.service.v1.subcategories.impl;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abeldevelop.blog.service.domain.Subcategory;
import com.abeldevelop.blog.service.service.v1.subcategories.FindSubcategoryByCodeService;

@Service
public class FindSubcategoryByCodeServiceImpl implements FindSubcategoryByCodeService {

    @Override
    @Transactional(readOnly = true)
    public Subcategory executeFindByCode(String code) {
        throw new NotImplementedException("Not Implemented yet!");
    }
    
}

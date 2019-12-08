package com.abeldevelop.blog.service.service.v1.categories.impl;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abeldevelop.blog.service.domain.Category;
import com.abeldevelop.blog.service.service.v1.categories.FindCategoryByCodeService;

@Service
public class FindCategoryByCodeServiceImpl implements FindCategoryByCodeService {

    @Override
    @Transactional(readOnly = true)
    public Category executeFindByCode(String code) {
        throw new NotImplementedException("Not Implemented yet!");
    }
    
}

package com.abeldevelop.blog.service.service.v1.subcategories.impl;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abeldevelop.blog.service.service.v1.subcategories.DeleteSubcategoryService;

@Service
public class DeleteSubcategoryServiceImpl implements DeleteSubcategoryService {

    @Override
    @Transactional
    public void executeDeleteByCode(String code) {
        throw new NotImplementedException("Not Implemented yet!");
    }
    
}

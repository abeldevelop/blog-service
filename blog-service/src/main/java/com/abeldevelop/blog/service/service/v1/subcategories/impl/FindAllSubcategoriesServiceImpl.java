package com.abeldevelop.blog.service.service.v1.subcategories.impl;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abeldevelop.architecture.library.pagination.domain.PageIn;
import com.abeldevelop.architecture.library.pagination.domain.PaginationResult;
import com.abeldevelop.blog.service.domain.Subcategory;
import com.abeldevelop.blog.service.service.v1.subcategories.FindAllSubcategoriesService;

@Service
public class FindAllSubcategoriesServiceImpl implements FindAllSubcategoriesService {

    @Override
    @Transactional(readOnly = true)
    public PaginationResult<Subcategory> executeFindAll(PageIn pageIn, String query) {
        throw new NotImplementedException("Not Implemented yet!");
    }
    
}

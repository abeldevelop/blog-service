package com.abeldevelop.blog.service.service.v1.categories.impl;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abeldevelop.architecture.library.pagination.domain.PageIn;
import com.abeldevelop.architecture.library.pagination.domain.PaginationResult;
import com.abeldevelop.blog.service.domain.Category;
import com.abeldevelop.blog.service.service.v1.categories.FindAllCategoriesService;

@Service
public class FindAllCategoriesServiceImpl implements FindAllCategoriesService {

    @Override
    @Transactional(readOnly = true)
    public PaginationResult<Category> executeFindAll(PageIn pageRequest, String query) {
        throw new NotImplementedException("Not Implemented yet!");
    }
    
}

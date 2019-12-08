package com.abeldevelop.blog.service.service.v1.categories.impl;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abeldevelop.blog.service.domain.Category;
import com.abeldevelop.blog.service.service.v1.categories.CreateCategoryService;

@Service
public class CreateCategoryServiceImpl implements CreateCategoryService {

    @Override
    @Transactional
	public Category executeCreate(Category category) {
        throw new NotImplementedException("Not Implemented yet!");
	}
	
}

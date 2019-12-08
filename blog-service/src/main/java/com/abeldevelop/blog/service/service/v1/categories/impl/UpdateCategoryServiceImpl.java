package com.abeldevelop.blog.service.service.v1.categories.impl;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abeldevelop.blog.service.domain.Category;
import com.abeldevelop.blog.service.service.v1.categories.UpdateCategoryService;

@Service
public class UpdateCategoryServiceImpl implements UpdateCategoryService {

    @Override
    @Transactional
	public Category executeUpdate(String code, Category category) {
	    throw new NotImplementedException("Not Implemented yet!");
	}
	
}

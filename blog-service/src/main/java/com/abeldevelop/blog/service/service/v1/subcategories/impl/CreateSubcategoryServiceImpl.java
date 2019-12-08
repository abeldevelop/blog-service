package com.abeldevelop.blog.service.service.v1.subcategories.impl;

import org.apache.commons.lang.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abeldevelop.blog.service.domain.Subcategory;
import com.abeldevelop.blog.service.service.v1.subcategories.CreateSubcategoryService;

@Service
public class CreateSubcategoryServiceImpl implements CreateSubcategoryService {

    @Override
    @Transactional
	public Subcategory executeCreate(Subcategory category) {
	    throw new NotImplementedException("Not Implemented yet!");
	}
	
}
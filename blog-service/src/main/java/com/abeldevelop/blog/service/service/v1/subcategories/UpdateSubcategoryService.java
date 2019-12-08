package com.abeldevelop.blog.service.service.v1.subcategories;

import com.abeldevelop.blog.service.domain.Subcategory;

public interface UpdateSubcategoryService {

    public Subcategory executeUpdate(String code, Subcategory subcategory);
    
}

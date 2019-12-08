package com.abeldevelop.blog.service.service.v1.subcategories;

import com.abeldevelop.blog.service.domain.Subcategory;

public interface FindSubcategoryByCodeService {

    public Subcategory executeFindByCode(String code);
    
}

package com.abeldevelop.blog.service.service.v1.subcategories;

import com.abeldevelop.architecture.library.pagination.domain.PageIn;
import com.abeldevelop.architecture.library.pagination.domain.PaginationResult;
import com.abeldevelop.blog.service.domain.Subcategory;

public interface FindAllSubcategoriesService {

    public PaginationResult<Subcategory> executeFindAll(PageIn pageIn, String query);
    
}

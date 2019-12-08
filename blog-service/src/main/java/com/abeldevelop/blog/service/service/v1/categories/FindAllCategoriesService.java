package com.abeldevelop.blog.service.service.v1.categories;

import com.abeldevelop.architecture.library.pagination.domain.PageIn;
import com.abeldevelop.architecture.library.pagination.domain.PaginationResult;
import com.abeldevelop.blog.service.domain.Category;

public interface FindAllCategoriesService {

    public PaginationResult<Category> executeFindAll(PageIn pageRequest, String query);
    
}

package com.abeldevelop.blog.service.service.v1.categories;

import com.abeldevelop.blog.service.domain.Category;

public interface UpdateCategoryService {

	public Category executeUpdate(String code, Category category);
	
}

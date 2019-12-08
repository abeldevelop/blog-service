package com.abeldevelop.blog.service.mapper;

import org.springframework.stereotype.Component;

import com.abeldevelop.architecture.library.common.util.StringUtils;
import com.abeldevelop.blog.dto.categories.CategoryResponseResource;
import com.abeldevelop.blog.dto.categories.CreateCategoryRequestResource;
import com.abeldevelop.blog.dto.categories.UpdateCategoryRequestResource;
import com.abeldevelop.blog.service.domain.Category;

@Component
public class CategoryMapper {

	public Category mapResourceToDomain(CreateCategoryRequestResource createCategoryRequestResource) {
		return Category.builder()
				.code(StringUtils.generateUrlName(createCategoryRequestResource.getName()))
				.name(createCategoryRequestResource.getName())
				.build();
	}
	
	public Category mapResourceToDomain(UpdateCategoryRequestResource updateCategoryRequestResource) {
		return Category.builder()
				.code(StringUtils.generateUrlName(updateCategoryRequestResource.getName()))
				.name(updateCategoryRequestResource.getName())
				.build();
	}
	
	public CategoryResponseResource mapDomainToResource(Category category) {
		return CategoryResponseResource.builder()
				.code(category.getCode())
				.name(category.getName())
				.build();
	}
	
}

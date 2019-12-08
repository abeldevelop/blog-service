package com.abeldevelop.blog.service.mapper;

import org.springframework.stereotype.Component;

import com.abeldevelop.architecture.library.common.util.StringUtils;
import com.abeldevelop.blog.dto.subcategories.CreateSubcategoryRequestResource;
import com.abeldevelop.blog.dto.subcategories.SubcategoryResponseResource;
import com.abeldevelop.blog.dto.subcategories.UpdateSubcategoryRequestResource;
import com.abeldevelop.blog.service.domain.Subcategory;

@Component
public class SubcategoryMapper {

	public Subcategory mapResourceToDomain(CreateSubcategoryRequestResource createSubcategoryRequestResource) {
		return Subcategory.builder()
		        .categoryCode(createSubcategoryRequestResource.getCategoryCode())
				.code(StringUtils.generateUrlName(createSubcategoryRequestResource.getName()))
				.name(createSubcategoryRequestResource.getName())
				.build();
	}
	
	public Subcategory mapResourceToDomain(UpdateSubcategoryRequestResource updateSubcategoryRequestResource) {
		return Subcategory.builder()
		        .categoryCode(updateSubcategoryRequestResource.getCategoryCode())
				.code(StringUtils.generateUrlName(updateSubcategoryRequestResource.getName()))
				.name(updateSubcategoryRequestResource.getName())
				.build();
	}
	
	public SubcategoryResponseResource mapDomainToResource(Subcategory subcategory) {
		return SubcategoryResponseResource.builder()
		        .categoryCode(subcategory.getCategoryCode())
				.code(subcategory.getCode())
				.name(subcategory.getName())
				.build();
	}
	
}
